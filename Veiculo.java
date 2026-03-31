abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected Integer ano;
    protected Double preco;
    
    // Construtor que você já criou [cite: 22, 26]
    public Veiculo(String marca, String modelo, Integer ano, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // MÉTODOS QUE O COMPILADOR ESTÁ PROCURANDO:
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Integer getAno() { return ano; }

    public abstract String getDescricao();
}