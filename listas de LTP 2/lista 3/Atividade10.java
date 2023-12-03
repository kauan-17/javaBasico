import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int mdc = calculoMaximoDivisorComum(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
    }

    static int calculoMaximoDivisorComum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculoMaximoDivisorComum(b, a % b);
        }
    }
}
//estuda como que fazer
