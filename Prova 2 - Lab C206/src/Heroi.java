public class Heroi extends Personagem implements Combater{
    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        personagem.armas.clear();
    }
}

