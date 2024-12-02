import java.time.LocalDate;

public class Despesa extends MovimentoFinanceiro {
    public Despesa(double valor, LocalDate data, String categoria, String descricao) {
        super(valor, data, categoria, descricao);
    }
}


