import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String inputString = scanner.nextLine();

        String reversedString = reverteString(inputString);
        System.out.println("String invertida: " + reversedString);
    }

    static String reverteString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            // Concatena o último caractere com a string invertida do restante
            return str.charAt(str.length() - 1) + reverteString(str.substring(0, str.length() - 1));
        }
    }
}
