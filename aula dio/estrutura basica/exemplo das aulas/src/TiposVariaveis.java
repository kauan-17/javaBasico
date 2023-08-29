public class TiposVariaveis {
  public static void main(String[] args) {
    
    double salarioMinimo = 2500.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal; //adiciona um cast na variavel numeroNormal 
// todas as variaveis que tem a palavra final são as que não pode ser mudar os valor armazenada dentro de uma variavel

    int numero = 5;
    numero = 10;
    System.out.println(numero);


   final double VALOR_DE_PI = 3.14; // quando usar o: "final" e costume decara as variavel de caixa alta

  }  
}
