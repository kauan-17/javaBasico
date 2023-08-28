import java.util.Scanner; // Importa a classe Scanner para permitir entrada de dados pelo usuário.

public class ProgressaoAritmetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados.

		System.out.print("Digite o número de termos da progressão: ");
		int n = scanner.nextInt(); // Lê o número de termos da progressão a partir da entrada do usuário.

		System.out.print("Digite o primeiro termo da progressão: ");
		double a1 = scanner.nextDouble(); // Lê o primeiro termo da progressão a partir da entrada do usuário.

		System.out.print("Digite a razão da progressão: ");
		double r = scanner.nextDouble(); // Lê a razão da progressão a partir da entrada do usuário.

		System.out.println("\nTermos da progressão aritmética:");
		double sumOfElements = 0; // Variável para armazenar a soma dos elementos da progressão.
		for (int i = 0; i < n; i++) {
			double term = a1 + i * r; // Calcula o valor do termo atual da progressão.
			sumOfElements += term; // Adiciona o termo à soma dos elementos.
			System.out.print(term + " "); // Imprime o termo atual.
		}

		System.out.println("\n\nSoma dos elementos da progressão: " + sumOfElements); // Imprime a soma dos elementos.

		scanner.close(); // Fecha o objeto Scanner para liberar recursos.
	}
}
