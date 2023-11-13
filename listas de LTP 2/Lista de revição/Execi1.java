import java.util.Scanner;

public class Execi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        // Chamando os métodos para calcular estatísticas
        int totalVogais = contarVogais(texto);
        int totalConsoantes = contarConsoantes(texto);
        double percentualVogais = (double) totalVogais / texto.length() * 100;
        double percentualConsoantes = (double) totalConsoantes / texto.length() * 100;
        int[] vogaisIndividuais = contarVogaisIndividuais(texto);
        int numeroPalavras = contarPalavras(texto);

        // Exibindo as estatísticas
        System.out.println("a) Quantidade de vogais: " + totalVogais);
        System.out.println("   Percentual de vogais: " + percentualVogais + "%");
        System.out.println("b) Quantidade de consoantes: " + totalConsoantes);
        System.out.println("   Percentual de consoantes: " + percentualConsoantes + "%");
        System.out.println("c) Percentual de cada vogal separadamente:");
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vogais.length; i++) {
            double percentual = (double) vogaisIndividuais[i] / texto.length() * 100;
            System.out.println("   " + vogais[i] + ": " + percentual + "%");
        }
        System.out.println("d) Número de palavras: " + numeroPalavras);

        scanner.close();
    }

    // Método para contar vogais no texto
    public static int contarVogais(String texto) {
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Método para contar consoantes no texto
    public static int contarConsoantes(String texto) {
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    // Método para contar cada vogal separadamente
    public static int[] contarVogaisIndividuais(String texto) {
        int[] counts = new int[5]; // Uma posição para cada vogal (a, e, i, o, u)
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int index = vogais.indexOf(c);
            if (index != -1) {
                counts[index]++;
            }
        }
        return counts;
    }

    // Método para contar o número de palavras no texto
    public static int contarPalavras(String texto) {
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }
}
