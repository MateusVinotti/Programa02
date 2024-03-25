import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            B[i] = A[tamanho - 1 - i];
        }

        System.out.println("Vetor B (invertido):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
