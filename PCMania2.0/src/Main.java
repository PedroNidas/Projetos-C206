import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        Computador PC1 = new Computador();
        Computador PC2 = new Computador();
        Computador PC3 = new Computador();

        MemoriaUSB mem1 = new MemoriaUSB();
        MemoriaUSB mem2 = new MemoriaUSB();
        MemoriaUSB mem3 = new MemoriaUSB();

        HardwareBasico H1 = new HardwareBasico();
        HardwareBasico H2 = new HardwareBasico();
        HardwareBasico H3 = new HardwareBasico();
        HardwareBasico H4 = new HardwareBasico();
        HardwareBasico H5 = new HardwareBasico();
        HardwareBasico H6 = new HardwareBasico();
        HardwareBasico H7 = new HardwareBasico();
        HardwareBasico H8 = new HardwareBasico();
        HardwareBasico H9 = new HardwareBasico();


        cliente1.nome = "Chris";
        cliente1.cpf = 12345678900L;

        PC1.marca = "Positivo";
        PC1.preco = 89;
        H1.nome = "Pentium Core i3";
        H1.tipo = 2200;
        H2.nome = "Memória RAM";
        H2.tipo = 8;
        H3.nome = "HD";
        H3.tipo = 500;
        PC1.sistema.nome = "Linux Ubuntu";
        PC1.sistema.tipo = 32;
        mem1.nome = "Pen-drive";
        mem1.capacidade = 16;

        PC2.marca = "Acer";
        PC2.preco = 89 + 1234;
        H4.nome = "Pentium Core i5";
        H4.tipo = 3370;
        H5.nome = "Memória RAM";
        H5.tipo = 16;
        H6.nome = "HD";
        H6.tipo = 1000;
        PC2.sistema.nome = " Windows 8";
        PC2.sistema.tipo = 64;
        mem2.nome = "Pen-drive";
        mem2.capacidade = 32;

        PC3.marca = "Vaio";
        PC3.preco = 89 + 5678;
        H7.nome = "Pentium Core i7";
        H7.tipo = 4500;
        H8.nome = "Memória RAM";
        H8.tipo = 32;
        H9.nome = "HD";
        H9.tipo = 2000;
        PC3.sistema.nome = " Windows 10";
        PC3.sistema.tipo = 64;
        mem3.nome = "HD Externo";
        mem3.capacidade = 1000;

        PC1.addMemoriaUSB(mem1);
        PC2.addMemoriaUSB(mem2);
        PC3.addMemoriaUSB(mem3);

        PC1.hardwares[0] = H1;
        PC1.hardwares[1] = H2;
        PC1.hardwares[2] = H3;

        PC2.hardwares[0] = H4;
        PC2.hardwares[1] = H5;
        PC2.hardwares[2] = H6;

        PC3.hardwares[0] = H7;
        PC3.hardwares[1] = H8;
        PC3.hardwares[2] = H9;

        System.out.println("Olá, seja bem vindo(a) a nossa loja PC Mania!");
        System.out.println("Ficamos muito felizes de nos procurar para comprar seu novo PC.\n");
        System.out.println("Seguem as informações para realizar sua compra:");
        System.out.println("Para selecionar a promoção 1 digite \"1\";\n" +
                "Para selecionar a promoção 2 digite \"2\";\n" +
                "Para selecionar a promoção 3 digite \"3\";\n" +
                "Para finalizar a compra digite \"0\".\n");

        //Leitura de dados (entrada)
        int codigo;

        do {
            System.out.print("Digite o código de sua escolha: ");
            codigo = sc.nextInt();
            if (codigo == 1) {
                cliente1.addComputador(PC1);
                System.out.println("PC1 adicionado!\n");
            } else if (codigo == 2) {
                cliente1.addComputador(PC2);
                System.out.println("PC2 adicionado!\n");
            } else if (codigo == 3) {
                cliente1.addComputador(PC3);
                System.out.println("PC3 adicionado!\n");
            } else if (codigo != 0 && codigo != 1 && codigo != 2 && codigo != 3) {
                System.out.println("Código inválido, tente novamente!\n");
            }
        } while (codigo != 0);
        System.out.println("Compra finalizada!");

        cliente1.mostraInfo();
        for (int i = 0; i < cliente1.computadores.length; i++) {
            if (cliente1.computadores[i] != null) {
                System.out.println("\nCONFIGURAÇÕES DO " + (i + 1) + "º PC ESCOLHIDO:");
                cliente1.computadores[i].mostraPCConfigs();
            }
        }
        System.out.println(cliente1.calculaTotalCompra());

    }
}
