import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCartao {
    public static void main(String[] args) {
        List<CartaoCredito> cartoes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int y, i, opc;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("-----------------------------------");
            System.out.println("1- Cadastrar cartão");
            System.out.println("2- Consultar cartão por número");
            System.out.println("3- Consultar cartão por bandeira");
            System.out.println("4- Comprar com um cartão");
            System.out.println("5- Pagar um cartão");
            System.out.println();
            System.out.println("9- Encerrar o programa");
            System.out.println("-----------------------------------");
            System.out.print("# ");

            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Informe o número do cartão:");
                    int numero;
                    entrada.nextLine();
                    numero = entrada.nextInt();

                    boolean cartaoExistente = false;
                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getNumero() == numero) {
                            cartaoExistente = true;
                            System.out.println("Erro, um cartão já está registrado com esse número.");
                        }
                    }

                    if(!cartaoExistente) {
                        System.out.println("Informe a bandeira do cartão:");
                        String bandeira;
                        entrada.nextLine();
                        bandeira = entrada.nextLine();

                        System.out.println("Informe o limite do cartão (coloque 0 caso não queira):");
                        float limite;
                        limite = entrada.nextFloat();

                        if(limite == 0) {
                            CartaoCredito cartao = new CartaoCredito(numero, bandeira);
                            cartoes.add(cartao);
                        } else {
                            CartaoCredito cartao = new CartaoCredito(numero, limite, bandeira);
                            cartoes.add(cartao);
                        }
                        System.out.println("Cartão '"+ numero +"' criado com sucesso.");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    int buscaNumero;
                    boolean achouNumero = false;
                    System.out.println("Informe o número do cartão a ser consultado:");
                    entrada.nextLine();
                    buscaNumero = entrada.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getNumero() == buscaNumero) {
                            achouNumero = true;
                            System.out.println("---------------------------");
                            System.out.println("-- Informações do cartão --");
                            System.out.println("---------------------------");
                            System.out.println("Número: " + cartoes.get(i).getNumero());
                            System.out.println("Saldo: " + cartoes.get(i).getSaldo());
                            System.out.println("Limite: " + cartoes.get(i).getLimite());
                            System.out.println("Bônus: " + cartoes.get(i).getBonus());
                            System.out.println("Bandeira: " + cartoes.get(i).getBandeira());
                            System.out.println();
                        }
                    }

                    if(!achouNumero) {
                        System.out.println("Nenhum cartão com o número '"+ buscaNumero +"' foi encontrado.");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 3:
                    String buscaBandeira;
                    int achouBandeira = 0;
                    System.out.println("Informe a bandeira do cartão a ser consultado:");
                    entrada.nextLine();
                    buscaBandeira = entrada.nextLine();

                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getBandeira().equals(buscaBandeira)) {
                            achouBandeira++;
                            System.out.println("-------------------------------");
                            System.out.println("Informações do cartão ("+ achouBandeira +")");
                            System.out.println("-------------------------------");
                            System.out.println("Número: " + cartoes.get(i).getNumero());
                            System.out.println("Saldo: " + cartoes.get(i).getSaldo());
                            System.out.println("Limite: " + cartoes.get(i).getLimite());
                            System.out.println("Bônus: " + cartoes.get(i).getBonus());
                            System.out.println("Bandeira: " + cartoes.get(i).getBandeira());
                            System.out.println();
                        }
                    }

                    if(achouBandeira == 0) {
                        System.out.println("Nenhum cartão com a bandeira '"+ buscaBandeira +"' foi encontrado.");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 4:
                    int numeroComprar;
                    float valorComprar;
                    boolean achouNumeroComprar = false;

                    System.out.println("Informe o valor da compra:");
                    System.out.print("R$ ");
                    entrada.nextLine();
                    valorComprar = entrada.nextFloat();

                    System.out.println("Informe o número do cartão:");
                    entrada.nextLine();
                    numeroComprar = entrada.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getNumero() == numeroComprar) {
                            achouNumeroComprar = true;
                            cartoes.get(i).addComprar(valorComprar);
                            System.out.println("Uma nova compra de R$ " + valorComprar + " foi registrada.");
                        }
                    }

                    if(!achouNumeroComprar) {
                        System.out.println("Nenhum cartão com o número '"+ numeroComprar +"' foi encontrado.");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 5:
                    int numeroPagar;
                    float valorPagar;
                    boolean achouNumeroPagar = false;

                    System.out.println("Informe o valor do pagamento:");
                    System.out.print("R$ ");
                    entrada.nextLine();
                    valorPagar = entrada.nextFloat();

                    System.out.println("Informe o número do cartão:");
                    entrada.nextLine();
                    numeroPagar = entrada.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getNumero() == numeroPagar) {
                            achouNumeroPagar = true;
                            cartoes.get(i).addPagar(valorPagar);
                            System.out.println("Um novo pagamento de R$ " + valorPagar + " foi registrada.");
                        }
                    }

                    if(!achouNumeroPagar) {
                        System.out.println("Nenhum cartão com o número '"+ numeroPagar +"' foi encontrado.");
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