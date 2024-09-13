package estacionamento;

public class CarroPasseio extends Veiculo {
    private String categoria;

    public CarroPasseio(double peso, String categoria) {
        super("Carro de Passeio", peso);
        this.categoria = categoria;
    }

    @Override
    public double calcularTarifa() {
        if (peso > 2) {
            return 50.00; // Classificado como Furgão carregado
        } else {
            switch (categoria.toLowerCase()) {
                case "hatchback":
                    return 13.00;
                case "sedan":
                    return 15.00;
                case "suv":
                    return 20.00;
                default:
                    return 0.00;
            }
        }
    }

    @Override
    public boolean podeEstacionar() {
        return peso <= 2;
    }
}
