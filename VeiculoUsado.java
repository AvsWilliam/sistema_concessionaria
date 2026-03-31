public class VeiculoUsado extends Veiculo {
    private Integer quilometragem;
    private boolean unicoDono;

    // O nome deve ser igual ao da classe: VeiculoUsado
    public VeiculoUsado(String marca, String modelo, Integer ano, Double preco, Integer quilometragem, boolean unicoDono) {
        super(marca, modelo, ano, preco); // Chama o construtor da classe pai (Veiculo)
        this.quilometragem = quilometragem;
        this.unicoDono = unicoDono;
    }

    @Override
    public String getDescricao() { // Adicionado o tipo String
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + 
               ", KM: " + quilometragem + ", Único Dono: " + (unicoDono ? "Sim" : "Não");
    }
}