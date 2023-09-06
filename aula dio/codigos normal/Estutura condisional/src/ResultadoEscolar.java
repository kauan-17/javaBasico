import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, ResultadoEscolar;

        System.out.println("Digitar a su nota do primeiro bimestre: ");
         nota1 = scanner.nextDouble();

        System.out.println("Digitar a su nota do Segundo bimestre: ");
         nota2 = scanner.nextDouble();
    
        System.out.println("Digitar a su nota do terceiro bimestre: ");
         nota3 = scanner.nextDouble();

        System.out.println("Digitar a su nota do quarto bimestre: ");
         nota4 = scanner.nextDouble();

         ResultadoEscolar = (nota1 +nota2 + nota3 + nota4)/4;

        if(ResultadoEscolar >=6){
            System.out.println("aluno Aprovado! " + ResultadoEscolar);
        }

        else if (ResultadoEscolar >= 3 && ResultadoEscolar <=5 ){
            System.out.println("aluno de recuperação! " + ResultadoEscolar);

        }
        else {
            System.out.println("aluno reprovado! " + ResultadoEscolar);
        }
    
    }
    
}
