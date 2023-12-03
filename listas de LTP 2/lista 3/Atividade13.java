import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine().toLowerCase();

        if (Palindrome(palavra)) {
            System.out.println("\"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + palavra + "\" não é um palíndromo.");
        }
    }

    static boolean Palindrome(String palavra) {
        palavra = palavra.replaceAll("\\s+", ""); // Remove espaços em branco
        return PalindromeRecursive(palavra, 0, palavra.length() - 1);
    }

    static boolean PalindromeRecursive(String palavra, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        } else if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        } else {
            return PalindromeRecursive(palavra, inicio + 1, fim - 1);
        }
    }
}
