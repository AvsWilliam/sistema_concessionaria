import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concessionaria {

    private Map<String, Veiculo> veiculos;
    private List<Veiculo> vendas;

    public Concessionaria() {
        this.veiculos = new HashMap<>();
        this.vendas = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        // Usando getters para respeitar o encapsulamento
        String chave = veiculo.getMarca() + "-" + veiculo.getModelo() + "-" + veiculo.getAno();
        veiculos.put(chave, veiculo);
        System.out.println("Veículo Cadastrado com Sucesso!!!");
    }

    public void registrarVenda(String chave) {
        if (veiculos.containsKey(chave)) {
            Veiculo vendido = veiculos.remove(chave);
            vendas.add(vendido);
            System.out.println("Veículo movido do estoque para a lista de vendas!");
        } else {
            System.out.println("Erro: Veículo não encontrado no estoque.");
        }
    }

    public void exibirEstoque() {
        System.out.println("--- Exibindo Estoque ---");
        for (Veiculo v : veiculos.values()) {
            // Chamando o método de descrição que você sobrescreveu
            System.out.println(v.getDescricao());
        }
    }

    public void exibirVendas() {
        System.out.println("--- Exibindo Vendas ---");
        for (Veiculo v : vendas) {
            System.out.println(v.getDescricao());
        }
    }
}