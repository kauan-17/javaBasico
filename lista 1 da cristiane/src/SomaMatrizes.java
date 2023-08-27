import java.util.Scanner;

public class SomaMatrizes {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner sc = new Scanner(System.in);

		// Solicita ao usuário que insira o número de linhas (M) da matriz
		System.out.print("Digite o número de linhas (M) da matriz: ");
		int m = sc.nextInt();

		// Solicita ao usuário que insira o número de colunas (N) da matriz
		System.out.print("Digite o número de colunas (N) da matriz: ");
		int n = sc.nextInt();

		// Cria duas matrizes com base nas dimensões fornecidas
		int[][] matriz1 = new int[m][n];
		int[][] matriz2 = new int[m][n];

		// Lê os valores da primeira matriz
		System.out.println("Digite os valores da primeira matriz:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz1[i][j] = sc.nextInt();
			}
		}

		// Lê os valores da segunda matriz
		System.out.println("Digite os valores da segunda matriz:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz2[i][j] = sc.nextInt();
			}
		}

		// Chama a função para somar as matrizes
		int[][] resultado = somarMatrizes(matriz1, matriz2);

		// Imprime o resultado da soma das matrizes
		System.out.println("Resultado da soma das matrizes:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println(); // Pula para a próxima linha após cada linha da matriz
		}

		// Fecha o objeto Scanner para liberar recursos
		sc.close();
	}

	// Função para somar duas matrizes
	private static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
		int m = matriz1.length; // Número de linhas
		int n = matriz1[0].length; // Número de colunas
		int[][] resultado = new int[m][n]; // Cria a matriz resultado com as mesmas dimensões

		// Percorre as matrizes somando os elementos correspondentes
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		return resultado; // Retorna a matriz resultado
	}
}
