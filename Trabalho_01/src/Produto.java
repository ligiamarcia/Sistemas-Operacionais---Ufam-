/**
 *
 */

// No banco de daods usei codigoBarras, descricao, precoCompra,precoVenda,quantidade,unidadeMedida

public class Produto {
    private String codigoBarras;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;
    private String unidadeMedida;
   

    //Construtor
    public Produto(String codigoBarras, String descricao, double precoCompra, double precoVenda, int quantidade,String unidadeMedida) {
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

	public Produto() {
	}

	// Getters
    public String getCodigoBarras() {
        return codigoBarras;    }
    

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    
    // Setters
    
	public String setCodigoBarras(String codigoBarras) {
		return this.codigoBarras = codigoBarras;
	}

    public String setDescricao(String descricao) {
        return this.descricao = descricao;
    }
    
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    
//    public void setPrecoCompra() {
//    }


    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public void setPrecoVenda() {
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setQuantidade() {
    }
    
    public void setUnidadeMedida(String unidadeMedida) {
    	 this.unidadeMedida = unidadeMedida;
    }
  
   
    @Override
    public String toString() {
        return "Produto{" +
                "codigoBarras='" + codigoBarras + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoCompra=" + precoCompra +
                ", precoVenda=" + precoVenda +
                ", quantidade=" + quantidade +
                ", unidadeMedida=" + unidadeMedida+'}';                
                
    }

}
    
    
    

