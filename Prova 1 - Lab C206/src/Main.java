public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Gerente gerente = new Gerente();
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Dependente dependente = new Dependente();

        //Preenchendo atributos
        empresa.setNome("Ericsson");
        empresa.setFaturamento(5000F);

        empresa.getGerente().setNome("Alex");
        empresa.getGerente().setSalario(2000F);
        empresa.getGerente().setCarismatico(false);

        funcionario1.setNome("João");
        funcionario1.setSalario(1000F);
        funcionario1.setCargo("Técnico");
        funcionario1.setEnergia(4);

        funcionario2.setNome("Pedro");
        funcionario2.setSalario(1000F);
        funcionario2.setCargo("Auxiliar");
        funcionario2.setEnergia(20);

        dependente.setNome("Jorge");
        dependente.setParentesco("Filho");


        //Chmando os métodos
        empresa.contrataFuncionario(funcionario1);
        empresa.contrataFuncionario(funcionario2);
        empresa.mostraFuncionarios();
        empresa.promoveFuncionario(funcionario1);
        empresa.promoveFuncionario(funcionario2);
        empresa.venderProjeto();

        funcionario1.trabalhar();
        funcionario1.addDependente(dependente);
        System.out.println(funcionario1.getEnergia());
        funcionario1.trabalhar();
        System.out.println(funcionario1.getEnergia());

        System.out.println(dependente.toString());
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(empresa.getGerente().toString());
        System.out.println(empresa.toString());





    }
}
