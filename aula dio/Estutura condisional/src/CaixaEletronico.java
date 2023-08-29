import java.util.Scanner;

public class CaixaEletronico{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitar o seu saldo atual: ");
        double saldo =scanner.nextDouble();

        System.out.println("Digitar o valor a ser sacado: ");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado<saldo){
            saldo = saldo -valorSolicitado;
            System.out.println("o seu saldo atual e de: " + saldo);
        }
        else{
            System.out.println("Saldo Insuficiente");
            System.out.println(" o seu saldo atual e: "+ saldo);
        }
    
}

    } 