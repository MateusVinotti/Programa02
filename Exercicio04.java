import java.util.Scanner;

public class Exercicio04 {

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

        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < n) {
                System.out.println(i);
            }
        }
    }

}
