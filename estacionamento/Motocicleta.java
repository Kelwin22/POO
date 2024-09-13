package estacionamento;

public class Motocicleta extends Veiculo {
    public Motocicleta(double peso) {
        super("Motocicleta", peso);
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 100) {
            return 2.00;
        } else if (peso <= 299.9) {
            return 4.00;
        } else {
            return 10.00;
        }
    }

    @Override
    public boolean podeEstacionar() {
        return peso <= 400;
    }
}
