import java.util.*;

public class Programa {

    public static void main(String[] args) {
        List<Cidade> cidades = Arrays.asList(
            new Cidade("GO", "Anápolis", false),
            new Cidade("GO", "Goiânia", true),
            new Cidade("SP", "Ribeirão Preto", false),
            new Cidade("SP", "Campinas", false),
            new Cidade("MG", "Belo Horizonte", true),
            new Cidade("MG", "Uberlândia", false),
            new Cidade("MG", "Montes Claros", false),
            new Cidade("MG", "Unaí", false),
            new Cidade("TO", "Palmas", true),
            new Cidade("TO", "Araguarí", false),
            new Cidade("MT", "Cuiabá", true),
            new Cidade("MS", "Dourados", false),
            new Cidade("MS", "Campo Grande", true),
            new Cidade("MS", "Corumbá", false),
            new Cidade("MT", "Barra do Garças", false),
            new Cidade("MT", "Araguaiana", false),
            new Cidade("RO", "Porto Velho", true),
            new Cidade("RO", "Costa Marques", false)
        );

        Map<String, Set<Cidade>> cidadesPorUf = new TreeMap<>();
        for (Cidade cidade : cidades) {
            cidadesPorUf.computeIfAbsent(cidade.getUf(), k -> new TreeSet<>(Comparator.comparing(Cidade::getNome))).add(cidade);
        }

        System.out.println("Estrutura 1: Cidades agrupadas por UF (ordem alfabética)");
        for (Map.Entry<String, Set<Cidade>> entry : cidadesPorUf.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        cidades.sort(Comparator.comparing(Cidade::isCapital).reversed().thenComparing(Cidade::getNome));
        System.out.println("\nEstrutura 2: Cidades (capitais primeiro, depois ordem alfabética)");
        cidades.forEach(System.out::println);

        Set<Cidade> cidadesDecrescente = new TreeSet<>(Comparator.comparing(Cidade::getNome).reversed());
        cidadesDecrescente.addAll(cidades);
        System.out.println("\nEstrutura 3: Cidades em ordem alfabética decrescente");
        cidadesDecrescente.forEach(System.out::println);
    }
}
