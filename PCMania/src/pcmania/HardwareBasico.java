package pcmania;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraHardware() {
        System.out.println(nome + " (" + capacidade + ")");
    }
}
