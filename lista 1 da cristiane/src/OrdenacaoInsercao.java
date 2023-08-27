import java.util.Scanner;

public class OrdenacaoInsercao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Define o tamanho do vetor
		int tamanho = 10;
		// Cria um vetor de inteiros com o tamanho definido
		int[] vetor = new int[tamanho];

		// Lê os valores e insere em ordem crescente no vetor
		for (int i = 0; i < tamanho; i++) {
			// Lê um valor inteiro do usuário
			int valor = scanner.nextInt();
			// Chama a função para inserir o valor de forma ordenada no vetor
			inserirOrdenado(vetor, i, valor);
		}

		// Imprime o vetor ordenado
		System.out.println("Valores em ordem crescente:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + " ");
		}

		// Fecha o scanner
		scanner.close();
	}

	// Função para inserir um valor no vetor de forma ordenada
	public static void inserirOrdenado(int[] vetor, int tamanho, int valor) {
		int posicao = tamanho;
		// Encontra a posição correta para inserir o valor
		while (posicao > 0 && valor < vetor[posicao - 1]) {
			// Move os valores maiores uma posição à frente
			vetor[posicao] = vetor[posicao - 1];
			posicao--;
		}
		// Insere o valor na posição correta
		vetor[posicao] = valor;
	}
}
