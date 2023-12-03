import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria um vetor com o tamanho fornecido
        int[] vetor = new int[tamanho];

        // Preenche o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Chama a função recursiva para calcular a soma
        int soma = Soma(vetor);

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }

    static int Soma(int[] vetor) {
        return (vetor.length == 0) ? 0 : vetor[0] + Soma(subarray(vetor));
    }

    static int[] subarray(int[] vetor) {
        int[] resultado = new int[vetor.length - 1];
        System.arraycopy(vetor, 1, resultado, 0, vetor.length - 1);
        return resultado;
    }
}
