import java.util.Scanner;

public class VetoresIntercalados {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		int tamanho = 10;
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetorResultado = new int[tamanho * 2]; // O vetor resultante terá o dobro do tamanho

		// Lê os elementos do primeiro vetor
		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = scanner.nextInt();
		}

		// Lê os elementos do segundo vetor
		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = scanner.nextInt();
		}

		// Intercala os elementos dos vetores
		for (int i = 0; i < tamanho; i++) {
			vetorResultado[i * 2] = vetor1[i]; // Posições pares
			vetorResultado[i * 2 + 1] = vetor2[i]; // Posições ímpares
		}

		// Imprime o vetor resultante intercalado
		System.out.println("Vetor resultante intercalado:");
		for (int i = 0; i < vetorResultado.length; i++) {
			System.out.print(vetorResultado[i] + " ");
		}

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
