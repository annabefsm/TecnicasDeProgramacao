package model;

public class Entrega {
    private String enderecoA;
    private String enderecoB;
    private double valor;
    private String codigoProduto;
    
    
    Entrega(String enderecoA, String enderecoB, double valor,String codigoProduto){
        this.enderecoA = enderecoA;
        this.enderecoB = enderecoB;
        this.valor = valor;
        this.codigoProduto = codigoProduto;
    }


    /**
     * @return String return the enderecoA
     */
    public String getEnderecoA() {
        return enderecoA;
    }

    /**
     * @param enderecoA the enderecoA to set
     */
    public void setEnderecoA(String enderecoA) {
        this.enderecoA = enderecoA;
    }

    /**
     * @return String return the enderecoB
     */
    public String getEnderecoB() {
        return enderecoB;
    }

    /**
     * @param enderecoB the enderecoB to set
     */
    public void setEnderecoB(String enderecoB) {
        this.enderecoB = enderecoB;
    }

    /**
     * @return double return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return String return the codigoProduto
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void printarEntrega() {
		System.out.println("EnderecoA: " + this.enderecoA);
		System.out.println("EnderecoB: " + this.enderecoB);
		System.out.println("Valor: " + this.valor);
		System.out.println("Codigo do Produto: " + this.codigoProduto);
	}
}