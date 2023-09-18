import java.util.Random;

import javax.swing.JOptionPane;

public class Exec_3 {
   private static final int TAMANHO_MATRIZ = 20;

    // Métodos do exercício anterior (encontrarMaiorValor, encontrarMenorValor, calcularMedia, imprimirMatriz, etc.)

    // Método para imprimir uma matriz com JOptionPane
    public static void imprimirMatrizJOptionPane(int[][] matriz, int M, int N) {
        StringBuilder sb = new StringBuilder("Matriz:\n");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(matriz[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Método para realizar a soma de duas matrizes
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2, int M, int N) {
        int[][] resultado = new int[M][N]; // Cria uma matriz para armazenar o resultado da soma
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j]; // Soma os elementos das duas matrizes
            }
        }
        return resultado; // Retorna a matriz resultante
    }

    // Método para realizar a multiplicação de duas matrizes
    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2, int M, int N) {
        int[][] resultado = new int[M][N]; // Cria uma matriz para armazenar o resultado da multiplicação
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j]; // Multiplica os elementos das duas matrizes
            }
        }
        return resultado; // Retorna a matriz resultante
    }

    // Método para realizar a subtração de duas matrizes
    public static int[][] subtrairMatrizes(int[][] matriz1, int[][] matriz2, int M, int N) {
        int[][] resultado = new int[M][N]; // Cria uma matriz para armazenar o resultado da subtração
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j]; // Subtrai os elementos das duas matrizes
            }
        }
        return resultado; // Retorna a matriz resultante
    }

    // Método para calcular a matriz transposta
    public static int[][] matrizTransposta(int[][] matriz, int M, int N) {
        int[][] transposta = new int[N][M]; // A matriz transposta tem dimensões NxM
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposta[j][i] = matriz[i][j]; // Troca as posições das linhas e colunas
            }
        }
        return transposta; // Retorna a matriz transposta
    }

    public static void main(String[] args) {
        int[][] matriz1 = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];
        int[][] matriz2 = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];
        Random random = new Random();

        // Preencher as matrizes com valores aleatórios
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                matriz1[i][j] = random.nextInt(100); // Valores aleatórios de 0 a 99
                matriz2[i][j] = random.nextInt(100); // Valores aleatórios de 0 a 99
            }
        }

        // Imprimir as matrizes originais usando JOptionPane
        StringBuilder matriz1Str = new StringBuilder("Matriz 1:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                matriz1Str.append(matriz1[i][j]).append(" ");
            }
            matriz1Str.append("\n");
        }
        JOptionPane.showMessageDialog(null, matriz1Str.toString());

        StringBuilder matriz2Str = new StringBuilder("Matriz 2:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                matriz2Str.append(matriz2[i][j]).append(" ");
            }
            matriz2Str.append("\n");
        }
        JOptionPane.showMessageDialog(null, matriz2Str.toString());

        // a) Imprima a matriz resultante da soma dos elementos das duas matrizes em suas respectivas posições.
        int[][] soma = somarMatrizes(matriz1, matriz2, TAMANHO_MATRIZ, TAMANHO_MATRIZ);
        StringBuilder somaStr = new StringBuilder("Soma das matrizes:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                somaStr.append(soma[i][j]).append(" ");
            }
            somaStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, somaStr.toString());

        // b) Imprima a matriz resultante da multiplicação dos elementos das duas matrizes em suas respectivas posições.
        int[][] produto = multiplicarMatrizes(matriz1, matriz2, TAMANHO_MATRIZ, TAMANHO_MATRIZ);
        StringBuilder produtoStr = new StringBuilder("Produto das matrizes:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                produtoStr.append(produto[i][j]).append(" ");
            }
            produtoStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, produtoStr.toString());

        // c) Imprima a matriz resultante da subtração dos elementos das duas matrizes em suas respectivas posições
        int[][] diferenca = subtrairMatrizes(matriz1, matriz2, TAMANHO_MATRIZ, TAMANHO_MATRIZ);
        StringBuilder diferencaStr = new StringBuilder("Diferença das matrizes:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                diferencaStr.append(diferenca[i][j]).append(" ");
            }
            diferencaStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, diferencaStr.toString());

        // d) Imprima a matriz transposta
        int[][] transposta = matrizTransposta(matriz1, TAMANHO_MATRIZ, TAMANHO_MATRIZ);
        StringBuilder transpostaStr = new StringBuilder("Matriz Transposta:\n");
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                transpostaStr.append(transposta[i][j]).append(" ");
            }
            transpostaStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, transpostaStr.toString());
    }
}
