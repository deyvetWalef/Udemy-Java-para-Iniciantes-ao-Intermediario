import java.io.IOException;
import java.util.Scanner;

public class CalcularIMC {
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {
        limparTela();
        float IMC, peso, altura;

        System.out.print("Entre com o seu peso(kg): ");
        peso = new Scanner(System.in).nextFloat();

        System.out.print("Entre com a sua altura (m): ");
        altura = new Scanner(System.in).nextFloat();

        IMC = (float) (peso / (Math.pow(altura, 2)));

        System.out.println("Seu IMC é de " + IMC);

        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (IMC > 24.9 && IMC <= 29.9) {
            System.out.println("Você está som sobrepeso.");
        } else if (IMC > 29.9 && IMC <= 40) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você está obeso ao extremo.");
        }
    }
}
