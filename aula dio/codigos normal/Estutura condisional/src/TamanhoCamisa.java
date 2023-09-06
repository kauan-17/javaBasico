import java.util.Scanner;

public class TamanhoCamisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String  sigla1 = "P";
        System.out.println("Qual e  tamanho da sua camisa: ");
        String sigla = scanner.next();

switch (sigla){
    case "P":{
        System.out.println("Pequeno");
        break;
    }
    case "M":{
        System.out.println("Medio");
        break;
    }
    case "G":{
        System.out.println("Grande");
        break;
    }
    case "GG":{
        System.out.println("Extra Grande:");
        break;
    }
    default:
        System.out.println("pro favor digitar umas desa opição P, M, G, GG");
        
    }

}
    }

