import java.util.Scanner;

public class MultiplicacaoMatrizes3x3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Cria duas matrizes 3x3
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];

		// Lê os valores da primeira matriz 3x3
		System.out.println("Digite os valores da primeira matriz 3x3:");
		lerMatriz(sc, matriz1);

		// Lê os valores da segunda matriz 3x3
		System.out.println("Digite os valores da segunda matriz 3x3:");
		lerMatriz(sc, matriz2);

		// Realiza a multiplicação das matrizes 3x3
		int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

		// Imprime o resultado da multiplicação das matrizes 3x3
		System.out.println("Resultado da multiplicação das matrizes 3x3:");
		imprimirMatriz(resultado);

		sc.close(); // Fecha o Scanner
	}

	// Função para ler uma matriz
	private static void lerMatriz(Scanner sc, int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt(); // Lê e armazena os valores na posição i, j da matriz
			}
		}
	}

	// Função para multiplicar duas matrizes 3x3
	private static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] resultado = new int[3][3]; // Cria uma matriz para armazenar o resultado

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					resultado[i][j] += matriz1[i][k] * matriz2[k][j]; // Calcula e armazena o resultado na posição i, j
				}
			}
		}

		return resultado; // Retorna a matriz resultado
	}

	// Função para imprimir uma matriz
	private static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " "); // Imprime o valor da posição i, j da matriz
			}
			System.out.println(); // Pula para a próxima linha
		}
	}
}
