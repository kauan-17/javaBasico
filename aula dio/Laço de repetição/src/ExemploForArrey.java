import java.util.Scanner;

public class ExemploForArrey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] aluno = new String[5];

        for(int i = 0; i < 5; i++){
        System.out.println("Digitar o seu nome");
         aluno[i] =scanner.next();

        }
        for (int i = 0; i< 5; i++ ){
            System.out.println("o aluno no indece i = "+ i + " é " + aluno [ i ] );
        }    
    
    }
}
