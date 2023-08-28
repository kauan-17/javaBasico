import java.util.Scanner;

public class Vertor {
	public static void main(String[] args) {
		// Cria um objeto Scanner para ler input do usuário
		Scanner scanner = new Scanner(System.in);

		// Cria um vetor de inteiros com tamanho 10
		int[] vert = new int[10];

		// Loop para ler valores do usuário e preencher o vetor
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digitar os números do vetor %d: ", i + 1);
			vert[i] = scanner.nextInt();
		}

		// Loop para verificar e substituir valores negativos por 0 no vetor
		for (int i = 0; i < 10; i++) {
			if (vert[i] < 0) {
				vert[i] = 0;
			}
		}

		// Imprime uma mensagem antes de mostrar os elementos do vetor
		System.out.println("O valor do vetor é:");

		// Loop para imprimir os elementos do vetor
		for (int i = 0; i < 10; i++) {
			System.out.println(vert[i]); // Imprime o elemento atual do vetor
		}

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
