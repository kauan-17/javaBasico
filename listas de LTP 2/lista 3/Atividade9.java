import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base (número inteiro): ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente (número inteiro não negativo): ");
        int expoente = scanner.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser não negativo.");
        } else {
            int resultado = pontecia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        }
    }

    static int pontecia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * pontecia(base, expoente - 1);
        }
    }
}
