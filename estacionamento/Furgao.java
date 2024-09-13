package estacionamento;

public class Furgao extends Veiculo {
    private boolean carregado;
    private double volume;

    public Furgao(double peso, boolean carregado, double volume) {
        super("Furgão", peso);
        this.carregado = carregado;
        this.volume = volume;
    }

    @Override
    public double calcularTarifa() {
        if (carregado) {
            return 50.00;
        } else {
            return 25.00;
        }
    }

    @Override
    public boolean podeEstacionar() {
        return peso <= 6 && volume <= 18;
    }
}
