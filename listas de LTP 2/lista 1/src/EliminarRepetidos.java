import java.util.Scanner;
import java.util.ArrayList;

public class EliminarRepetidos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tamanho = 20; // Define o tamanho do vetor
		int[] vetor = new int[tamanho]; // Cria um vetor de inteiros com o tamanho definido

		// Lê os elementos do vetor
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = scanner.nextInt(); // Lê e armazena cada elemento no vetor
		}

		ArrayList<Integer> vetorSemRepeticoes = new ArrayList<>(); // Cria um ArrayList para armazenar os elementos
																	// únicos

		// Cria um vetor sem repetições
		for (int i = 0; i < tamanho; i++) {
			if (!vetorSemRepeticoes.contains(vetor[i])) { // Verifica se o elemento já existe no ArrayList
				vetorSemRepeticoes.add(vetor[i]); // Se não existir, adiciona o elemento ao ArrayList
			}
		}

		// Imprime o vetor sem repetições
		System.out.println("Vetor sem repetições:");
		for (int valor : vetorSemRepeticoes) { // Itera sobre os elementos do ArrayList
			System.out.print(valor + " "); // Imprime cada elemento do vetor sem repetições
		}

		scanner.close(); // Fecha o Scanner
	}
}
