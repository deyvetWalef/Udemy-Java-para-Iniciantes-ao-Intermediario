import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) throws Exception {
        Float[] notas = new Float[3];
        Float media = (float) 0;
        int i;

        for (i = 0; i < 3; i++) {
            System.out.print("Entre com a nota do " + (i + 1) + "° aluno: ");
            notas[i] = new Scanner(System.in).nextFloat();
            media+=notas[i];
        }

        for (i = 0; i < 3; i++) {
            System.out.println("Nota do " + (i + 1) + "° aluno: " +notas[i]);
            new Scanner(System.in).close();
        }

        System.out.println("Média dos alunos: "+(media/3));
    }

}
