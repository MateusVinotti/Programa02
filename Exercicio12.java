import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 12;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        long produto = 1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }

        if (produto == 1) {
            System.out.println("Não existem elementos pares positivos no vetor.");
        } else {
            System.out.println("O produto dos elementos pares positivos é: " + produto);
        }
    }

}
