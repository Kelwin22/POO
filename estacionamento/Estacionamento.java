package estacionamento;

import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Informe o tipo de veículo (motocicleta, carro, caminhonete, furgão): ");
            String tipo = scanner.nextLine();

            Veiculo veiculo = null;

            switch (tipo.toLowerCase()) {
                case "motocicleta":
                    System.out.println("Informe o peso da motocicleta (em kg): ");
                    double pesoMoto = scanner.nextDouble();
                    veiculo = new Motocicleta(pesoMoto);
                    break;

                case "carro":
                    System.out.println("Informe o peso do carro (em ton): ");
                    double pesoCarro = scanner.nextDouble();
                    System.out.println("Informe a categoria do carro (hatchback, sedan, suv): ");
                    scanner.nextLine();  
                    String categoriaCarro = scanner.nextLine();
                    veiculo = new CarroPasseio(pesoCarro, categoriaCarro);
                    break;

                case "caminhonete":
                    System.out.println("Informe o peso da caminhonete (em ton): ");
                    double pesoCaminhonete = scanner.nextDouble();
                    System.out.println("A caminhonete está carregada? (true/false): ");
                    boolean carregada = scanner.nextBoolean();
                    veiculo = new Caminhonete(pesoCaminhonete, carregada);
                    break;

                case "furgão":
                    System.out.println("Informe o peso do furgão (em ton): ");
                    double pesoFurgao = scanner.nextDouble();
                    System.out.println("Informe o volume do furgão (em m3): ");
                    double volumeFurgao = scanner.nextDouble();
                    System.out.println("O furgão está carregado? (true/false): ");
                    boolean furgaoCarregado = scanner.nextBoolean();
                    veiculo = new Furgao(pesoFurgao, furgaoCarregado, volumeFurgao);
                    break;

                default:
                    System.out.println("Tipo de veículo inválido.");
            }

            if (veiculo != null) {
                Garagem.processarVeiculo(veiculo);
            }

            System.out.println("Deseja informar outro veículo? (sim/não): ");
            scanner.nextLine();
            opcao = scanner.nextLine();

        } while (opcao.equalsIgnoreCase("sim"));

        scanner.close();
    }
}
