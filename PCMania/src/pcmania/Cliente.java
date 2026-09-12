package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total = total + computadores[i].getPreco();
            }
        }

        return total;
    }

    public void mostraInformacoes() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println("Computador " + (i + 1));
                computadores[i].mostraPCConfigs();
                System.out.println();
            }
        }

        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
