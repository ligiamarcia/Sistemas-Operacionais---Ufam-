//import java.util.Optional;

/**
 *
 */
import java.util.Scanner;


public class Supermercado {
    public static void main(String[] args) {
    	inserirProdutoInterface();
    	
    	
    	
    }
   
//___________________________________USUARIO DEVE ESCOLHER QUAL OPCAO ELE QUER_____________________________________    
//
//    	Scanner scan = new Scanner(System.in);
//    	int opcao;
//        do {
//            //opcao = scan.nextInt();
//
//            System.out.println("Escolha uma opção a seguir:");
//            System.out.println("1. Buscar produto");
//            System.out.println("2. Inserir produto");
//            System.out.println("3. Alterar produto");
//            System.out.println("4. Remover produto");
//            System.out.println("5. Sair");
//            System.out.print("Digite o número da opção desejada: ");
//           
//            opcao = scan.nextInt();
//            switch (opcao) {
//                case 1:
//                    buscarProduto();
//                    break;
//                case 2:
//                    inserirProduto();
//                    break;
//                case 3:
//                    alterarProduto();
//                    break;
//                case 4:
//                    removerProduto();
//                    break;
//                case 5:
//                    System.out.println("Encerrando o programa. Até logo!");
//                    break;
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//            }
//            opcao = scan.nextInt();
//
//        } while (opcao != 5);
//        
//        scan.close(); 
//    }
//    
// 
		
    
    //_Metodos
//___________________________________BUSCA DE PRODUTO PELO CÓDIGO DE BARRAS_____________________________________    
    
    public static void buscarProduto() {   //busca por codigo de barras 	
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o codigo do produto a ser buscado...");
        String chave = scan.nextLine(); // a chave é a string codigo de barras

    	ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();//ok
        Produto novoProduto = new Produto();
        
        
        novoProduto = produtoDAOImpl.getByCodigoBarra(chave);   
        
        System.out.println("Código de Barras:"+ novoProduto.getCodigoBarras());
        System.out.println("Descrição do Produto:"+ novoProduto.getDescricao());
        System.out.println("Preço de Compra:"+ novoProduto.getPrecoCompra());
        System.out.println("Preço de Venda:" + novoProduto.getPrecoVenda());
        System.out.println("Quantidade:" + novoProduto.getQuantidade());
        System.out.println("Unidade de Medida:" + novoProduto.getUnidadeMedida());
     
        scan.close();

    }
//___________________________________INSERÇÃO DE PRODUTOS_____________________________________    

    public static void inserirProdutoInterface() {
        Produto novoProduto = new Produto(); 
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite o código de Barras: ");
        String RCodigoBarras = scan.nextLine();
        novoProduto.setCodigoBarras(RCodigoBarras);
        
        System.out.println("Digite o Preço de Compra: ");
        double RPrecoCompra = scan.nextDouble();
        novoProduto.setPrecoCompra(RPrecoCompra);
        
        
        System.out.println("Digite o Preço de Venda: ");
        double RPrecoVenda = scan.nextDouble();
        novoProduto.setPrecoCompra(RPrecoVenda);
        
        System.out.println("Digite a quantidade: ");
        double RQuantidade = scan.nextDouble();
        novoProduto.setPrecoCompra(RQuantidade);
        
        
        System.out.println("Digite a quantidade: ");
        String RUnidadeMedida = scan.nextLine();
        novoProduto.setUnidadeMedida(RUnidadeMedida);
        
        scan.close();
    	ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
    	produtoDAOImpl.inserirProduto(novoProduto);  
        System.out.println("Inserindo produto...");




    }        
        

        
        
        
 
        
        
        //System.out.println("Preço de Compra:" + String.valueOf(setPrecoCompra(RPrecoCompra)));

        
//        System.out.println("Descrição do Produto:"+ novoProduto.getDescricao());
//        System.out.println("Preço de Compra:"+ novoProduto.getPrecoCompra());
//        System.out.println("Preço de Venda:" + novoProduto.getPrecoVenda());
//        System.out.println("Quantidade:" + novoProduto.getQuantidade());
//        System.out.println("Unidade de Medida:" + novoProduto.getUnidadeMedida());

//___________________________________ALTERAÇÃO DE PRODUTOS_____________________________________    

    public static void alterarProduto() {
        System.out.println("Alterando produto...");
    	ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();
        Produto novoProduto = new Produto();
        novoProduto = produtoDAOImpl.alterarProduto();
        
        System.out.println("Código de Barras:"+ novoProduto.getCodigoBarras());
        System.out.println("Descrição do Produto:"+ novoProduto.getDescricao());
        System.out.println("Preço de Compra:"+ novoProduto.getPrecoCompra());
        System.out.println("Preço de Venda:" + novoProduto.getPrecoVenda());
        System.out.println("Quantidade:" + novoProduto.getQuantidade());
        System.out.println("Unidade de Medida:" + novoProduto.getUnidadeMedida());     
    }

//    public static void removerProduto() {
//        System.out.println("Removendo produto...");
//    	ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();//ok
//        Produto novoProduto = new Produto();//ok 
//        novoProduto = produtoDAOImpl.removerProduto();    
//        
//    } 
//    
}    
        
//Scanner scan = new Scanner(System.in);
//ProdutoDAOImpl produtoDAOImpl = new ProdutoDAOImpl();//ok
//Produto novoProduto = new Produto();//ok 
//novoProduto = produtoDAOImpl.getByCodigoBarra();      
//
//


// Produto novoProduto = new Produto();
//ProdutoDB produtoDB = new ProdutoDB();
//novoProduto = produtoDB.SetProdutoDB();
//System.out.println("Código de Barras:"+ novoProduto.getCodigoBarras());
//System.out.println("Descrição do Produto:"+ novoProduto.getDescricao());
//System.out.println("Preço de Compra:"+ novoProduto.getPrecoCompra());
//System.out.println("Preço de Venda:" + novoProduto.getPrecoVenda());
//System.out.println("Quantidade:" + novoProduto.getQuantidade());
//System.out.println("Unidade de Medida:" + novoProduto.getUnidadeMedida());
//      
//        // -------------------------------------Escolher entre opções-------------------------------------------
//
//
//        int opcao;
//        do {
//            System.out.println("Escolha uma opção:");
//            System.out.println("1. Cadastrar novo produto");
//            System.out.println("2. Consultar produtos");
//            System.out.println("3. Sair");
//            System.out.print("Digite o número da opção desejada: ");
//            opcao = scan.nextInt(); 
//            
//            
//            
//            
//        // -------------------------------------Escolher entre opções-------------------------------------------
//        switch (opcao) {
//        case 1: //nesse caso ainda falta adicionar o produto (inserir)
//            System.out.print("Por favor preencha os campos abaixo \n ");
//
//            System.out.print("Código de barras: ");
//            novoProduto.setCodigoBarras(scan.nextLine());
//            
//            System.out.print("Descrição do produto: ");
//            novoProduto.setDescricao(scan.nextLine());
//
//            System.out.print("Valor de Compra: ");
//            novoProduto.setPrecoCompra(scan.nextDouble());
//
//            System.out.print("Valor de Venda: ");
//            novoProduto.setPrecoVenda(scan.nextDouble());
//
//            System.out.print("Quantidade: ");
//            novoProduto.setQuantidade(scan.nextInt());
//
//            System.out.print("Unidade de Medida: ");
//            novoProduto.setUnidadeMedida(scan.nextLine());
//            break;
//            
//            
//            
//            
//        case 2:  //verificar a lista toda dos produtos
//           // consultarProdutos();
//            break;
//            
//            
//            
//            
//        default:
//            System.out.println("Opção inválida. Tente novamente.");
//    }
//            

//            novoProduto.setCodigoBarras("123456789");
//            novoProduto.setDescricao("Farinha");
//            novoProduto.setPrecoCompra(5.0);
//            novoProduto.setPrecoVenda(8.0);
//            novoProduto.setQuantidade(100);
//            novoProduto.setUnidadeMedida("kg");
//            break;
           
//            
//        case 3:
//            System.out.println("Encerrando o programa. Até logo!");
//            break;
//} while (opcao != 3);
//
//scan.close();     
//        cadas produto        
//        System.out.print("Digite o código de barras: ");
//        novoProduto.setCodigoBarras(scanner.nextLine());
//        fechar o scanner
//        scanner.close();
//        
// Cadastrar um novo produto
//        novoProduto.setCodigoBarras("123456789");
//        novoProduto.setDescricao("Farinha");
//        novoProduto.setPrecoCompra(5.0);
//        novoProduto.setPrecoVenda(8.0);
//        novoProduto.setQuantidade(100);
//        novoProduto.setUnidadeMedida("kg");
//        produtoDAO.save(novoProduto);
// Buscar um produto pelo codeigo de barras
//        long produtoId = 1; // ID do produto desejado
  //      produtoDAO.getById(produtoId).ifPresent(System.out::println);

        // Listar todos os produtos
        // produtoDAO.getAll().forEach(System.out::println);

        // Atualizar um produto existente
        //Produto produtoExistente = produtoDAO.getById(produtoId).orElse(null);
        //if (produtoExistente != null) {
          //  produtoExistente.setPrecoVenda(9.0);
            //produtoDAO.update(produtoExistente);


        // Excluir um produto pelo ID
        //long produtoIdParaExcluir = 2; // ID do produto a ser excluído
        //produtoDAO.delete(produtoIdParaExcluir);

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Supermercado{
//    public static void main(String[] args) {
//        try (Connection connection = DatabaseConnection.getConnection()) {
//            String selectQuery = "SELECT * FROM produtos";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
//                 ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    String descricao = resultSet.getString("descricao");
//                    double precoVenda = resultSet.getDouble("preco_venda");
//                    System.out.println("Produto: " + descricao + ", Preço de Venda: " + precoVenda);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}