import java.util.Scanner;

public class Atividade6Iterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para a sequência de Collatz: ");
        int numero = scanner.nextInt();
        collatzIterative(numero);
    }

    static void collatzIterative(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(1);
    }
}
