import java.util.Scanner;

public class atividade1{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite um texto: ");
    String texto = scanner.nextLine();

    exibirEstatisticas(texto);
}

private static void exibirEstatisticas(String texto) {

    int totalCaracteres = texto.length();
    int totalVogais = contarVogais(texto);
    int totalConsoantes = totalCaracteres - totalVogais;

    double percentualVogais = calcularPercentual(totalVogais, totalCaracteres);
    double percentualConsoantes = calcularPercentual(totalConsoantes, totalCaracteres);

    System.out.println("Quantidade de vogais: "+totalVogais);
    System.out.println("percentual de vogais: "+percentualVogais +"%");
    System.out.println("Quantidade de COnsoantes: "+totalConsoantes);
    System.out.println("Percentual de consoantes: "+ percentualConsoantes+"%");

    calcularEExibirPercentualVogaisSeparadamente(texto);

    // Calcular e exibir o número de palavras
    int numeroPalavras = contarPalavras(texto);
    System.out.println("Número de palavras: " + numeroPalavras);

}


private static int contarVogais(String palavra) {
   int contador = 0;
   for (char letra : palavra.toLowerCase().toCharArray()){
    if (letra == 'a' || letra =='e' || letra =='i'|| letra =='0' || letra =='u'){
        contador ++;
    }
 }
 return contador;
}

private static double calcularPercentual(int quantidade, int total) {
    return (double) quantidade / total * 100;
}
public static void calcularEExibirPercentualVogaisSeparadamente(String texto) {
    String vogais = "aeiou";
    for (char vogal : vogais.toCharArray()) {
        int quantidadeVogal = contarVogal(texto, vogal);
        double percentualVogal = calcularPercentual(quantidadeVogal, texto.length());
        System.out.println("Percentual de " + vogal + ": " + percentualVogal + "%");
    }
}

public static int contarVogal(String texto, char vogal) {
    int contador = 0;
    for (char letra : texto.toLowerCase().toCharArray()) {
        if (letra == vogal) {
            contador++;
        }
    }
    return contador;
}

public static int contarPalavras(String texto) {
    String[] palavras = texto.split("\\s+");
    return palavras.length;
}
}