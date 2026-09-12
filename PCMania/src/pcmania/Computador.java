package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwares,
                      SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Hardwares basicos:");

        for (int i = 0; i < hardwares.length; i++) {
            hardwares[i].mostraHardware();
        }

        System.out.println("Sistema operacional:");
        sistemaOperacional.mostraSistemaOperacional();

        if (memoriaUSB != null) {
            System.out.println("Memoria USB:");
            memoriaUSB.mostraMemoriaUSB();
        }
    }
}
