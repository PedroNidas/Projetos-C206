import java.time.LocalDate;

public class Receita extends MovimentoFinanceiro {
    public Receita(double valor, LocalDate data, String categoria, String descricao) {
        super(valor, data, categoria, descricao);
    }
}
