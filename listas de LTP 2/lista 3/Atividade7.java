import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = scanner.nextInt();

        if (Prime(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    static boolean Prime(int n) {
        return n > 1 && PrimeRecursive(n, 2);
    }

    static boolean PrimeRecursive(int n, int divisor) {
        if (divisor >= n) {
            return true;
        }
        return n % divisor != 0 && PrimeRecursive(n, divisor + 1);
    }
}
