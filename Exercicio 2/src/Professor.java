import java.util.HashSet;
import java.util.Set;

public class Professor extends Usuario implements Autenticavel{

    private Set<Aluno> lista_Alunos = new HashSet<>();

    public Professor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }



    public void addAlunoLista(Aluno a1) {

        lista_Alunos.add(a1);

    }

    private void mostrarAlunos() {

        for (Aluno aluno : lista_Alunos) {
            System.out.println("Nome: " + aluno.getNome() + " - Média: " + aluno.calcularMedia());
        }

    }
    @Override
    public void acessarSistema() {
        mostrarAlunos();
    }
}
