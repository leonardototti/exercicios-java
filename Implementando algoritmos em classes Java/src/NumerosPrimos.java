import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, loop, qtdDiv = 0;

        System.out.println("Digite o número:");
        numero = entrada.nextInt();

        for(loop = 1; loop <= numero; loop++) {
            if(numero % loop == 0) {
                System.out.println(numero + " é divisível por " + loop + ";");
                qtdDiv += 1;
            }
        }

        if(qtdDiv == 2) {
            System.out.println("Logo " + numero + " é um numero primo.");
        } else {
            System.out.println("Logo " + numero + " não é um numero primo.");
        }
    }
}
