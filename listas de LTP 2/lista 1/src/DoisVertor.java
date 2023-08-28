import java.util.Scanner;

public class DoisVertor {
	public static void main(String[] args) {
		// Cria um objeto Scanner para ler input do usuário
		Scanner scanner = new Scanner(System.in);

		// Cria três vetores de inteiros com tamanho 10
		int[] vertA = new int[10]; // Vetor para armazenar os valores do primeiro conjunto
		int[] vertB = new int[10]; // Vetor para armazenar os valores do segundo conjunto
		int[] vertC = new int[10]; // Vetor para armazenar a diferença entre os elementos de vertA e vertB

		// Loop para ler valores do usuário e preencher o primeiro vetor (vertA)
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digitar os números do primeiro vetor %d: ", i + 1);
			vertA[i] = scanner.nextInt(); // Lê e armazena o valor no vetor vertA
		}

		// Loop para ler valores do usuário e preencher o segundo vetor (vertB)
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digitar os números do segundo vetor %d: ", i + 1);
			vertB[i] = scanner.nextInt(); // Lê e armazena o valor no vetor vertB
		}

		// Loop para calcular a diferença entre os elementos de vertA e vertB e
		// armazenar em vertC
		for (int i = 0; i < 10; i++) {
			vertC[i] = vertA[i] - vertB[i]; // Calcula a diferença e armazena no vetor vertC
		}

		// Loop para imprimir os elementos do vetor resultante (vertC)
		for (int i = 0; i < 10; i++) {
			System.out.println(vertC[i]); // Imprime o elemento atual do vetor vertC
		}

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
