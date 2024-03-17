
/**
 *
 */
import java.util.ArrayList;
import java.util.List;
// no banco de dados tem a data : usar a classe do java (date)


public class Venda {
	//private final int idVenda;
    private List<Produto> produtosVendidos;
    private double totalCompra;   //valor de todos os produtos, acumulador de valores de todos os prods
    private double totalPagamento; // quanto o cliente deu para o pagamento
    private String tipoPagamento; // pode ser dinheiro, cartao credito ou cartao de debito
    private double troco; // totalPagamento - totalCompra

    
    
    //construtores aqui
    
    
    public Venda() {
    	//this. //verificar dado do bacno de dados
        produtosVendidos = new ArrayList<>();
        totalCompra = 0.0;
        tipoPagamento = "";
        totalPagamento = 0.0;
        troco = 0.0;
    }
    
    // Getters e setters para os campos 
    
    
    //-------------------------------------//    
    //getter para produtosVendidos
    public List<Produto> getProdutosVendidos(){
    	return produtosVendidos;
    }
    
    //getter para  totalCompra
    public double getTotalCompra(){
    	return totalCompra;
    }  
    
  //getter para totalPagamento
    public double getTotalPagamento(){
    	return totalPagamento;
    }
     
   //getter para tipoPagamento
    public String getTipoPagamento(){
    	return tipoPagamento;
    }  
    
   //getter para troco
    public double getTroco(){
    	return troco;
    } 
    
    //-------------------------------------//    
    

    //setter para produtosVendidos
    public List<Produto> setProdutosVendidos(){
    	return produtosVendidos;
    }
    //getter para  totalCompra
    public double setTotalCompra(){
    	return totalCompra;
    }     
    //getter para totalPagamento
    public double setTotalPagamento(){
    	return totalPagamento;
    }
   //setter para tipoPagamento
    public String setTipoPagamento(){
    	return tipoPagamento;
    }    
   //setter para troco    
    public double setTroco(){
    	return troco;
    }  
    //-------------------------------------//    


    
    //metodos
  
    public void adicionarProdutoVendido(Produto produto, double quantidade) {
        produtosVendidos.add(produto);
        totalCompra += produto.getPrecoVenda() * quantidade;  
       
    }
    public void calcularTotalPagamento(double valorPago) {
        totalPagamento = valorPago;
        troco = totalPagamento - totalCompra;
    }
    @Override
    public String toString() {
        return "Venda{" +
                "produtosVendidos=" + produtosVendidos +
                ", totalCompra=" + totalCompra +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", totalPagamento=" + totalPagamento +
                ", troco=" + troco +
                '}';
    }
}
