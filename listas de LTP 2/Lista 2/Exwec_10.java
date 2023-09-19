import java.util.Scanner;

public class Exwec_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de linhas das matrizes A e B
        System.out.print("Digite o número de linhas das matrizes A e B: ");
        int linhas = scanner.nextInt();

        // Solicita ao usuário o número de colunas das matrizes A e B
        System.out.print("Digite o número de colunas das matrizes A e B: ");
        int colunas = scanner.nextInt();

        // Cria as matrizes A, B e C com base nas dimensões especificadas
        char[][] matrizA = criarMatriz(linhas, colunas, "A");
        char[][] matrizB = criarMatriz(linhas, colunas, "B");
        char[][] matrizC = new char[linhas][colunas];

        // Chama o método para calcular a interseção entre A e B e armazenar o resultado em C
        intersecaoImagens(matrizA, matrizB, matrizC);

        // Exibe a matriz C resultante
        exibirMatriz(matrizC, "Matriz Resultante (C)");

        scanner.close();
    }

    // Método para criar uma matriz com entrada do usuário
    public static char[][] criarMatriz(int linhas, int colunas, String nome) {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[linhas][colunas];

        System.out.println("Digite a matriz " + nome + " (use '*' para representar elementos):");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                char elemento = scanner.next().charAt(0);
                matriz[i][j] = elemento;
            }
        }

        return matriz;
    }

    // Método para calcular a interseção entre as matrizes A e B e armazenar o resultado em C
    public static void intersecaoImagens(char[][] matrizA, char[][] matrizB, char[][] matrizC) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;

        // Percorre cada elemento das matrizes A e B
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Se ambos os elementos de A e B na mesma posição forem '*', então insira '*' em C
                if (matrizA[i][j] == '*' && matrizB[i][j] == '*') {
                    matrizC[i][j] = '*';
                } else {
                    matrizC[i][j] = ' '; // Caso contrário, insira espaço em branco em C
                }
            }
        }
    }

    // Método para exibir uma matriz no console
    public static void exibirMatriz(char[][] matriz, String titulo) {
        System.out.println(titulo);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
