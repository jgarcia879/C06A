package pcmania;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostraSistemaOperacional() {
        System.out.println(nome + " (" + tipo + " bits)");
    }
}
