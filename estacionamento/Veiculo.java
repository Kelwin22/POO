package estacionamento;

public abstract class Veiculo {
    protected String tipo;
    protected double peso;

    public Veiculo(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public abstract double calcularTarifa();
    public String getTipo() {
        return tipo;
    }
    public double getPeso() {
        return peso;
    }
    public abstract boolean podeEstacionar();
}
