public class Funcionario extends Pessoa {
    float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.05f;
    }

    @Override
    public PessoaInfo getInfo() {
        return new PessoaInfo(nome, "Funcionário", "Salário: " + salario + ", Imposto: " + calculaImposto() + ", Nascimento: " + nascimento);
    }
}
