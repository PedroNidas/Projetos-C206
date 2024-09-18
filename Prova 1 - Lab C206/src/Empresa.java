public class Empresa {
    private String nome;
    private float faturamento;

    private Funcionario[] funcionarios = new Funcionario[100];

    private Gerente gerente;

    public Empresa() {
        gerente = new Gerente();
    }

    //INICIO GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    //FIM GETTERS E SETTERS


    public void contrataFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                System.out.println("Funcionário contratado!");
                break;
            }
        }
    }

    public void promoveFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == funcionario) {
                funcionarios[i].setSalario(funcionarios[i].getSalario() + 500);
                System.out.println(funcionarios[i].getNome() + " promovido, seu novo salário é de R$" + funcionarios[i].getSalario());
                break;
            }
        }
    }


    public void mostraFuncionarios() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Salário: " + funcionarios[i].getSalario());
            }
        }

    }

    public float venderProjeto() {
        if (gerente.isCarismatico() == true) {
            faturamento += 1000;
            System.out.println("O novo faturamento da empresa é R$" + faturamento);
        }else {
            System.out.println("O cliente não foi com a cara do " + gerente.getNome());
        }

        return faturamento;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", faturamento=" + faturamento +
                '}';
    }
}
