import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    protected String nome;
    protected int vida;

    public List<Arma> armas = new ArrayList<>();

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma) {
        armas.add(arma);
    }

    public void mostrarArmas() {
        for (Arma aux : armas) {
            System.out.println(aux.toString());
        }

    }

    public void atacar(int posicao, Personagem personagem) {
        if (armas.get(posicao).getDurabilidade() > 0) {
            if (personagem.vida > 0) {
                personagem.vida = personagem.vida - armas.get(posicao).getDano();
                armas.get(posicao).setDurabilidade(0);
            } else {
                System.out.println("Personagem derrotado!");
            }
        } else {
            throw new ArmaQuebradaException("Arma Quebrada!");
        }


    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                '}';
    }

}

