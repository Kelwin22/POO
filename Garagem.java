package estacionamento;

public class Garagem {
    public static void processarVeiculo(Veiculo veiculo) {
        if (veiculo.podeEstacionar()) {
            System.out.println("Tipo de Veículo: " + veiculo.getTipo());
            System.out.println("Peso: " + veiculo.getPeso() + " ton");
            System.out.println("Tarifa por hora: R$ " + veiculo.calcularTarifa());
        } else {
            System.out.println("O veículo não pode ser estacionado.");
        }
    }
}
