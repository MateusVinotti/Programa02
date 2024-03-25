import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 5 números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite um número n:");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                count++;
            }
        }

        System.out.println("O número " + n + " aparece " + count + " vezes no vetor.");
    }

}
