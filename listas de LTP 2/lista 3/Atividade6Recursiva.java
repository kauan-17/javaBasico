public import java.util.Scanner;

public class Atividade6Recursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para a sequência de Collatz: ");
        int numero = scanner.nextInt();
        collatzRecursive(numero);
    }

    static void collatzRecursive(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        } else if (n % 2 == 0) {
            collatzRecursive(n / 2);
        } else {
            collatzRecursive(3 * n + 1);
        }
    }
}
