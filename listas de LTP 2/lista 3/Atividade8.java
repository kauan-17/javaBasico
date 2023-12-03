import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular a soma dos dígitos: ");
        int numero = scanner.nextInt();

        int soma = somaNumero(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
    }

    static int somaNumero(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + somaNumero(n / 10);
        }
    }
}
