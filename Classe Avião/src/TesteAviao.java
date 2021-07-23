import java.util.Scanner;

public class TesteAviao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aviao aviao = new Aviao(400);

        int y, opc;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Decolar");
            System.out.println("2- Pousar");
            System.out.println("3- Definir nome do voo");
            System.out.println("4- Definir quantidade máxima de passageiros");
            System.out.println("5- Embarcar passageiro");
            System.out.println("6- Desembarcar passageiro");
            System.out.println();
            System.out.println("9- Sair do programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    if(aviao.getEstado() == 'P') {
                        aviao.decolar();
                        System.out.println("O avião decolou.");
                    } else {
                        System.out.println("O avião já decolou.");
                    }
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    if(aviao.getEstado() == 'V') {
                        aviao.pousar();
                        System.out.println("O avião pousou.");
                    } else {
                        System.out.println("O avião já pousou.");
                    }
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 3:
                    System.out.println("Informe um nome:");
                    String nome;
                    entrada.nextLine();
                    nome = entrada.nextLine();

                    if (!nome.isBlank()) {
                        aviao.setNomeVoo(nome);
                        System.out.println("O nome do voo foi alterado para " + aviao.getNomeVoo() + ".");
                    } else {
                        System.out.println("O nome do voo não pode ser somente espaços ou nulo!");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 4:
                    System.out.println("Informe a nova quantidade máxima de passageiros:");
                    int quantidade = 0;
                    quantidade = entrada.nextInt();

                    if(quantidade > 0 && quantidade <= aviao.getQuantidadeMaxima()) {
                        aviao.setQuantidadeMaxima(quantidade);
                        System.out.println("A quantidade máxima foi definida para " + aviao.getQuantidadeMaxima() + " passageiros.");
                    } else {
                        System.out.println("A quantidade máxima deve ser maior do que zero e menor que " + aviao.getQuantidadeMaxima() + "!");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 5:
                    if(aviao.getEstado() == 'P' && aviao.getQuantidadePassageiros() < aviao.getQuantidadeMaxima()) {
                        aviao.embarcar();
                        System.out.println("Um passageiro embarcou no avião, totalizando " + aviao.getQuantidadePassageiros() + " de " + aviao.getQuantidadeMaxima() + " passageiros.");
                    } else {
                        System.out.println("O avião já está cheio!");
                    }
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 6:
                    aviao.desembarcar();
                    System.out.println("Um passageiro desembarcou do avião.");
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
