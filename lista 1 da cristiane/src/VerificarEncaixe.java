import java.util.Scanner;

public class VerificarEncaixe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário

		// Solicita o número de casos de teste ao usuário
		System.out.print("Digite o número de casos de teste: ");
		int n = scanner.nextInt(); // Lê o número de casos de teste

		// Loop "for" para iterar através dos casos de teste
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor de A: ");
			int a = scanner.nextInt(); // Lê o valor de A
			System.out.print("Digite o valor de B: ");
			int b = scanner.nextInt(); // Lê o valor de B

			// Converte os valores para strings para facilitar a comparação dos dígitos
			String strA = Integer.toString(a);
			String strB = Integer.toString(b);

			// Verifica se os dígitos de B estão no final de A
			if (strA.endsWith(strB)) {
				System.out.println("encaixa");
			} else {
				System.out.println("não encaixa");
			}
		}

		scanner.close(); // Fecha o objeto Scanner
	}
}
