package RedesSociais;

import Excecoes.RedeSocialNaoSuportadaException;

public class LinkedIn extends RedeSocial {
    public LinkedIn(String senha, int numAmigos, String nome) {
        super(senha, numAmigos, nome);
    }

    @Override
    public void postarFoto() {

    }

    @Override
    public void postarVideo() {

    }

    @Override
    public void postarComentario() {

    }

    @Override
    public void executarAcoes() throws RedeSocialNaoSuportadaException {
        try {
            throw new RedeSocialNaoSuportadaException("Rede social não suportada!");
        } catch (RedeSocialNaoSuportadaException e) {
            throw new RuntimeException(e);
        }
    }
}
