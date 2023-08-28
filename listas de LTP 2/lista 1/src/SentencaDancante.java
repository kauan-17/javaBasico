import java.util.Scanner;

public class SentencaDancante {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário que digite a sentença
		System.out.println("Digite a sentença:");
		String sentenca = scanner.nextLine();

		// Chama a função para transformar a sentença em sentença dancante
		String sentencaDancante = transformarEmSentencaDancante(sentenca);

		// Exibe a sentença dancante resultante
		System.out.println("Sentença dançante: " + sentencaDancante);

		// Fecha o objeto Scanner para liberar recursos
		scanner.close();
	}

	// Função que transforma uma sentença em sentença dancante
	public static String transformarEmSentencaDancante(String sentenca) {
		// Cria um StringBuilder para construir a sentença dancante
		StringBuilder resultado = new StringBuilder();

		boolean maiuscula = true; // Começa com a primeira letra maiúscula
		// Percorre cada caractere na sentença original
		for (char c : sentenca.toCharArray()) {
			if (Character.isLetter(c)) { // Verifica se o caractere é uma letra
				if (maiuscula) {
					resultado.append(Character.toUpperCase(c));
				} else {
					resultado.append(Character.toLowerCase(c));
				}
				maiuscula = !maiuscula; // Alterna maiúscula/minúscula para o próximo caractere
			} else {
				resultado.append(c); // Mantém espaços e outros caracteres não letrais
			}
		}

		// Converte o resultado para String e retorna a sentença dancante
		return resultado.toString();
	}
}
