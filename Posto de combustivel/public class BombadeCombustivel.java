public class BombadeCombustivel {
    // Criando os atributos
    private String tipoCombustivel;
    double valorLitro;
    double quantidadeCombustivel;
    double totalAbastecido;

    // Criando o construtor
    public BombadeCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.totalAbastecido = 0.0;
    }

    // Abastecendo pelo valor do litro
    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            totalAbastecido += valor;
            System.out.println("Abastecido: " + litrosAbastecidos + " litros.");
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    // Abastecendo por litro
    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            totalAbastecido += valorPagar;
            System.out.println("Valor a pagar: R$" + valorPagar);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    // Alteração do tipo de combustível
    public void alterarCombustivel(String novoTipoCombustivel) {
        this.tipoCombustivel = novoTipoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoTipoCombustivel);
    }

    // Total abastecido
    public double getTotalAbastecido() {
        return totalAbastecido;
    }
}
