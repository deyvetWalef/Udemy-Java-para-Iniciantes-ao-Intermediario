import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limparTela();
        int valor;
        int contador;

        System.out.print("Entre com o valor da tabuada que deseja: ");
        Scanner scanner = new Scanner(System.in);
        valor = scanner.nextInt();

        for (contador = 0; contador <= 10; contador++) {
            System.out.println(valor + " * " + contador + " = " + (valor * contador));
            scanner.close();
        }
    }
}
