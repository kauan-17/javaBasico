import java.util.Scanner;

public class ImprimirElementosAcimaDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicita e lê a ordem da matriz (N x N)
		System.out.print("Digite a ordem da matriz (N x N): ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n]; // Cria uma matriz de ordem N x N

		// Lê os valores da matriz
		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt(); // Lê e armazena os valores na posição i, j da matriz
			}
		}

		// Imprime os elementos acima da diagonal principal
		System.out.println("Elementos acima da diagonal principal:");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) { // Começa a partir da próxima coluna da diagonal
				System.out.print(matriz[i][j] + " "); // Imprime o valor da posição i, j
			}
		}

		sc.close(); // Fecha o Scanner
	}
}
