package br.edu.unifil.lpoo.universidade.visao;

import br.edu.unifil.lpoo.universidade.controle.Controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner entrada = new Scanner(System.in);

        int y, opc;
        String tipoProfessor;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Incluir professor");
            System.out.println("2- Listar professores");
            System.out.println("3- Mostrar dados dos professores");
            System.out.println();
            System.out.println("9- Encerrar o programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1 -> {
                    String nome, matricula;
                    float salario;
                    int aux = 0, horasTrabalhadas, licencasPremio;
                    do {
                        System.out.println("Informe o tipo de professor:");
                        entrada.nextLine();
                        tipoProfessor = entrada.next();
                        if (tipoProfessor.equals("dedicado") || tipoProfessor.equals("horista")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de professor deve ser dedicado ou horista.");
                        }
                    } while (aux == 0);
                    System.out.println("Informe o nome do professor:");
                    entrada.nextLine();
                    nome = entrada.nextLine();
                    System.out.println("Informe o salário do professor:");
                    salario = entrada.nextFloat();
                    do {
                        aux = 0;
                        System.out.println("Informe a matrícula do professor:");
                        entrada.nextLine();
                        matricula = entrada.next();

                        if (matricula.length() != 5) {
                            System.out.println(matricula);
                            System.out.println("A matrícula deve ter 5 dígitos, por favor informe novamente.");
                        } else {
                            aux = 1;
                        }
                    } while (aux == 0);
                    if (tipoProfessor.equals("dedicado")) {
                        System.out.println("Informe o número de licenças prêmio do professor:");
                        entrada.nextLine();
                        licencasPremio = entrada.nextInt();
                        controle.incluiProfessor(tipoProfessor, nome, salario, matricula, licencasPremio);
                    } else {
                        System.out.println("Informe o número de horas trabalhadas do professor:");
                        entrada.nextLine();
                        horasTrabalhadas = entrada.nextInt();
                        controle.incluiProfessor(tipoProfessor, nome, salario, matricula, horasTrabalhadas);
                    }
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                }
                case 2 -> {
                    controle.listaProfessores();
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                }
                case 3 -> {
                    controle.mostraDados();
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                }
                case 9 -> y = 1;
                default -> {
                    System.out.println("Opcão incorreta!");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                }
            }
        } while(y == 0);
    }
}
