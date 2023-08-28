import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário

		// Solicita a quantidade de termos da sequência de Fibonacci ao usuário
		System.out.print("Digite a quantidade de números da sequência: ");
		int n = scanner.nextInt(); // Lê o número de termos
		scanner.close(); // Fecha o objeto Scanner

		// Exibe uma mensagem indicando a quantidade de termos
		System.out.println("Sequência de Fibonacci com " + n + " termos:");

		// Usa um loop "for" para gerar e imprimir os números da sequência
		for (int i = 0; i < n; i++) {
			// Calcula o n-ésimo número da sequência usando a função "calcularFibonacci"
			int numero = calcularFibonacci(i);
			System.out.print(numero + ", "); // Imprime o número seguido de uma vírgula
		}
	}

	// Função recursiva para calcular o n-ésimo número da sequência de Fibonacci
	private static int calcularFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			// Calcula o n-ésimo número somando os dois anteriores usando recursão
			return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
		}
	}
}
