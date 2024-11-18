package RedesSociais;

import Excecoes.RedeSocialNaoSuportadaException;

public abstract class RedeSocial {
    protected String nome;
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos, String nome) {
        this.nome = nome;
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public String getNome() {
        return nome;
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no " + this.nome + "!");
    }

    public abstract void executarAcoes() throws RedeSocialNaoSuportadaException; // Metodo genérico para executar ações específicas.
}
