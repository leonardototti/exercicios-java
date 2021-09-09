package br.edu.unifil.lpoo.consulta.visao;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.Consulta;

import java.util.Scanner;

public class SistemaDaClinica {
    public static void main(String[] args) {
        CadastroDeConsultas cadastro = new CadastroDeConsultas();
        Scanner entrada = new Scanner(System.in);

        int y, opc;
        String tipoConsulta;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Agendar consulta");
            System.out.println("2- Listar consultas");
            System.out.println("3- Consultar total de consultas");
            System.out.println("4- Consultar valor total de consultas");
            System.out.println();
            System.out.println("9- Encerrar o programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    String nomePaciente, matricula;
                    int aux = 0, numDependentes, anoInclusao;
                    double valorConsulta;

                    do {
                        System.out.println("Informe o tipo de consulta:");
                        tipoConsulta = entrada.next();
                        if(tipoConsulta.equals("prata") || tipoConsulta.equals("ouro") || tipoConsulta.equals("diamante") || tipoConsulta.equals("familia")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser prata, ouro, diamante ou familia.");
                        }
                    } while(aux == 0);

                    Consulta novaConsulta = cadastro.addConsulta(tipoConsulta);

                    System.out.println("Informe o nome do paciente:");
                    entrada.nextLine();
                    nomePaciente = entrada.nextLine();
                    novaConsulta.setNomePaciente(nomePaciente);

                    do {
                        aux = 0;
                        System.out.println("Informe a matrícula do paciente:");
                        matricula = entrada.nextLine();

                        if (matricula.length() != 5) {
                            System.out.println("A matrícula deve ter 5 dígitos, por favor informe novamente.");
                        } else {
                            aux = 1;
                            novaConsulta.setMatricula(matricula);
                        }
                    } while (aux == 0);

                    System.out.println("Informe o número de dependentes do paciente:");
                    numDependentes = entrada.nextInt();
                    novaConsulta.setNumDependentes(numDependentes);

                    do {
                        aux = 0;
                        System.out.println("Informe o ano de inclusão do paciente:");
                        anoInclusao = entrada.nextInt();

                        if(anoInclusao > 1900 && anoInclusao <= 2021) {
                            aux = 1;
                            novaConsulta.setAnoInclusao(anoInclusao);
                        } else {
                            System.out.println("O ano de inclusão deve ser maior que 1900 e menor ou igual a 2021.");
                        }
                    } while(aux == 0);

                    System.out.println("Informe o valor da consulta:");
                    valorConsulta = entrada.nextDouble();
                    novaConsulta.setValorConsulta(valorConsulta);

                    System.out.println("Sucesso! A conta de " + novaConsulta.getNomePaciente() + " foi registrada.");

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    do {
                        aux = 0;
                        System.out.println("Informe o tipo de consulta a ser listada:");
                        entrada.nextLine();
                        tipoConsulta = entrada.nextLine();
                        if(tipoConsulta.equals("prata") || tipoConsulta.equals("ouro") || tipoConsulta.equals("diamante") || tipoConsulta.equals("familia")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser prata, ouro, diamante ou familia.");
                        }
                    } while(aux == 0);

                    cadastro.getConsultas(tipoConsulta);

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 3:
                    do {
                        aux = 0;
                        System.out.println("Informe o tipo de consulta a ser listada:");
                        entrada.nextLine();
                        tipoConsulta = entrada.nextLine();
                        if(tipoConsulta.equals("prata") || tipoConsulta.equals("ouro") || tipoConsulta.equals("diamante") || tipoConsulta.equals("familia")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser prata, ouro, diamante ou familia.");
                        }
                    } while(aux == 0);

                    int numTotalConsultas;
                    numTotalConsultas = cadastro.getNumTotalConsultas(tipoConsulta);

                    System.out.printf("Há um total de %s consultas cadastradas.\n", numTotalConsultas);

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 4:
                    do {
                        aux = 0;
                        System.out.println("Informe o tipo de consulta a ser listada:");
                        entrada.nextLine();
                        tipoConsulta = entrada.nextLine();
                        if(tipoConsulta.equals("prata") || tipoConsulta.equals("ouro") || tipoConsulta.equals("diamante") || tipoConsulta.equals("familia")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser prata, ouro, diamante ou familia.");
                        }
                    } while(aux == 0);

                    double valorTotalConsultas;
                    valorTotalConsultas = cadastro.getValorTotalConsultas(tipoConsulta);

                    System.out.printf("Há um total de R$%s em valor de consultas cadastradas.\n", valorTotalConsultas);

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
