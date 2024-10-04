import java.util.List;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina, List<Aluno> alunos) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = alunos;
    }

    public void mostrarTurma() {
        System.out.println("Turma da disciplina: " + disciplina.getNome() + " (" + disciplina.getCurso() + ")");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getCurso() + ")");
        }
    }
}
