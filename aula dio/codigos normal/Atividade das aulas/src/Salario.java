import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Salario {
    public static void main(String[] args) {
        
       selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        Scanner scanner = new Scanner(System.in);
        String[] candidatos = new String[10] ;//new String[5];
        int candidatosSecioanados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;

        for(int i = 0; i <  10; i++){
                System.out.println("Digitar o seu nome");
                 candidatos[i] =scanner.next();
        
                }
            while (candidatosSecioanados < 5 && candidatosAtual<candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretemdido();
             System.out.println("\n\t O candidato: "+ candidato + " Solicitou este valor de salário. "+ salarioPretendido);
            if(salarioBase>= salarioPretendido){
                System.out.println("\n \t O candidato: "+candidato+" foi selacionado para a vaga.");
                candidatosSecioanados++;
            }
            candidatosAtual ++;
           
        }
 }


    static double valorPretemdido(){
        return ThreadLocalRandom.current().nextDouble(1800.00,2500.00);
    }


        static void analisarCandidato(double salarioPretendido){
             double salarioBase =2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para funcionario. ");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para funcionario com contra proposta.");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos. ");
        }
       
}

static void imprimirSelecionados(){
    Scanner scanner = new Scanner(System.in);
   String[] candidatos = new String[5] ;
    for(int i = 0; i <  10; i++){
                System.out.println("Digitar o seu nome");
                 candidatos[i] =scanner.next();
        
                }

                for(int i = 0; i <  candidatos.length; i++){
                    System.out.println("O candidatos de Nº "+ (i+ 1) + "é"+ candidatos[i]);
                }
            } 
}

