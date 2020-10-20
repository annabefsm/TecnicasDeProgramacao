package model;

public class Produto {
    private String codigo;
    private String nome;
    private String categoria;
    private int peso;
    private String fabricante;
    private String modelo;
    private String dimensaoAltura;
    private String dimensaoComprimento;
    private String dimensaoProfundidade;
    
    public Produto(String codigo, String nome, String categoria, int peso, String fabricante, String modelo, String dimensaoAltura, String dimensaoComprimento, String dimensaoProfundidade){
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.dimensaoAltura = dimensaoAltura;
        this.dimensaoComprimento = dimensaoComprimento;
        this.dimensaoProfundidade = dimensaoProfundidade;
    }
    

    
    /**
     * @return String return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return int return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return String return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return String return the dimensaoAltura
     */
    public String getDimensaoAltura() {
        return dimensaoAltura;
    }

    /**
     * @param dimensaoAltura the dimensaoAltura to set
     */
    public void setDimensaoAltura(String dimensaoAltura) {
        this.dimensaoAltura = dimensaoAltura;
    }

    /**
     * @return String return the dimensaoComprimento
     */
    public String getDimensaoComprimento() {
        return dimensaoComprimento;
    }

    /**
     * @param dimensaoComprimento the dimensaoComprimento to set
     */
    public void setDimensaoComprimento(String dimensaoComprimento) {
        this.dimensaoComprimento = dimensaoComprimento;
    }

    /**
     * @return String return the dimensaoProfundidade
     */
    public String getDimensaoProfundidade() {
        return dimensaoProfundidade;
    }

    /**
     * @param dimensaoProfundidade the dimensaoProfundidade to set
     */
    public void setDimensaoProfundidade(String dimensaoProfundidade) {
        this.dimensaoProfundidade = dimensaoProfundidade;
    }
    public void printaProduto() {
        // TODO Auto-generated method stub
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Peso: " + this.peso);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("DimensaoAltura: " + this.dimensaoAltura);
        System.out.println("DimensaoComprimento: " + this.dimensaoComprimento);
        System.out.println("DimensaoProfundidade: " + this.dimensaoProfundidade);
    }


}