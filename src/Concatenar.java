import java.util.Scanner;

public class Concatenar {

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sobrenome;
        String nomeCompleto;

        System.out.print("Entre com o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com seu sobrenome: ");
        sobrenome = entrada.nextLine();

        nomeCompleto = nome + " " +sobrenome;

        System.out.println("Seu nome completo é "+nomeCompleto);

        entrada.close();
    }
}
