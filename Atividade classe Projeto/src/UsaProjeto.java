import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Projeto testeProjeto = new Projeto("teste", 20);

        int y, opc;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Registrar horas trabalhadas");
            System.out.println("2- Consultar custo do projeto");
            System.out.println("9- Encerrar o programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Informe as horas trabalhadas:");
                    int horas;
                    horas = entrada.nextInt();

                    testeProjeto.registrarHoras(horas);
                    System.out.println(horas + " horas cadastradas com sucesso!");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    System.out.println("O custo atual do projeto é de R$" + testeProjeto.getCustoAtual());
                    System.out.println("");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 9:
                    y = 1;
                    break;

                default:
                    System.out.println("Opcão incorreta!");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();

            }

        } while(y == 0);

        while(y != 2) {

        }

    }
}
