public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico[] hardwares;
    public SistemaOperacional sistema;
    public MemoriaUSB memoria;

    public Computador() {
        hardwares = new HardwareBasico[3];
        sistema = new SistemaOperacional();
    }

    public void mostraPCConfigs() {
        for (HardwareBasico hardwareBasico : hardwares) {
            if (hardwareBasico != null) {
                System.out.println(hardwareBasico.nome + " (" + hardwareBasico.tipo + ")");
            }
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + "bits)");
        System.out.println("Memoria USB: " + memoria.nome + " (" + memoria.capacidade + "Gb)");

    }

    public void addMemoriaUSB(MemoriaUSB musb) {

        this.memoria = musb;

    }


}
