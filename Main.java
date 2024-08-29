public class Main {
    public static void main(String[] args) {
        //produto
        double valorProduto = 120000.00;
        double valorProdutoComImpostos = calcularValorFinalProduto(valorProduto);
        System.out.println("Produto: Golf MK5");
        System.out.println("Valor Base: R$ " + valorProduto);
        System.out.println("Valor com Impostos: R$ " + valorProdutoComImpostos);
        System.out.println("-----------------------------");

        //serviço
        double valorServico = 100.00;
        double valorServicoComImpostos = calcularValorFinalServico(valorServico);
        System.out.println("Serviço: Lavagem Personalisada");
        System.out.println("Valor Base: R$ " + valorServico);
        System.out.println("Valor com Impostos: R$ " + valorServicoComImpostos);
        System.out.println("-----------------------------");
    }

    //Valor final de um produto com ICMS e IPI
    public static double calcularValorFinalProduto(double valorBase) {
        double icms = valorBase * 0.132;
        double ipi = valorBase * 0.219;
        return valorBase + icms + ipi;
    }

    //Valor final de um serviço com ISS e ICMS
    public static double calcularValorFinalServico(double valorBase) {
        double iss = valorBase * 0.073;
        double icms = valorBase * 0.132;
        return valorBase + iss + icms;
    }
}
