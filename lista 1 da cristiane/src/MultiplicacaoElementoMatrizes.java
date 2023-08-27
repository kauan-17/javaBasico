import java.util.Scanner;

public class MultiplicacaoElementoMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicita e lê o número de linhas (M) das matrizes
		System.out.print("Digite o número de linhas (M) das matrizes: ");
		int m = sc.nextInt();

		// Solicita e lê o número de colunas (N) das matrizes
		System.out.print("Digite o número de colunas (N) das matrizes: ");
		int n = sc.nextInt();

		int[][] matriz1 = new int[m][n]; // Cria a primeira matriz
		int[][] matriz2 = new int[m][n]; // Cria a segunda matriz

		// Lê os valores da primeira matriz
		System.out.println("Digite os valores da primeira matriz:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz1[i][j] = sc.nextInt(); // Lê e armazena os valores na posição i, j da matriz1
			}
		}

		// Lê os valores da segunda matriz
		System.out.println("Digite os valores da segunda matriz:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz2[i][j] = sc.nextInt(); // Lê e armazena os valores na posição i, j da matriz2
			}
		}

		int[][] resultado = multiplicarMatrizes(matriz1, matriz2); // Chama a função para multiplicar as matrizes

		// Imprime o resultado da multiplicação elemento a elemento das matrizes
		System.out.println("Resultado da multiplicação elemento a elemento das matrizes:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(resultado[i][j] + " "); // Imprime o valor da posição i, j do resultado
			}
			System.out.println(); // Pula para a próxima linha
		}

		sc.close(); // Fecha o Scanner
	}

	// Função para multiplicar duas matrizes elemento a elemento
	private static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
		int m = matriz1.length; // Obtém o número de linhas da matriz1
		int n = matriz1[0].length; // Obtém o número de colunas da matriz1
		int[][] resultado = new int[m][n]; // Cria uma matriz para armazenar o resultado

		// Loop para multiplicar as matrizes elemento a elemento
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				resultado[i][j] = matriz1[i][j] * matriz2[i][j]; // Calcula e armazena o resultado na posição i, j
			}
		}

		return resultado; // Retorna a matriz resultado
	}
}
