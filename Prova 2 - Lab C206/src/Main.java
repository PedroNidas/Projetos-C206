public class Main {
    public static void main(String[] args) {

        Heroi heroi = new Heroi("Hercules", 100);

        Vilao vilao = new Vilao("Leao da Nemeia", 100);

        Arma arma1 = new Arma("Mãos", 100, 20);
        Arma arma2 = new Arma("Pedaço de madeira", 100, 20);

        Arma arma3 = new Arma("Garras", 100, 50);
        Arma arma4 = new Arma("Dentes", 100, 50);

        heroi.addArma(arma1);
        heroi.addArma(arma2);

        vilao.addArma(arma3);
        vilao.addArma(arma4);

        heroi.mostrarArmas();
        vilao.mostrarArmas();

        heroi.atacar(0, vilao);
        vilao.atacar(1, heroi);
        heroi.atacar(1, vilao);


        try {
            heroi.usarEspecial(vilao);
        } catch (ArmaQuebradaException e) {

            e.getMessage();
        }


        try {
            vilao.usarEspecial(heroi);
        } catch (ArmaQuebradaException e) {

            e.getMessage();
        }

    }
}

