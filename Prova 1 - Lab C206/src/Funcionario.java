public class Funcionario {

    private String nome;
    private float salario;
    private String cargo;
    private int energia;
    private Dependente dependente;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    //FIM GETTERS E SETTERS


    public void trabalhar() {
        if (energia <= 0) {
            System.out.println("Funcionário muito canado para trabalhhar");
            descansar();
        } else {
            System.out.println("Funcionário trabalhou");
            energia -= 5;
        }

    }

    private void descansar() {
        energia += 5;
    }

    public void addDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", energia=" + energia +
                '}';
    }
}
