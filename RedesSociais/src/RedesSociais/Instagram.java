package RedesSociais;

public class Instagram extends RedeSocial {

    public Instagram(String senha, int numAmigos, String nome) {
        super(senha, numAmigos, nome);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no " + getNome() + "!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou uma vídeo no " + getNome() + "!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no " + getNome() + "!");
    }

    @Override
    public void executarAcoes() {
        postarFoto();
        postarComentario();
        curtirPublicacao();
    }
}
