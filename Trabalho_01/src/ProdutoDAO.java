/**
 *Interface 
 */
//import java.util.List;
//import java.util.Optional;

public interface ProdutoDAO {
	Produto getByCodigoBarra(String codigoBarra);
    Produto inserirProduto(Produto produto);
    void alterarProduto(Produto produto);
    void removerProduto(Produto produto);



	//Optional<Produto> getByCodigoBarra(String codigoBarras);	
  //  List<Produto> getAll();
//    void update(Produto produto);
//    void delete(String codigoBarras);
//	void inserirProduto(Produto novoProduto);
	//Optional<Produto> getByCodigoBarra(String id);	
}
