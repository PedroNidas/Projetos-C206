public class Main {
    public static void main(String[] args) {

        //Criando objetos
        Autor a1 = new Autor();
        Livro l1 = new Livro("O menino do dedo verde", 199, "Histórias para pensar");
        Cliente c1 = new Cliente();
        Biblioteca b1 = new Biblioteca("Arnaldo Cunha", "Inatel");

        a1.setNome("Henrique");
        a1.setPais("Brasil");

        c1.setNome("Pedro");
        c1.setDebito(30);
        c1.setIdade(25);

        //Chmando métodos
        a1.escreverLivro(l1);

        System.out.println(l1.getNomeAutor());


        c1.pagarDebito(50);

        b1.addLivro(l1);
        b1.getBibliotecario().setDisponivel(true);
        b1.emprestarLivro(b1.getBibliotecario(), c1, l1);
        b1.getBibliotecario().listarLivros(b1);







    }
}
