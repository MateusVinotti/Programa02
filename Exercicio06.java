import java.util.Scanner;

public class Exercicio06 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < tamanho; i++) {
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Digite os 5 pesos correspondentes:");
        for (int i = 0; i < tamanho; i++) {
            pesos[i] = scanner.nextDouble();
        }

        double somaNotasPonderadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaNotasPonderadas / somaPesos;
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
    }

}
