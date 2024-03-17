/**
 *Versão 2, implementado com o ProdutoDAO.java
 *ProdutoDAOImpl.java
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Optional;

public class ProdutoDAOImpl implements ProdutoDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_supermarket";
    private static final String DB_USER = "ligia";
    private static final String DB_PASSWORD = "Lm03101993";
	//private Produto produto;
        
  //___________________________________BUSCA DE PRODUTO PELO CÓDIGO DE BARRAS_____________________________________    
    
    public Produto getByCodigoBarra(String codigoBarra) { //busca por codigo de barras
        Produto produto = new Produto();
        //codigoBarras = codigoBarra; 

        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM produtos WHERE codigoBarras = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                //String codigoBarras = codigoBarra;
				//String codigoBarras ="1234567890123";
				preparedStatement.setString(1, codigoBarra ); 
                
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        //produto.setId(resultSet.getLong("id")); //colocar caso eu use o ID
                        produto.setCodigoBarras(resultSet.getString("codigoBarras"));
                        produto.setDescricao(resultSet.getString("descricao"));
                        produto.setPrecoCompra(resultSet.getDouble("precoCompra"));
                        produto.setPrecoVenda(resultSet.getDouble("precoVenda")); 
                        produto.setQuantidade(resultSet.getInt("quantidade"));
                        produto.setUnidadeMedida(resultSet.getString("unidadeMedida"));  
                        return (produto);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (produto);
    }
//___________________________________INSERÇÃO DE PRODUTOS_____________________________________    
        public Produto inserirProduto (Produto produto) { //inserção de produtos novos
           // Produto novoProduto = new Produto();
           // Produto novoProduto= produto;
            
        	
        	try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
        		String insertQuery = "INSERT INTO produtos (codigoBarras, descricao, precoCompra, precoVenda, quantidade, unidadeMedida) VALUES (?, ?, ?, ?, ?, ?)";
        		
        		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
        			preparedStatement.setString(1, produto.getCodigoBarras());
        			preparedStatement.setString(2, produto.getDescricao());
        			preparedStatement.setDouble(3, produto.getPrecoCompra());
        			preparedStatement.setDouble(4, produto.getPrecoVenda());
        			preparedStatement.setInt(5, produto.getQuantidade());
        			preparedStatement.setString(6, produto.getUnidadeMedida());
        			preparedStatement.executeUpdate();
        			System.out.println("Produto salvo com sucesso!");
        			return (produto);


          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
			return null;
        	
  }
        
        
//___________________________________ALTERAÇÃO DE PRODUTOS_____________________________________    
        
        public void alterarProduto(Produto produto) {
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                String updateQuery = "UPDATE produtos SET descricao = ?, precoCompra = ?, precoVenda = ?, quantidade = ?, unidadeMedida = ? WHERE codigoBarras = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                    preparedStatement.setString(1, produto.getDescricao());
                    preparedStatement.setDouble(2, produto.getPrecoCompra());
                    preparedStatement.setDouble(3, produto.getPrecoVenda());
                    preparedStatement.setInt(4, produto.getQuantidade());
                    preparedStatement.setString(5, produto.getUnidadeMedida());
                    preparedStatement.setString(6, produto.getCodigoBarras());
                    preparedStatement.executeUpdate();
                    System.out.println("Produto alterado com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }        
        
        
    
//___________________________________REMOÇÃO DE PRODUTOS_____________________________________    
        
        public void removerProduto(String codigoBarras) {
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
                String deleteQuery = "DELETE FROM produtos WHERE codigoBarras = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, codigoBarras);
                    preparedStatement.executeUpdate();
                    System.out.println("Produto removido com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    
    
    
    
        
        
        
        
        
    
//---------------------------------------------------------------------------------------------------//
	public Produto SetProdutoDAOImpl(Produto produto) {
		return produto;
	}

	public Produto SetProdutoDAOImpl() {
		// TODO Auto-generated method stub
		return null;}
	
	public Produto getInserirProduto() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removerProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	public Produto getRemoverProduto() {
		// TODO Auto-generated method stub
		return null;
	}
	public Produto removerProduto() {
		// TODO Auto-generated method stub
		return null;
	}
	public Produto alterarProduto() {
		// TODO Auto-generated method stub
		return null;
	}
//	@Override
//	public Produto inserirProduto(Produto produto) {
//		return produto;
//		// TODO Auto-generated method stub
//		
//	}



//	@Override
//	public Optional<Produto> getByCodigoBarra(String codigoBarras) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}


}

//    @Override
//    public Optional<Produto> getByCodigoBarra(String codigoBarras) {
//    	Produto produto = new Produto();
//    	
//        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
//            String query = "SELECT * FROM produtos WHERE codigoBarras = ?";
//            
//            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//            	String cB = "1234567890123";
//                preparedStatement.setString(1, cB); 
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    if (resultSet.next()) { 
//                        //Produto produto = new Produto();
//                       //produto.setId(resultSet.getLong("id"));
//                        produto.setCodigoBarras(resultSet.getString("codigo_barras"));
//                        produto.setDescricao(resultSet.getString("descricao"));
//                        produto.setPrecoCompra(resultSet.getDouble("precoCompra"));
//                        produto.setPrecoVenda(resultSet.getDouble("precoVenda"));
//                        produto.setQuantidade(resultSet.getInt("quantidade"));       
//                        produto.setUnidadeMedida(resultSet.getString("unidadeMedida"));
//                       // System.out.println("Testando"+produto.getCodigoBarras());
//                        return Optional.of(produto);
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return Optional.empty();                  
//    }
//    public void saveProd(Produto produto) {
//        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
//            String insertQuery = "INSERT INTO produtos (codigo_barras, descricao, preco_compra, preco_venda, quantidade, unidade_medida) VALUES (?, ?, ?, ?, ?, ?)";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
//                preparedStatement.setString(1, produto.getCodigoBarras());
//                preparedStatement.setString(2, produto.getDescricao());
//                preparedStatement.setDouble(3, produto.getPrecoCompra());
//                preparedStatement.setDouble(4, produto.getPrecoVenda());
//                preparedStatement.setDouble(5, produto.getQuantidade());
//                preparedStatement.setString(6, produto.getUnidadeMedida());
//                preparedStatement.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    
//    @Override
//    public Optional<Produto> buscaCodigoBarra(String codigoBarras) {
//        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
//            String query = "SELECT * FROM produtos WHERE codigoBarras = ?";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//                preparedStatement.setString(1, codigoBarras);  
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    if (resultSet.next()) {
//                        Produto produto = new Produto();
//                       //produto.setId(resultSet.getLong("id"));
//                        produto.setCodigoBarras(resultSet.getString("codigo_barras"));
//                        produto.setDescricao(resultSet.getString("descricao"));
//                        produto.setPrecoCompra(resultSet.getDouble("precoCompra"));
//                        produto.setPrecoVenda(resultSet.getDouble("precoVenda"));
//                        produto.setQuantidade(resultSet.getInt("quantidade"));       
//                        produto.setUnidadeMedida(resultSet.getString("unidadeMedida"));                       
//
//                      // System.out.println("Testando"+produto.getCodigoBarras());
//                        return Optional.of(produto);
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return Optional.empty();
//    
//    }
//    
//    private String codigoBarras;
//    private String descricao;
//    private double precoCompra;
//    private double precoVenda;
//    private int quantidade;
//    private String unidadeMedida;
//
//    @Override
//    public List<Produto> getAll() {
//        List<Produto> produtos = new ArrayList<>();
//        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
//            String query = "SELECT * FROM produtos";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
//                 ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    Produto produto = new Produto();
//                    produto.setId(resultSet.getLong("id"));
//                    produto.setCodigoBarras(resultSet.getString("codigo_barras"));// Preencher os demais campos do produto
//                    
//                    produtos.add(produto);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return produtos;
//    }
//
//    @Override
//    public void save(Produto produto) {// Implementação para salvar um novo produto no banco de dados, a duvida é se é em java ou é em SQL?
//        
//    }
//
//    @Override
//    public void update(Produto produto) { // Implementação para atualizar um produto existente no banco de dados
//       
//    }
//
//    @Override
//    public void delete(long id) {  // Implementação para excluir um produto pelo ID no banco de dados
//      
//    }
//------------------------------------------------------------------------------------------------------------------


//
//

