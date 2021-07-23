import java.awt.*;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tabuada, i;
        String resposta = "S";

        do {
            System.out.println("Tabuada:");
            tabuada = entrada.nextInt();

            for (i = 1; i <= 10; i++) {
                System.out.printf("%s x %s = %s\n", tabuada, i, tabuada * i );
            }
            System.out.println("Continuar?");
            resposta = entrada.next();

        } while((resposta.equals("s")));

        System.out.println("Fim");

    }
}
