import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limparTela();

        int numero, contador, calculo;
        int fibonacci[] = new int[50];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.print("Entre com o valor para a série de Fibonacci: ");
        numero = new Scanner(System.in).nextInt();

        if (numero == 0 || numero == 1) {
            for (contador = 0; contador < numero; contador++) {
                System.out.print(fibonacci[contador] + " ");
            }
        } else {
            for (contador = 2; contador <= numero; contador++) {
                calculo = fibonacci[contador - 1] + fibonacci[contador - 2];
                fibonacci[contador] = calculo;
            }
            for (contador = 0; contador < numero; contador++) {
                System.out.print(fibonacci[contador] + " ");
            }
        }
    }
}
