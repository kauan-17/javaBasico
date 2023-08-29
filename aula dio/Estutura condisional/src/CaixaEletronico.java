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

            System.out.println(saldo);
        }
    
}

    } 