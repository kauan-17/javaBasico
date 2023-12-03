import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int numeroDiscos = scanner.nextInt();

        System.out.println("Passos para resolver a Torre de Hanoi com " + numeroDiscos + " discos:");
        hanoi(numeroDiscos, 'A', 'B', 'C');
    }

    static void hanoi(int n, char origem, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            hanoi(n - 1, origem, destino, auxiliar);
            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            hanoi(n - 1, auxiliar, origem, destino);
        }
    }
}
