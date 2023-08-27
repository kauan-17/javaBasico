import java.util.Scanner;

public class Dieta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicita e lê os alimentos da dieta
		System.out.print("Alimentos da Dieta: ");
		String dieta = sc.nextLine();

		// Solicita e lê o café da manhã
		System.out.print("Café da Manhã: ");
		String cafeDaManha = sc.nextLine();

		// Solicita e lê o almoço
		System.out.print("Almoço: ");
		String almoco = sc.nextLine();

		// Chama a função determinarJantar para calcular os alimentos para o jantar
		String jantar = determinarJantar(dieta, cafeDaManha, almoco);

		// Imprime os alimentos para o jantar
		System.out.println("Alimentos para o Jantar: " + jantar);

		sc.close();
	}

	// Função para determinar os alimentos para o jantar
	private static String determinarJantar(String dieta, String cafeDaManha, String almoco) {
		int[] dietaCount = new int[26]; // Array para contar a ocorrência de cada letra (A a Z)

		// Contagem de letras na dieta
		for (char c : dieta.toCharArray()) {
			dietaCount[c - 'A']++; // Incrementa o contador para a letra correspondente
		}

		// Subtrai as letras do café da manhã da contagem
		for (char c : cafeDaManha.toCharArray()) {
			dietaCount[c - 'A']--; // Decrementa o contador para a letra correspondente
		}

		// Subtrai as letras do almoço da contagem
		for (char c : almoco.toCharArray()) {
			dietaCount[c - 'A']--; // Decrementa o contador para a letra correspondente
		}

		StringBuilder jantar = new StringBuilder();

		// Monta a lista de alimentos para o jantar
		for (int i = 0; i < 26; i++) {
			if (dietaCount[i] < 0) {
				return "CHEATER"; // Retorna "CHEATER" se houver excesso de letras
			} else if (dietaCount[i] > 0) {
				jantar.append((char) ('A' + i)); // Adiciona a letra ao jantar
			}
		}

		return jantar.toString(); // Retorna a lista de alimentos para o jantar
	}
}
