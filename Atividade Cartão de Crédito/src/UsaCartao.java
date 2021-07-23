import java.util.Scanner;

public class UsaCartao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CartaoCredito cartao = new CartaoCredito(1, "Visa");

        int y, opc;

        do {
            System.out.println("(Menu) Escolha:");
            System.out.println("1- Atualizar bandeira");
            System.out.println("2- Atualizar limite");
            System.out.println("3- Comprar");
            System.out.println("4- Pagar");
            System.out.println("5- Consulta cartão");
            System.out.println();
            System.out.println("9- Encerrar o programa");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Informe uma nova bandeira:");
                    String bandeira;
                    entrada.nextLine();
                    bandeira = entrada.nextLine();

                    if(!bandeira.isBlank()) {
                        cartao.setBandeira(bandeira);
                        System.out.println("A bandeira foi alterada para " + cartao.getBandeira() + ".");
                    } else {
                        System.out.println("O nome da bandeira não pode ser somente espaços ou nulo!");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 2:
                    System.out.println("Informe um novo limite:");
                    float limite;
                    limite = entrada.nextFloat();

                    if(limite >= 1) {
                        cartao.setLimite(limite);
                        System.out.println("O limite foi alterado para " + cartao.getLimite() + ".");
                    } else {
                        System.out.println("O novo limite deve ser um valor positivo!");
                    }

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 3:
                    System.out.println("Informe o valor da compra:");
                    float valorCompra;
                    valorCompra = entrada.nextFloat();
                    cartao.addComprar(valorCompra);

                    System.out.println("Uma nova compra de R$ " + valorCompra + " foi registrada.");

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 4:
                    System.out.println("Informe o valor do pagamento:");
                    float valorPagamento;
                    valorPagamento = entrada.nextFloat();
                    cartao.addPagar(valorPagamento);

                    System.out.println("Um novo pagamento de R$ " + valorPagamento + " foi registrado.");

                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = entrada.nextInt();
                    break;

                case 5:
                    System.out.println("---------------------------");
                    System.out.println("-- Informações do cartão --");
                    System.out.println("---------------------------");
                    System.out.println("Número: " + cartao.getNumero());
                    System.out.println("Saldo: " + cartao.getSaldo());
                    System.out.println("Limite: " + cartao.getLimite());
                    System.out.println("Bônus: " + cartao.getBonus());
                    System.out.println("Bandeira: " + cartao.getBandeira());
                    System.out.println();

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
