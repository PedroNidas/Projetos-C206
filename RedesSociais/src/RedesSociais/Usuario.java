package RedesSociais;
import Excecoes.RedeSocialNaoSuportadaException;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public void adicionarRedeSocial(RedeSocial rede) throws RedeSocialNaoSuportadaException {
        if (rede instanceof Facebook || rede instanceof Instagram) {
            redesSociais.add(rede);
        } else {
            throw new RedeSocialNaoSuportadaException("Rede Social não suportada: " + rede.getNome());
        }
    }

    public void usarRedesSociais() throws RedeSocialNaoSuportadaException {
        for (RedeSocial rede : redesSociais) {
            System.out.println(rede.getNome() + " acessado pelo email: " + this.email);
            System.out.println(this.nome + " está usando o " + rede.getNome() + ":");
            rede.executarAcoes();
        }
    }


}
