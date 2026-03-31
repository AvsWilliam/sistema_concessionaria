public class SistemaConcessionaria {
    public static void main(String[] args) {
        Concessionaria minhaLoja = new Concessionaria();

        // Criando um objeto VeiculoNovo (Polimorfismo)
        // Note que não usamos aspas em números (Integer e Double)
        Veiculo v2 = new VeiculoNovo("chevrolet", "Vectra", 1999, 65000.0, 3);
        Veiculo v1 = new VeiculoUsado("Chevrolet","Astra",1998,23000.0,8000,true);

        // Cadastrando
        minhaLoja.cadastrarVeiculo(v1);

        // Exibindo (O toString() chamará o seu getDescricao() sobrescrito)
        minhaLoja.exibirEstoque();

        // Vendendo (A chave deve bater exatamente com Marca-Modelo-Ano)
        minhaLoja.registrarVenda("chevrolet-Astra-1998-2300.0-8000");
        
        minhaLoja.exibirVendas();
    }
}