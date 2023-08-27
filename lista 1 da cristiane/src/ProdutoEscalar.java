import java.util.Scanner;

public class ProdutoEscalar {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Define o tamanho dos vetores
		int tamanho = 5;

		// Cria dois vetores de double com o tamanho definido
		double[] vetorX = new double[tamanho];
		double[] vetorY = new double[tamanho];

		// Lê os elementos do primeiro vetor
		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetorX[i] = scanner.nextDouble();
		}

		// Lê os elementos do segundo vetor
		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetorY[i] = scanner.nextDouble();
		}

		// Calcula o produto escalar entre os vetores
		double produtoEscalar = 0;
		for (int i = 0; i < tamanho; i++) {
			produtoEscalar += vetorX[i] * vetorY[i];
		}

		// Imprime os conjuntos de vetores e o produto escalar
		System.out.println("\nPrimeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetorX[i] + " ");
		}

		System.out.println("\nSegundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetorY[i] + " ");
		}

		System.out.println("\nProduto escalar: " + produtoEscalar);

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
