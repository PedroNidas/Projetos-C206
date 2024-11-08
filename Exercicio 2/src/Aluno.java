import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario implements Autenticavel{

    private List<Double> notas = new ArrayList<>();
    private double media;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    //-------------------------------------------------------------------------------------------------------------------

    private void fazerMatricula() {
        this.media = calcularMedia();
        if (this.media >= 60) {

            System.out.println("Aluno(a) " + getNome() + " aprovado(a) com média: " + this.media);
        } else {
            throw new NotaInsuficienteException("Aluno(a) " + getNome() + " reprovado(a) com média: " + this.media);

        }

    }


    public void fazerProva(double nota) {

        notas.add(nota);

    }

    public double calcularMedia() {

        if (notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public void acessarSistema() {
        try {
            fazerMatricula();
        } catch (NotaInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}