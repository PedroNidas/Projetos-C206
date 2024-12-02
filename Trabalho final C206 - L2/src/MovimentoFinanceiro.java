import java.io.Serializable;
import java.time.LocalDate;

    public abstract class MovimentoFinanceiro implements Serializable {
        private double valor;
        private LocalDate data;
        private String categoria;
        private String descricao;

        public MovimentoFinanceiro(double valor, LocalDate data, String categoria, String descricao) {
            this.valor = valor;
            this.data = data;
            this.categoria = categoria;
            this.descricao = descricao;
        }

        public double getValor() {
            return valor;
        }

        @Override
        public String toString() {
            return "Data: " + data + ", Categoria: " + categoria + ", Valor: " + valor + ", Descrição: " + descricao;
        }
    }


