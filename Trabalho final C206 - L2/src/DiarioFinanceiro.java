import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DiarioFinanceiro {
    private List<MovimentoFinanceiro> movimentos = new ArrayList<>();
    private final String arquivo = "diario_financeiro.dat";

    public DiarioFinanceiro() {
        carregarDados();
    }

    public void adicionarMovimento(MovimentoFinanceiro movimento) {
        movimentos.add(movimento);
        salvarDados();
    }

    public void listarMovimentos() {
        if (movimentos.isEmpty()) {
            System.out.println("Nenhum movimento financeiro registrado.");
        } else {
            movimentos.forEach(System.out::println);
        }
    }

    public void excluirMovimento(int index) {
        if (index >= 0 && index < movimentos.size()) {
            movimentos.remove(index);
            salvarDados();
            System.out.println("Movimento excluído com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (MovimentoFinanceiro movimento : movimentos) {
            if (movimento instanceof Receita) {
                saldo += movimento.getValor();
            } else if (movimento instanceof Despesa) {
                saldo -= movimento.getValor();
            }
        }
        return saldo;
    }

    private void salvarDados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(movimentos);
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            movimentos = (List<MovimentoFinanceiro>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Arquivo não encontrado: nenhum dado para carregar
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
}
