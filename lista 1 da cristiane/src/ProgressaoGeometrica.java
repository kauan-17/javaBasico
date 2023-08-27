import java.util.Scanner;

public class ProgressaoGeometrica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita o número de termos ao usuário.
		System.out.print("Digite o número de termos: ");
		int n = scanner.nextInt(); // Lê o número de termos

		// Solicita o primeiro termo ao usuário.
		System.out.print("Digite o primeiro termo: ");
		double a1 = scanner.nextDouble(); // Lê o primeiro termo

		// Solicita a razão ao usuário.
		System.out.print("Digite a razão: ");
		double r = scanner.nextDouble(); // Lê a razão
		scanner.close(); // Fecha o scanner

		// Exibe os termos da progressão geométrica
		System.out.println("Termos da Progressão Geométrica:");
		for (int i = 0; i < n; i++) {
			// Calcula o termo atual usando a fórmula: a1 * r^i
			double termo = a1 * Math.pow(r, i);
			// Exibe o termo atual
			System.out.println("Termo " + (i + 1) + ": " + termo);
		}

		// Calcula e exibe a soma dos elementos da progressão
		double soma = calcularSomaProgressao(a1, r, n);
		System.out.println("Soma dos elementos: " + soma);
	}

	// Função para calcular a soma dos elementos de uma progressão geométrica
	private static double calcularSomaProgressao(double a1, double r, int n) {
		if (r == 1) {
			return a1 * n; // Se r = 1, é uma progressão aritmética
		} else {
			// Calcula a soma usando a fórmula da série geométrica
			return a1 * (Math.pow(r, n) - 1) / (r - 1);
		}
	}
}
