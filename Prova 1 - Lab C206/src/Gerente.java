public class Gerente {

    private String nome;
    private float salario;
    private boolean carismatico;

    public boolean isCarismatico() {
        return carismatico;
    }

    //INICIO GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    //FIM GETTES E SETTERS

    public void setCarismatico(boolean carismatico) {
        this.carismatico = carismatico;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", carismatico=" + carismatico +
                '}';
    }
}
