import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria um vetor com o tamanho fornecido
        int[] vetor = new int[tamanho];

        // Preenche o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Chama a função recursiva para encontrar o menor valor
        int menorValor = Menor(vetor);

        System.out.println("O menor valor no vetor é: " + menorValor);
    }

    static int Menor(int[] vetor) {
        return menorRecursive(vetor, 0, vetor.length - 1);
    }

    static int menorRecursive(int[] vetor, int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int menorNaMetadeEsquerda = menorRecursive(vetor, inicio, meio);
            int menorNaMetadeDireita = menorRecursive(vetor, meio + 1, fim);
            return Math.min(menorNaMetadeEsquerda, menorNaMetadeDireita);
        }
    }
}
