import javax.swing.JOptionPane;

public class Exec_8{
         public static void main(String[] args) {
        // Solicita ao usuário que insira o raio do círculo
        int raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio do círculo:"));

        // Solicita ao usuário que insira as coordenadas x e y do centro do círculo
        int centroX = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada x do centro:"));
        int centroY = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada y do centro:"));

        // Solicita ao usuário que insira a quantidade de linhas e colunas da matriz
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas da matriz:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas da matriz:"));

        // Chamando o método para criar a matriz com o círculo preenchido
        char[][] matriz = criarMatrizComCirculo(raio, centroX, centroY, linhas, colunas);

        // Chamando o método para exibir a matriz em uma caixa de diálogo
        exibirMatriz(matriz, "Matriz com Círculo");
    }

    // Método para criar uma matriz com um círculo preenchido
    public static char[][] criarMatrizComCirculo(int raio, int centroX, int centroY, int linhas, int colunas) {
        char[][] matriz = new char[linhas][colunas];  // Cria uma matriz vazia

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Calcula a distância entre o ponto (i, j) e o centro do círculo
                double distanciaCentro = Math.sqrt(Math.pow(i - centroX, 2) + Math.pow(j - centroY, 2));

                if (distanciaCentro <= raio) {
                    matriz[i][j] = '*';  // Se a distância for menor ou igual ao raio, preenche com '*'
                } else {
                    matriz[i][j] = ' ';  // Caso contrário, preenche com espaço em branco
                }
            }
        }

        return matriz;  // Retorna a matriz preenchida
    }

    // Método para exibir a matriz em uma caixa de diálogo
    public static void exibirMatriz(char[][] matriz, String titulo) {
        StringBuilder matrizString = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizString.append(matriz[i][j]).append(" ");  // Constrói a representação da matriz como uma string
            }
            matrizString.append("\n");  // Adiciona uma quebra de linha após cada linha da matriz
        }

        // Exibe a matriz em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, matrizString.toString(), titulo, JOptionPane.PLAIN_MESSAGE);
    }
}