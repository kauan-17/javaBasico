import javax.swing.JOptionPane;

public class Exec_9 {
    public static void main(String[] args) {
        // Solicita ao usuário a quantidade de linhas da matriz
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas da matriz:"));
        
        // Solicita ao usuário a quantidade de colunas da matriz
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas da matriz:"));

        // Cria uma matriz vazia com as dimensões especificadas
        char[][] matriz = new char[linhas][colunas];

        // Solicita ao usuário as coordenadas de início do quadrado
        int inicioLinha = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha de início do quadrado:"));
        int inicioColuna = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna de início do quadrado:"));

        // Solicita ao usuário as coordenadas de fim do quadrado
        int fimLinha = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha de fim do quadrado:"));
        int fimColuna = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna de fim do quadrado:"));

        // Chamando o método para preencher o quadrado na matriz
        preencherQuadrado(matriz, inicioLinha, inicioColuna, fimLinha, fimColuna);

        // Chamando o método para exibir a matriz em uma caixa de diálogo
        exibirMatriz(matriz, "Matriz com Quadrado");
    }

    // Método para preencher o quadrado na matriz com '*'
    public static void preencherQuadrado(char[][] matriz, int inicioLinha, int inicioColuna, int fimLinha, int fimColuna) {
        for (int i = inicioLinha; i <= fimLinha; i++) {
            for (int j = inicioColuna; j <= fimColuna; j++) {
                matriz[i][j] = '*';  // Preenche com '*' nas posições correspondentes ao quadrado
            }
        }
    }

    // Método para exibir a matriz em uma caixa de diálogo
    public static void exibirMatriz(char[][] matriz, String titulo) {
        String matrizString = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizString += matriz[i][j] + " ";  // Constrói a representação da matriz como uma string
            }
            matrizString += "\n";  // Adiciona uma quebra de linha após cada linha da matriz
        }

        // Exibe a matriz em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, matrizString, titulo, JOptionPane.PLAIN_MESSAGE);
    }
}
