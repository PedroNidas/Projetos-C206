public class Biblioteca {
    private String nome;
    private String bairro;
    private Bibliotecario bibliotecario;
    private Livro[] livros;

    // Construtor
    public Biblioteca(String nome, String bairro) {
        this.nome = nome;
        this.bairro = bairro;
        this.livros = new Livro[100]; // Inicializando array de livros
        this.bibliotecario = new Bibliotecario(); // Composição
    }

    //INICIO GETTERS E SETTERS
    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;

    }
    //FIM GETTERS E SETTERS

    // Metodo para emprestar livros
    public void emprestarLivro(Bibliotecario b1, Cliente c1, Livro l1) {
        if (bibliotecario.isDisponivel() && c1.getDebito() == 0 && confereLivro(l1) == true) {
            removerLivro(l1);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }
    }

    // Metodo para conferir se o livro existe na biblioteca
    private boolean confereLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getTitulo().equals(livro.getTitulo())) {
                return true;
            }
        }
        return false;
    }

    // Metodo para remover livro da biblioteca
    public void removerLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getTitulo().equals(livro.getTitulo())) {
                livros[i] = null; // Remove o livro
                System.out.println("Livro removido da biblioteca.");
                break;
            } else {

                System.out.println("Livro não encontrado.");
            }
        }

    }

    // Metodo para adicionar livro à biblioteca
    public void addLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                this.livros[i] = livro; // Adiciona o livro no primeiro espaço vazio
                System.out.println("Livro adicionado à biblioteca.");
                break;
            } else {
                System.out.println("A biblioteca está cheia.");
            }
        }

    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
