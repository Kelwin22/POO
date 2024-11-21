public class Cidade {
    private String nome;
    private String uf;
    private boolean isCapital;

    public Cidade(String uf, String nome, boolean isCapital) {
        this.uf = uf;
        this.nome = nome;
        this.isCapital = isCapital;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCapital(boolean isCapital) {
        this.isCapital = isCapital;
    }

    @Override
    public String toString() {
        return nome + " - " + uf + (isCapital ? " (Capital)" : "");
    }
}
