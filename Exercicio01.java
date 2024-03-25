import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 5 números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        double media = soma / tamanho;

        System.out.println("A média dos números é: " + media);
        System.out.println("Valores menores que a média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Valores iguais à média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == media) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Valores superiores à média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }

}
