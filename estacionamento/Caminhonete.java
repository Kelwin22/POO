package estacionamento;

public class Caminhonete extends Veiculo {
    private boolean carregada;

    public Caminhonete(double peso, boolean carregada) {
        super("Caminhonete", peso);
        this.carregada = carregada;
    }

    @Override
    public double calcularTarifa() {
        if (carregada) {
            return 50.00;
        } else {
            return 25.00;
        }
    }

    @Override
    public boolean podeEstacionar() {
        return peso <= 6;
    }
}
