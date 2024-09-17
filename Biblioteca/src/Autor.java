public class Autor {
    private String nome;
    private String pais;

    //INICIO GETTERS E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    //FIM GETTERS E SETTER


    public void escreverLivro(Livro livro) {
        livro.setNomeAutor(this.nome);
    }
}
