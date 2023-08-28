import java.util.Scanner;

public class ValoresIguais {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		int tamanho = 10;
		int[] vetor = new int[tamanho];

		// Lê os elementos do vetor
		System.out.println("Digite os elementos do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = scanner.nextInt();
		}

		boolean encontrouIguais = false;

		// Verifica e imprime valores iguais
		System.out.println("Valores iguais:");
		for (int i = 0; i < tamanho - 1; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				if (vetor[i] == vetor[j]) {
					encontrouIguais = true; // Sinaliza que valores iguais foram encontrados
					System.out.println(vetor[i]);
				}
			}
		}

		// Se não foram encontrados valores iguais, imprime mensagem
		if (!encontrouIguais) {
			System.out.println("Não foram encontrados valores iguais.");
		}

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
