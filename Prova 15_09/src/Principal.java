import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        int y, opc;

        String nome;
        float salario;
        String matricula;
        int licencaPremio;
        int horasTrabalhadas;

        boolean achouProfessor;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Cadastrar professor com dedicação exclusiva");
            System.out.println("2- Cadastrar professor horista");
            System.out.println("3- Consultar professor pela matrícula");
            System.out.println();
            System.out.println("9- Encerrar o programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Informe o nome do professor:");
                    nome = entrada.next();

                    System.out.printf("Informe o salário do professor: \nR$");
                    salario = entrada.nextFloat();

                    System.out.println("Informe a matrícula do professor:");
                    matricula = entrada.next();

                    System.out.println("Informe o número de licensas prêmio do professor:");
                    licencaPremio = entrada.nextInt();

                    listaProfessores.add(new ProfessorDE(nome, salario, matricula, licencaPremio));
                    System.out.printf("Professor %s cadastrado com sucesso!\n", nome);

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    System.out.println("Informe o nome do professor:");
                    nome = entrada.next();

                    System.out.printf("Informe o salário do professor: \nR$");
                    salario = entrada.nextFloat();

                    System.out.println("Informe a matrícula do professor:");
                    matricula = entrada.next();

                    System.out.println("Informe as horas trabalhadas do professor:");
                    horasTrabalhadas = entrada.nextInt();

                    listaProfessores.add(new ProfessorHorista(nome, salario, matricula, horasTrabalhadas));
                    System.out.printf("Professor %s cadastrado com sucesso!\n", nome);

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 3:
                    System.out.println("Informe a matrícula do professor:");
                    matricula = entrada.next();

                    achouProfessor = false;

                    for(int i = 0; i < listaProfessores.size(); i++) {
                        if(listaProfessores.get(i).getMatricula().equals(matricula)) {
                            achouProfessor = true;
                            System.out.printf("Nome: %s\n", listaProfessores.get(i).getNome());
                            System.out.printf("Salario: %s\n", listaProfessores.get(i).getSalario());
                        }
                    }

                    if(!achouProfessor) {
                        System.out.println("Professor não cadastrado.");
                    }

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
    }
}
