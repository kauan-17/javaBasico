import javax.swing.JOptionPane;

public class Exec_7 {
    public static void main(String[] args) {
        // Exemplo de uso do método somaImagens
        int rows = 3;
        int cols = 3;

        // Cria as matrizes A, B e C
        char[][] matrizA = {
            {' ', ' ', '*'},
            {' ', ' ', ' '},
            {'*', '*', '*'}
        };

        char[][] matrizB = {
            {' ', '*', ' '},
            {' ', ' ', ' '},
            {'*', '*', '*'}
        };

        char[][] matrizC = new char[rows][cols];

        // Chama o método para realizar a soma de A e B e armazenar o resultado em C
        somaImagens(matrizA, matrizB, matrizC);

        // Exibe a matriz resultante C
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para realizar a soma de duas matrizes A e B e armazenar o resultado em C
    public static void somaImagens(char[][] matrizA, char[][] matrizB, char[][] matrizC) {
        int rows = matrizA.length;
        int cols = matrizA[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Aplica as regras de soma de caracteres conforme especificado
                matrizC[i][j] = somarCaracteres(matrizA[i][j], matrizB[i][j]);
            }
        }
    }

    // Método para somar dois caracteres de acordo com as regras especificadas
    public static char somarCaracteres(char charA, char charB) {
        if (charA == ' ' && charB == '*') {
            return '*'; // Regra: ' ' + '*' = '*'
        } else if (charA == ' ' && charB == ' ') {
            return ' '; // Regra: ' ' + ' ' = ' '
        } else if (charA == '*' && charB == '*') {
            return '#'; // Regra: '*' + '*' = '#'
        } else {
            return ' '; // Trate os outros casos conforme necessário
        }
    }
}
