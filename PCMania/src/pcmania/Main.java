package pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matricula = 4587;

        HardwareBasico[] hardwarePromocao1 = new HardwareBasico[3];
        hardwarePromocao1[0] = new HardwareBasico("Pentium Core i5", 2200);
        hardwarePromocao1[1] = new HardwareBasico("Memoria RAM", 8);
        hardwarePromocao1[2] = new HardwareBasico("HD", 500);

        Computador promocao1 = new Computador("Apple", matricula, hardwarePromocao1,
                new SistemaOperacional("macOS Sequoia", 64));
        promocao1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        HardwareBasico[] hardwarePromocao2 = new HardwareBasico[3];
        hardwarePromocao2[0] = new HardwareBasico("Pentium Core i7", 3370);
        hardwarePromocao2[1] = new HardwareBasico("Memoria RAM", 16);
        hardwarePromocao2[2] = new HardwareBasico("HD", 1000);

        Computador promocao2 = new Computador("Samsung", matricula + 1, hardwarePromocao2,
                new SistemaOperacional("Windows 8", 64));
        promocao2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        HardwareBasico[] hardwarePromocao3 = new HardwareBasico[3];
        hardwarePromocao3[0] = new HardwareBasico("Pentium Core i7", 4500);
        hardwarePromocao3[1] = new HardwareBasico("Memoria RAM", 32);
        hardwarePromocao3[2] = new HardwareBasico("HD", 2000);

        Computador promocao3 = new Computador("Dell", matricula + 2, hardwarePromocao3,
                new SistemaOperacional("Windows 10", 64));
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        Computador[] computadoresComprados = new Computador[10];
        int quantidade = 0;
        int codigo = -1;

        while (codigo != 0 && quantidade < computadoresComprados.length) {
            System.out.println("Digite 1 para promocao 1, 2 para promocao 2 ou 3 para promocao 3.");
            System.out.println("Digite 0 para finalizar.");
            codigo = entrada.nextInt();

            switch (codigo) {
                case 1:
                    computadoresComprados[quantidade] = promocao1;
                    quantidade++;
                    break;
                case 2:
                    computadoresComprados[quantidade] = promocao2;
                    quantidade++;
                    break;
                case 3:
                    computadoresComprados[quantidade] = promocao3;
                    quantidade++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        }

        Cliente cliente = new Cliente("Júlia", "777.777.777-77");
        cliente.setComputadores(computadoresComprados);

        System.out.println();
        cliente.mostraInformacoes();
        ProcessarPedido.enviarPedido(computadoresComprados);

        entrada.close();
    }
}
