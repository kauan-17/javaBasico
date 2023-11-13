import java.util.Scanner;

public class Exwec_10 {
    public static void main(String[] args) {
        // Suponha que você tenha matrizes A, B e C já criadas e preenchidas.

        // Chamando o método para realizar a interseção entre A e B e armazenar o resultado em C
        char[][] matrizA = {{'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}};
        char[][] matrizB = {{' ', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', ' ', ' ', ' '}, {'*', ' ', '*', ' '}};
        char[][] matrizC = new char[4][4];

        intersecaoImagens(matrizA, matrizB, matrizC);

        // Agora, matrizC contém a interseção das imagens de matrizA e matrizB.
    }

    // Método para realizar a interseção entre imagens A e B e armazenar o resultado em C
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
}
