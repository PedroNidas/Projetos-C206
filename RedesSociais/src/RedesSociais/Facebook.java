package RedesSociais;

import Excecoes.PublicacaoInvalidaException;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos, String nome) {
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
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no " + getNome() + "!");
    }

    @Override
    public void compartilhar() {
        if (numAmigos <= 0) {
            throw new PublicacaoInvalidaException("Não é possível compartilhar sem amigos no " + getNome() + "!");
        } else
            System.out.println("Compartilhou uma publicação " + getNome() + "!");
    }

    @Override
    public void executarAcoes() {
        postarFoto();
        fazStreaming();
        compartilhar();
    }
}
