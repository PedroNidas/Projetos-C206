public class Cliente {
    private String nome;
    private int idade;
    private double debito = 0;

    //INICIO GETTERS E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }
    //FIM GETTERS E SETTER


    public void pagarDebito(double quantia) {
        this.debito -= quantia;
        if (this.debito < 0) {
            this.debito = 0;
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", debito=" + debito +
                '}';
    }
}
