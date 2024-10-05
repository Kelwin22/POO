public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        Cliente cliente = new Cliente("Claudio", new Data(10, 5, 1985), 123);
        cadastro.cadastraPessoa(cliente);

        Funcionario funcionario = new Funcionario("Ganem", new Data(22, 8, 1990), 2500.0f);
        cadastro.cadastraPessoa(funcionario);

        Gerente gerente = new Gerente("Romario", new Data(15, 3, 1980), 5000.0f, "TI");
        cadastro.cadastraPessoa(gerente);

        ClienteVip clienteVip = new ClienteVip("VIP Claudio", new Data(10, 5, 1985), 124, 10.0f);
        cadastro.cadastraPessoa(clienteVip);

        cadastro.imprimeCadastro();
    }
}

