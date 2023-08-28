import java.util.ArrayList;
import java.util.Scanner;

public class SequenciaNumerica {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Cria um ArrayList de Integers para armazenar a sequência numérica
		ArrayList<Integer> sequencia = new ArrayList<Integer>();

		// Lê a sequência numérica até que o valor zero seja inserido
		while (true) {
			System.out.print("Digite um número (0 para parar): ");
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			sequencia.add(numero); // Adiciona o número à sequência
		}

		// Inicialização de variáveis para contagem e extremos
		int numerosMaioresQueZero = 0;
		int numerosMenoresQueZero = 0;
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		// Percorre a sequência para calcular os resultados
		for (int num : sequencia) {
			if (num > 0) {
				numerosMaioresQueZero++;
			} else if (num < 0) {
				numerosMenoresQueZero++;
			}

			if (num > maiorNumero) {
				maiorNumero = num;
			}

			if (num < menorNumero) {
				menorNumero = num;
			}
		}

		// Imprime os resultados
		System.out.println("Quantidade de números maiores que zero: " + numerosMaioresQueZero);
		System.out.println("Quantidade de números menores que zero: " + numerosMenoresQueZero);
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);

		// Imprime os números em ordem inversa da entrada
		System.out.println("Números em ordem inversa da entrada:");
		for (int i = sequencia.size() - 1; i >= 0; i--) {
			System.out.print(sequencia.get(i) + " ");
		}

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}
}
