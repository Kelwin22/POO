public class Gerente extends Funcionario {
    String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.03f;
    }

    @Override
    public PessoaInfo getInfo() {
        return new PessoaInfo(nome, "Gerente", "Área: " + area + ", Salário: " + salario + ", Imposto: " + calculaImposto() + ", Nascimento: " + nascimento);
    }
}
