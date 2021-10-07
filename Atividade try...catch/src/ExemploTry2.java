import java.util.Scanner;
public class ExemploTry2

{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int a = 0;
        int cont = 0;

        do{
            System.out.print("A: ");
            try {
                a = teclado.nextInt();
            } catch (java.util.InputMismatchException e){
                e.getMessage();
                e.printStackTrace();
                System.exit(0);
            } finally {
                cont++;
            }
            // 1) faça o tratamento de exceção e utilize os métodos getMessage() e printStackTrace();

        }while(a > 0);

        System.out.println("Quantidade de entrada de dados: " + cont);
        //2) Faça o cont++ para incrementar todas as entradas de dados corretas e incorretas em uma única linha de código.
    }
}