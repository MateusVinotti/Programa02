import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("Valores do vetor com o dobro de cada número:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDobro[i]);
        }
    }

}
