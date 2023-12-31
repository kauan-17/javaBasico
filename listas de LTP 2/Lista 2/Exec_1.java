import javax.swing.JOptionPane; // Importa a classe JOptionPane para interação com o usuário.

public class Exec_1 {
    // Método para encontrar a primeira posição de um caractere em uma string
    public static int encontrarCharacterPosition(String inputString, char targetChar) {
        try {
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == targetChar) {
                    return i; // Retorna a posição do caractere se encontrado
                }
            }
            // Se o caractere não for encontrado na string, retorne -1.
            return -1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return -1; // Retorna -1 em caso de erro
        }
    }

    // Método para verificar se há caracteres duplicados em uma string
    public static int verificarDuplicados(String inputString) {
        try {
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                for (int j = i + 1; j < inputString.length(); j++) {
                    if (currentChar == inputString.charAt(j)) {
                        return 0; // Retorna 0 se caracteres repetidos forem encontrados
                    }
                }
            }
            // Se nenhum caractere repetido for encontrado, retorne 1.
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return -1; // Retorna -1 em caso de erro
        }
    }

    // Método para encontrar o maior caractere em uma string
    public static char encontrarMaxCharacter(String inputString) {
        try {
            char maxChar = inputString.charAt(0);
            for (int i = 1; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                if (currentChar > maxChar) {
                    maxChar = currentChar; // Atualiza o maior caractere se necessário
                }
            }
            return maxChar; // Retorna o maior caractere encontrado
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return '\0'; // Retorna '\0' em caso de erro
        }
    }

    public static void main(String[] args) {
        try {
            // Solicita ao usuário que insira uma string usando JOptionPane
            String inputString = JOptionPane.showInputDialog("Digite uma string:");

            // Solicita ao usuário que insira um caractere para verificar sua posição na string usando JOptionPane
            char targetChar = JOptionPane.showInputDialog("Digite um caractere para verificar sua posição na string:").charAt(0);

            // Chama o método para encontrar a posição do caractere na string
            int position = encontrarCharacterPosition(inputString, targetChar);

            // Exibe o resultado usando JOptionPane
            if (position != -1) {
                JOptionPane.showMessageDialog(
                        null,
                        "O caractere '" + targetChar + "' aparece na posição " + position + " na string.",
                        "Resultado da Verificação de Posição",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "O caractere '" + targetChar + "' não foi encontrado na string.",
                        "Resultado da Verificação de Posição",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            // Chama o método para verificar se há caracteres duplicados na string
            int result = verificarDuplicados(inputString);

            // Exibe o resultado usando JOptionPane
            if (result == 1) {
                JOptionPane.showMessageDialog(
                        null,
                        "Não há caracteres repetidos na string.",
                        "Resultado da Verificação de Duplicatas",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (result == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Há caracteres repetidos na string.",
                        "Resultado da Verificação de Duplicatas",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            // Chama o método para encontrar o maior caractere na string
            char maxCharacter = encontrarMaxCharacter(inputString);

            // Exibe o resultado usando JOptionPane
            if (maxCharacter != '\0') {
                JOptionPane.showMessageDialog(
                        null,
                        "O maior caractere na string é '" + maxCharacter + "'",
                        "Resultado da Verificação do Maior Caractere",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
