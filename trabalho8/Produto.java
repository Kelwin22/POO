public class Produto {
    private int id;
    private String tipo;
    private String descricao;
    private double peso;
    private int quantidade;
    private String unidadeMedida;

    public Produto(int id, String tipo, String descricao, double peso, int quantidade, String unidadeMedida) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", tipo=" + tipo + ", descricao=" + descricao + ", peso=" + peso + ", quantidade="
                + quantidade + ", unidadeMedida=" + unidadeMedida + "]";
    }
}
