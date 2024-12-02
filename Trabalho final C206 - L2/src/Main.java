import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiarioFinanceiro diario = new DiarioFinanceiro();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {
            System.out.println("\n--- Diário Financeiro ---");
            System.out.println("1. Adicionar Receita");
            System.out.println("2. Adicionar Despesa");
            System.out.println("3. Listar Movimentos");
            System.out.println("4. Excluir Movimento");
            System.out.println("5. Calcular Saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Data (dd-MM-yyyy): ");
                    LocalDate data = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    diario.adicionarMovimento(new Receita(valor, data, categoria, descricao));
                    pause(scanner);
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Data (dd-MM-yyyy): ");
                    LocalDate data = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    diario.adicionarMovimento(new Despesa(valor, data, categoria, descricao));
                    pause(scanner);
                }
                case 3 -> {
                    diario.listarMovimentos();
                    pause(scanner);
                }
                case 4 -> {
                    System.out.print("Índice do movimento a excluir: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    diario.excluirMovimento(index);
                    pause(scanner);
                }
                case 5 -> {
                    System.out.println("Saldo atual: " + diario.calcularSaldo());
                    pause(scanner);
                }
                case 6 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> {
                    System.out.println("Opção inválida.");
                    pause(scanner);
                }
            }
        }
    }

    private static void pause(Scanner scanner) {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
