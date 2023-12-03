import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o texto
        System.out.println("Digite um texto:");
        String textoOriginal = scanner.nextLine();

        // Construir o dicionário
        Map<String, String> dicionario = construirDicionario(textoOriginal);

        // Codificar o texto
        String textoCodificado = codificarTexto(textoOriginal, dicionario);
        System.out.println("Texto Codificado: " + textoCodificado);

        // Decodificar o texto
        String textoDecodificado = decodificarTexto(textoCodificado, dicionario);
        System.out.println("Texto Decodificado: " + textoDecodificado);

        // Comparar os textos original e decodificado
        boolean saoIguais = compararTextos(textoOriginal, textoDecodificado);
        System.out.println("Os textos são iguais? " + saoIguais);
    }

    // a) Construir o dicionário
    public static Map<String, String> construirDicionario(String texto) {
        Map<String, String> dicionario = new HashMap<>();
        String[] palavras = texto.split("\\s+");

        for (int i = 0; i < palavras.length; i++) {
            dicionario.put(palavras[i], Integer.toString(i + 1));
        }

        return dicionario;
    }

    // b) Codificar o texto
    public static String codificarTexto(String texto, Map<String, String> dicionario) {
        StringBuilder textoCodificado = new StringBuilder();
        String[] palavras = texto.split("\\s+");

        for (String palavra : palavras) {
            textoCodificado.append(dicionario.get(palavra)).append(" ");
        }

        return textoCodificado.toString().trim();
    }

    // c) Decodificar o texto
    public static String decodificarTexto(String textoCodificado, Map<String, String> dicionario) {
        StringBuilder textoDecodificado = new StringBuilder();
        String[] codigos = textoCodificado.split("\\s+");

        for (String codigo : codigos) {
            for (Map.Entry<String, String> entry : dicionario.entrySet()) {
                if (entry.getValue().equals(codigo)) {
                    textoDecodificado.append(entry.getKey()).append(" ");
                    break;
                }
            }
        }

        return textoDecodificado.toString().trim();
    }

    // d) Comparar os textos
    public static boolean compararTextos(String original, String decodificado) {
        return original.equals(decodificado);
    }
}
