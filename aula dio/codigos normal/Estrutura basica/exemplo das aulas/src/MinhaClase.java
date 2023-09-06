import java.util.Locale;
import java.util.Scanner;

public class MinhaClase {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
      
      System.out.println("Digite seu nome: ");
      String nome = scanner.next();

      System.out.println("Digitar o seu sobrenome: ");
      String sobrenome = scanner.next();

      System.out.println("Digitar a sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("digitar a sua altura: ");
      double  altura = scanner.nextDouble();

      System.out.println("Ola, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho "+ idade + " anos ");
      System.out.println("Minha altura é " + altura + " cm ");

    }
}
