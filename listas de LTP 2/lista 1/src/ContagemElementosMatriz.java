import java.util.Scanner;

public class ContagemElementosMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3]; // Criação de uma matriz 3x3 para armazenar os valores.

		System.out.println("Digite os valores da matriz 3x3:");
		lerMatriz(sc, matriz); // Chama a função lerMatriz para preencher a matriz com os valores digitados.

		int[] contagem = contarElementos(matriz); // Chama a função contarElementos para contar a ocorrência de cada
													// elemento.

		System.out.println("Contagem de elementos na matriz:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Elemento " + i + ": " + contagem[i] + " vezes"); // Imprime a contagem de cada elemento.
		}

		sc.close();
	}

	private static void lerMatriz(Scanner sc, int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt(); // Preenche a matriz com os valores lidos do usuário.
			}
		}
	}

	private static int[] contarElementos(int[][] matriz) {
		int[] contagem = new int[11]; // Cria um array para armazenar a contagem de ocorrências de cada elemento
										// (índices de 0 a 10).

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				contagem[matriz[i][j]]++; // Incrementa a contagem do elemento presente na matriz.
			}
		}

		return contagem; // Retorna o array contendo as contagens.
	}
}
