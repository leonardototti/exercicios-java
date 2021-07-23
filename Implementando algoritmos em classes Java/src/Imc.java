import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Informe o peso:");
        peso = entrada.nextDouble();

        System.out.println("Informe a altura:");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("IMC: " + imc + ", abaixo do peso.");
        } else if(imc >= 18.5 && imc < 24.9) {
            System.out.println("IMC: " + imc + ", peso normal.");
        } else if(imc >= 24.9 && imc < 29.9) {
            System.out.println("IMC: " + imc + ", sobrepeso.");
        } else {
            System.out.println("IMC: " + imc + ", obeso.");
        }

    }
}
