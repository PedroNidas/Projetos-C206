public class Main {

    public static void main(String[] args) {
        // Criação de alunos
        Aluno aluno1 = new Aluno("Maria", 20, 1);
        aluno1.fazerProva(70);
        aluno1.fazerProva(80);

        Aluno aluno2 = new Aluno("João", 22, 2);
        aluno2.fazerProva(50);
        aluno2.fazerProva(40);

        Aluno aluno3 = new Aluno("Ana", 21, 3);
        aluno3.fazerProva(60);
        aluno3.fazerProva(65);

        // Criação de professor
        Professor professor = new Professor("Silva", 45, 4);

        // Adicionando alunos ao professor
        professor.addAlunoLista(aluno1);
        professor.addAlunoLista(aluno2);
        professor.addAlunoLista(aluno3);

        // Testando o metodo acessarSistema de Aluno
        System.out.println("Acessando o sistema para cada aluno:");
        aluno1.acessarSistema();
        aluno2.acessarSistema();
        aluno3.acessarSistema();

        // Testando o metodo acessarSistema de Professor
        System.out.println("\nAcessando o sistema para o professor:");
        professor.acessarSistema();


    }
}
