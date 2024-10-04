import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ensalamento {
    public static void executar() {
        // Criar professores
        Professor profMia = new Professor("Mia", "POO");
        Professor profSaulo = new Professor("Saulo", "Estrutura de Dados");
        Professor profPaula = new Professor("Paula", "BI");

        // Criar disciplinas
        Disciplina poo = new Disciplina("POO", "TI");
        Disciplina estruturaDeDados = new Disciplina("Estrutura de Dados", "TI");
        Disciplina bi = new Disciplina("BI", "ADM");

        // Criar alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Alfredo", "TI"));
        alunos.add(new Aluno("Amélia", "TI"));
        alunos.add(new Aluno("Ana", "ADM"));
        alunos.add(new Aluno("Bruno", "TI"));
        alunos.add(new Aluno("Bentinho", "ADM"));
        alunos.add(new Aluno("Capitú", "TI"));
        alunos.add(new Aluno("Debra", "TI"));
        alunos.add(new Aluno("Ian", "ADM"));
        alunos.add(new Aluno("Iracema", "TI"));
        alunos.add(new Aluno("Joelmir", "ADM"));
        alunos.add(new Aluno("Julieta", "TI"));
        alunos.add(new Aluno("Luana", "ADM"));
        alunos.add(new Aluno("Luciana", "TI"));
        alunos.add(new Aluno("Majô", "ADM"));
        alunos.add(new Aluno("Maria", "ADM"));
        alunos.add(new Aluno("Norberto", "TI"));
        alunos.add(new Aluno("Paulo", "ADM"));
        alunos.add(new Aluno("Romeu", "ADM"));
        alunos.add(new Aluno("Wendel", "TI"));
        alunos.add(new Aluno("Zoey", "TI"));

        // Alocar alunos nas turmas de acordo com o curso
        List<Aluno> alunosTI = alunos.stream().filter(aluno -> aluno.getCurso().equals("TI")).collect(Collectors.toList());
        List<Aluno> alunosADM = alunos.stream().filter(aluno -> aluno.getCurso().equals("ADM")).collect(Collectors.toList());

        // Criar turmas
        Turma turmaPOO = new Turma(profMia, poo, alunosTI);
        Turma turmaEstruturaDeDados = new Turma(profSaulo, estruturaDeDados, alunosTI);
        Turma turmaBI = new Turma(profPaula, bi, alunosADM);

        // Mostrar alocação das turmas
        turmaPOO.mostrarTurma();
        System.out.println();
        turmaEstruturaDeDados.mostrarTurma();
        System.out.println();
        turmaBI.mostrarTurma();
    }
}
