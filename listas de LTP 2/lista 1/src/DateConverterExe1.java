import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateConverterExe1 {
	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Lê a data numérica fornecida pelo usuário
		System.out.print("Digite a data no formato ddmmaaaa: ");
		int numericDate = scanner.nextInt();

		// Fecha o scanner
		scanner.close();

		// Converte para um objeto Date
		String dateString = String.valueOf(numericDate);
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
		Date date;
		try {
			date = format.parse(dateString); // Tenta analisar a data fornecida no formato especificado
		} catch (Exception e) {
			System.out.println("Formato de data inválido");
			return; // Sai do programa em caso de erro
		}

		// Formata a data como "10 de maio de 2023"
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
		String formattedDate = outputFormat.format(date);

		// Imprime a data formatada
		System.out.println(formattedDate);
	}
}
