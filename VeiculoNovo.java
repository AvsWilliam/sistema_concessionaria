public class VeiculoNovo extends Veiculo {
    private Integer garantiaAnos;

    public VeiculoNovo(String marca, String modelo, Integer ano, Double preco, Integer garantiaAnos) {
        super(marca, modelo, ano, preco);
        this.garantiaAnos = garantiaAnos;
    }

    @Override
    public String getDescricao() { // Adicionado o tipo String
        // Assumindo que marca, modelo e ano são protected na classe Veiculo
        // Adicionei espaços para a saída ficar legível
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Garantia: " + garantiaAnos + " anos";
    }
}