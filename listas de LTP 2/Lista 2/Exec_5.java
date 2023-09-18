import javax.swing.JOptionPane;

public class Exec_5 {
     public static void main(String[] args) {
        // Solicita ao usuário que insira um valor em dólares usando JOptionPane
        String inputDolar = JOptionPane.showInputDialog("Digite o valor em dólares:");
        double valorDolar = Double.parseDouble(inputDolar); // Converte a entrada para double

        // Chama o método para converter dólares em reais
        double valorReal = dolarParaReal(valorDolar);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, valorDolar + " dólares são equivalentes a " + valorReal + " reais.");

        // Solicita ao usuário que insira um valor em graus Celsius usando JOptionPane
        String inputCelsius = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
        double valorCelsius = Double.parseDouble(inputCelsius); // Converte a entrada para double

        // Chama o método para converter Celsius em Fahrenheit
        double valorFahrenheit = celsiusParaFahrenheit(valorCelsius);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, valorCelsius + " graus Celsius são equivalentes a " + valorFahrenheit + " graus Fahrenheit.");

        // Solicita ao usuário que insira um valor em segundos usando JOptionPane
        String inputSegundos = JOptionPane.showInputDialog("Digite a quantidade de segundos:");
        int segundos = Integer.parseInt(inputSegundos); // Converte a entrada para int

        // Chama o método para converter segundos em horas, minutos e segundos
        String resultadoSegundos = converterSegundosParaHorasMinutosSegundos(segundos);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "Tempo equivalente a: " + resultadoSegundos);

        // Solicita ao usuário que insira um valor em dias usando JOptionPane
        String inputDias = JOptionPane.showInputDialog("Digite a quantidade de dias:");
        int dias = Integer.parseInt(inputDias); // Converte a entrada para int

        // Chama o método para converter dias em anos, meses e dias
        String resultadoDias = converterDiasParaAnosMesesDias(dias);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "Tempo equivalente a: " + resultadoDias);

        // Solicita ao usuário que insira um valor decimal usando JOptionPane
        String inputDecimal = JOptionPane.showInputDialog("Digite um valor decimal:");
        double valorDecimal = Double.parseDouble(inputDecimal); // Converte a entrada para double

        // Chama o método para converter decimal em hexadecimal
        String valorHexadecimal = decimalParaHexadecimal(valorDecimal);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, valorDecimal + " em decimal é equivalente a " + valorHexadecimal + " em hexadecimal.");
    }

    // Métodos de conversão

    // Método para converter dólares para reais
    public static double dolarParaReal(double valorDolar) {
        double taxaConversao = 3.68;
        return valorDolar * taxaConversao;
    }

    // Método para converter graus Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double valorCelsius) {
        return (valorCelsius * 9 / 5) + 32;
    }

    // Método para converter segundos para horas, minutos e segundos e formatar o resultado
    public static String converterSegundosParaHorasMinutosSegundos(int segundos) {
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        return horas + " horas, " + minutos + " minutos e " + segundos + " segundos.";
    }

    // Método para converter dias para anos, meses e dias e formatar o resultado
    public static String converterDiasParaAnosMesesDias(int dias) {
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        return anos + " anos, " + meses + " meses e " + dias + " dias.";
    }

    // Método para converter decimal para hexadecimal
    public static String decimalParaHexadecimal(double valorDecimal) {
        int valorInteiro = (int) valorDecimal; // Converte o valor decimal em inteiro.
        return Integer.toHexString(valorInteiro).toUpperCase(); // Converte o valor inteiro em hexadecimal e o torna maiúsculo.
    }
}
