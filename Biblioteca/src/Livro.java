public class Livro {
    private String titulo;
    private int nPaginas;
    private String categoria;
    private String nomeAutor;

    public Livro(String titulo, int nPaginas, String categoria) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.categoria = categoria;
    }

    //GETTERS E SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    //FIM GETTERS E SETTER


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", nPaginas=" + nPaginas +
                ", categoria='" + categoria + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                '}';
    }
}
