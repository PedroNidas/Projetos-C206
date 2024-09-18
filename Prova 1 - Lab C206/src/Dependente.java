public class Dependente {
    private String nome;
    private String parentesco;

    //INICIO GETTERS E SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    //FIM GETTERS E SETTERS

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
