import java.util.Scanner;

public class MultiplosDeX {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Cria um array de inteiros chamado 'vetor' com tamanho 10
		int[] vetor = new int[10];

		// Lê 10 números inteiros do usuário e armazena no array 'vetor'
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}

		// Solicita ao usuário que digite um número inteiro 'x'
		System.out.print("Digite o número x: ");
		int x = scanner.nextInt();

		// Inicializa uma variável para contar os múltiplos de 'x' no array
		int contadorMultiplos = 0;

		// Percorre cada número 'num' no array 'vetor'
		for (int num : vetor) {
			// Verifica se 'num' é múltiplo de 'x'
			if (num % x == 0) {
				// Incrementa o contador se 'num' é múltiplo de 'x'
				contadorMultiplos++;
			}
		}

		// Exibe a quantidade de múltiplos de 'x' encontrados no array
		System.out.println("Total de múltiplos de " + x + ": " + contadorMultiplos);

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
