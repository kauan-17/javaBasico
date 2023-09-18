import javax.swing.JOptionPane;

public class Exec_1 {
    // Método para encontrar a primeira posição de um caractere em uma string
    public static int encontrarPrimeiraPosição(String inputString, char targetChar) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                return i; // Retorna a posição se o caractere for encontrado
            }
        }
        // Se o caractere não for encontrado na string, retorne -1.
        return -1;
    }

    public static void main(String[] args) {
        try {
            // Solicita ao usuário que insira uma string e armazena o resultado em inputString
            String inputString = JOptionPane.showInputDialog("Digite uma string:");
            
            // Verifica se o usuário não inseriu uma string vazia ou cancelou a entrada
            if (inputString == null || inputString.isEmpty()) {
                // Exibe uma mensagem de erro em uma janela de diálogo
                JOptionPane.showMessageDialog(
                        null,
                        "String inválida. Por favor, insira uma string válida.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
                return; // Encerra o programa
            }

            // Solicita ao usuário que insira um caractere e armazena o resultado em charInput
            String charInput = JOptionPane.showInputDialog("Digite um caractere:");

            // Verifica se o usuário não inseriu um caractere vazio ou cancelou a entrada
            if (charInput == null || charInput.length() != 1) {
                // Exibe uma mensagem de erro em uma janela de diálogo
                JOptionPane.showMessageDialog(
                        null,
                        "Caractere inválido. Por favor, insira um único caractere válido.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
                return; // Encerra o programa
            }

            // Converte o primeiro caractere de charInput em um char
            char targetChar = charInput.charAt(0);

            // Chama o método findFirstPosition para encontrar a posição do caractere
            int position = encontrarPrimeiraPosição(inputString, targetChar);

            if (position != -1) {
                // Exibe a posição do caractere em uma janela de diálogo
                JOptionPane.showMessageDialog(
                        null,
                        "O caractere '" + targetChar + "' aparece na posição " + position,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                // Exibe uma mensagem informando que o caractere não foi encontrado
                JOptionPane.showMessageDialog(
                        null,
                        "O caractere '" + targetChar + "' não foi encontrado na string.",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } catch (Exception e) {
            // Captura e exibe exceções em uma janela de diálogo se ocorrerem
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu uma exceção: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}