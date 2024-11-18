import Excecoes.PublicacaoInvalidaException;
import Excecoes.RedeSocialNaoSuportadaException;
import RedesSociais.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando o conjunto de redes sociais
            HashSet<RedeSocial> redes = new HashSet<>();

            // Adicionando redes sociais ao conjunto
            redes.add(new Facebook("senhaFacebook123", 20, "Facebook"));
            redes.add(new Instagram("senhaInstagram456", 200, "Instagram"));
            redes.add(new Twitter("senhaTwitter789", 50, "Twitter"));
            redes.add(new LinkedIn("senhaLinkedIn012", 50, "LinkedIn"));
            redes.add(new GooglePlus("senhaGooglePlus012", 80, "GooglePlus"));

            // Criando o usuário com redes sociais
            Usuario usuario = new Usuario("João da Silva", "joao@silva.com", redes);

            // Demonstrando o uso de cada rede social
            usuario.usarRedesSociais();

            } catch(PublicacaoInvalidaException e){
                // Tratamento para publicações inválidas
            throw new RuntimeException(e);
            } catch (RedeSocialNaoSuportadaException e) {
            throw new RuntimeException(e);
        }
    }
}
