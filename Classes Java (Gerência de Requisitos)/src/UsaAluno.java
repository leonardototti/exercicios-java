import java.util.Scanner;

public class UsaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.nome = "Leonardo Caetano Totti";
        aluno.email = "leonardo.totti@edu.unifil.br";
        aluno.cidade = "Primavera do Leste";
        aluno.uf = "MT";

        int opc;
        String x = "0";

        System.out.println("** Tela inicial **");
        do {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Email: " + aluno.email);
            System.out.println("Cidade: " + aluno.cidade);
            System.out.println("UF: " + aluno.uf);

            System.out.println("");
            System.out.println("Escolha:");
            System.out.println("1- Alterar");
            System.out.println("2- Excluir");
            System.out.println("3- Pesquisar");
            System.out.println("4- Gravar");
            System.out.println("5- Sair");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    aluno.alterar();
                    System.out.println("Digite 0 para voltar ou qualquer outra coisa para finalizar.");
                    x = entrada.next();
                    break;

                case 2:
                    aluno.excluir();
                    System.out.println("Digite 0 para voltar ou qualquer outra coisa para finalizar.");
                    x = entrada.next();
                    break;

                case 3:
                    aluno.pesquisar();
                    System.out.println("Digite 0 para voltar ou qualquer outra coisa para finalizar.");
                    x = entrada.next();
                    break;

                case 4:
                    aluno.gravar();
                    System.out.println("Digite 0 para voltar ou qualquer outra coisa para finalizar.");
                    x = entrada.next();
                    break;

                case 5:
                    x = "1";
                    break;

                default:
                    System.out.println("Opção inválida, digite 0 para voltar ao menu principal.");
                    x = entrada.next();
            }
        } while(x.equals("0"));

    }
}