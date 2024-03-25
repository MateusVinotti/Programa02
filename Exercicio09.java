import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(C[i] + " ");
        }
    }

}
