import java.util.Scanner;

public class Exercicio02 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + i + ": " + vetor[i] + " - ");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
    }

}
