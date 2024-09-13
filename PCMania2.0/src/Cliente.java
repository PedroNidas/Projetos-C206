public class Cliente {
    public String nome;
    public long cpf;

    float total;

    public Computador[] computadores = new Computador[50];

    public float calculaTotalCompra() {
        System.out.print("\nO TOTAL DA COMPRA FOI DE R$ ");
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {

                total += computadores[i].preco;

            }
        }
        return total;
    }

    public void addComputador(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {

                computadores[i] = computador;
                break;

            }
        }
    }

    public void mostraInfo() { 
        System.out.println("\nINFORMAÇÕES DO CLIENTE:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
