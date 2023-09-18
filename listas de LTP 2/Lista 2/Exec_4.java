import javax.swing.JOptionPane;

public class Exec_4 {
     public static void main(String[] args) {
        // Solicita o número de linhas da matriz usando JOptionPane e converte para int
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da matriz:"));

        // Solicita o número de colunas da matriz usando JOptionPane e converte para int
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da matriz:"));

        // Cria uma matriz com base nas dimensões informadas
        int[][] matriz = new int[linhas][colunas];

        // Preenche a matriz com os valores inseridos pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Solicita e converte o valor para int usando JOptionPane
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:"));
                matriz[i][j] = valor;
            }
        }

        // Calcula o histograma e obtém o valor mais frequente
        int valorMaisFrequente = calcularEImprimirHistograma(matriz);

        // Exibe o valor mais frequente em uma caixa de diálogo usando JOptionPane
        JOptionPane.showMessageDialog(null, "Valor mais frequente: " + valorMaisFrequente);
    }

    // Método para calcular o histograma e encontrar o valor mais frequente
    public static int calcularEImprimirHistograma(int[][] matriz) {
        // Um array para contar a frequência de cada valor (0 a 63)
        int[] frequencia = new int[64];

        // Inicializa o valor mais frequente como -1 (nenhum valor encontrado ainda)
        int valorMaisFrequente = -1;

        // Inicializa a frequência máxima como 0
        int frequenciaMaxima = 0;

        // Percorre a matriz para contar a frequência de cada valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                frequencia[valor]++; // Incrementa a frequência do valor encontrado

                // Verifica se a frequência do valor atual é maior que a frequência máxima
                if (frequencia[valor] > frequenciaMaxima) {
                    frequenciaMaxima = frequencia[valor]; // Atualiza a frequência máxima
                    valorMaisFrequente = valor; // Atualiza o valor mais frequente
                }
            }
        }

        // Constrói uma mensagem com o histograma
        StringBuilder histogramaMsg = new StringBuilder("Histograma:\n");
        for (int valor = 0; valor < 64; valor++) {
            if (frequencia[valor] > 0) {
                histogramaMsg.append("Valor ").append(valor).append(": ").append(frequencia[valor]).append(" vezes\n");
            }
        }

        // Exibe o histograma em uma caixa de diálogo usando JOptionPane
        JOptionPane.showMessageDialog(null, histogramaMsg.toString());

        // Retorna o valor mais frequente encontrado
        return valorMaisFrequente;
    }
}
