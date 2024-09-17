public class Bibliotecario {
    private String nome;
    private int idade;
    private boolean disponivel;

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
    //FIM GETTERS E SETTER


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void listarLivros(Biblioteca biblioteca) {
        System.out.println("Livros disponíveis na biblioteca:");
        for (int i = 0; i < biblioteca.getLivros().length; i++) {
            if (biblioteca.getLivros()[i] != null) {
                System.out.println(biblioteca.getLivros()[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", disponivel=" + disponivel +
                '}';
    }
}
