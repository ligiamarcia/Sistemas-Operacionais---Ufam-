
/**
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.util.Optional;


public class ProdutoDB {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_supermarket";
    private static final String DB_USER = "ligia";
    private static final String DB_PASSWORD = "Lm03101993";	
	public ProdutoDB() {
	}
	//metodo setar produto
	public Produto SetProdutoDB() { //esse metodo está sendo acessado no supermercado(main)
        Produto produto = new Produto();        
//        try
//        {
//        	Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
		try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) 
	      {
	            String query = "SELECT * FROM produtos WHERE codigoBarras = ?";
	            //System.out.println(query);
	            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) 
	            {
	                String cB = "1234567890123";
					preparedStatement.setString(1, cB ); // aqui estou passando o codigo de barras como parametro
					
	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    if (resultSet.next()) {
	                       //produto.setId(resultSet.getLong("id"));
	                        produto.setCodigoBarras(resultSet.getString("codigoBarras"));
	                        produto.setDescricao(resultSet.getString("descricao"));
	                        produto.setPrecoCompra(resultSet.getDouble("precoCompra"));
	                        produto.setPrecoVenda(resultSet.getDouble("precoVenda"));
	                        produto.setQuantidade(resultSet.getInt("quantidade"));       
	                        produto.setUnidadeMedida(resultSet.getString("unidadeMedida"));                       

	                       //System.out.println("Testando"+produto.getCodigoBarras());
	                        return produto;
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	      return produto;
	    }

}

	

