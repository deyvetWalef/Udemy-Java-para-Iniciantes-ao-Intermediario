import java.util.Scanner;
import java.io.IOException;

public class EntradaDeDados {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limparTela();

        Scanner entrada = new Scanner(System.in);
        // System.out.print("Entre com um valor para o ano: ");
        // int ano = entrada.nextInt();
        // System.out.println("O ano inserido é " + ano);

        // System.out.print("Entre com um valor para o dinheiro: ");
        // float dinheiro = entrada.nextFloat();
        // System.out.println("O valor em dinheiro é de R$" +dinheiro);

        System.out.print("Entre com o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("O seu nome é " + nome);

        entrada.close();
    }
}
