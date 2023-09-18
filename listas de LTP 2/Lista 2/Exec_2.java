import java.util.Random;

public class Exec_2 {
    private static final int TAMANHO_MATRIZ = 20;

    // Método para encontrar o maior valor em uma submatriz de tamanho MxN
    public static int encontrarMaiorValor(int[][] matriz, int M, int N) {
        int maior = matriz[0][0]; // Inicializa a variável 'maior' com o primeiro elemento da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j]; // Atualiza 'maior' se encontrar um valor maior
                }
            }
        }
        return maior; // Retorna o maior valor encontrado
    }

    // Método para encontrar o menor valor em uma submatriz de tamanho MxN
    public static int encontrarMenorValor(int[][] matriz, int M, int N) {
        int menor = matriz[0][0]; // Inicializa a variável 'menor' com o primeiro elemento da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j]; // Atualiza 'menor' se encontrar um valor menor
                }
            }
        }
        return menor; // Retorna o menor valor encontrado
    }

    // Método para calcular a média dos valores em uma submatriz de tamanho MxN
    public static double calcularMedia(int[][] matriz, int M, int N) {
        int soma = 0; // Inicializa a variável 'soma' para acumular os valores da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                soma += matriz[i][j]; // Acumula os valores da matriz
            }
        }
        return (double) soma / (M * N); // Calcula a média dividindo a soma pelo número de elementos
    }

    // Método para imprimir a matriz na tela
    public static void imprimirMatriz(int[][] matriz, int M, int N) {
        System.out.println("Matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime cada elemento da matriz
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }

    // Método para imprimir a diagonal principal da matriz
    public static void imprimirDiagonalPrincipal(int[][] matriz, int M, int N) {
        if (M != N) {
            System.out.println("A matriz não é quadrada, não possui diagonal principal.");
            return; // Se a matriz não for quadrada, não há diagonal principal
        }

        System.out.println("Diagonal Principal:");
        for (int i = 0; i < M; i++) {
            System.out.print(matriz[i][i] + " "); // Imprime os elementos da diagonal principal
        }
        System.out.println(); // Quebra de linha após a diagonal principal
    }

    // Método para calcular o desvio padrão dos valores em uma submatriz de tamanho MxN
    public static double calcularDesvioPadrao(int[][] matriz, int M, int N) {
        double media = calcularMedia(matriz, M, N); // Calcula a média dos valores
        double somaDosQuadrados = 0; // Inicializa a variável para acumular a soma dos quadrados

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                double diferenca = matriz[i][j] - media; // Calcula a diferença entre o valor e a média
                somaDosQuadrados += diferenca * diferenca; // Acumula o quadrado da diferença
            }
        }

        double variancia = somaDosQuadrados / (M * N); // Calcula a variância
        return Math.sqrt(variancia); // Retorna a raiz quadrada da variância, que é o desvio padrão
    }

    // Método para normalizar os valores da matriz para o intervalo [0, 1]
    public static void normalizarMatriz(int[][] matriz, int M, int N) {
        int minimo = encontrarMenorValor(matriz, M, N); // Encontra o valor mínimo na matriz
        int maximo = encontrarMaiorValor(matriz, M, N); // Encontra o valor máximo na matriz

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = (int) Math.round(((matriz[i][j] - minimo) * 1.0 / (maximo - minimo)));
                // Normaliza cada valor subtraindo o mínimo, dividindo pela faixa (maximo - minimo),
                // e arredondando para o inteiro mais próximo
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ]; // Cria uma matriz 20x20
        Random random = new Random();

        // Preencher a matriz com valores aleatórios nas primeiras 4 linhas e colunas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100); // Valores aleatórios de 0 a 99
            }
        }

        // Escolher M e N
        int M = 4; // Número de linhas a serem processadas (primeiras M linhas)
        int N = 4; // Número de colunas a serem processadas (primeiras N colunas)

        // a) Retorne o maior valor
        int maiorValor = encontrarMaiorValor(matriz, M, N);
        System.out.println("Maior valor na matriz: " + maiorValor);

        // b) Retorne o menor valor
        int menorValor = encontrarMenorValor(matriz, M, N);
        System.out.println("Menor valor na matriz: " + menorValor);

        // c) Retorne a média dos valores
        double mediaValores = calcularMedia(matriz, M, N);
        System.out.println("Média dos valores na matriz: " + mediaValores);

        // d) Imprima a matriz na tela
        imprimirMatriz(matriz, M, N);

        // e) Imprima a diagonal principal
        imprimirDiagonalPrincipal(matriz, M, N);

        // f) Retorne o desvio padrão
        double desvioPadrao = calcularDesvioPadrao(matriz, M, N);
        System.out.println("Desvio Padrão dos valores na matriz: " + desvioPadrao);

        // g) Imprima a matriz normalizada no intervalo de [0, 1]
        System.out.println("Matriz Normalizada:");
        normalizarMatriz(matriz, M, N);
        imprimirMatriz(matriz, M, N);
    }
}
