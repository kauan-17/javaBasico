import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plano;
        
        System.out.println("Digita O seu Plano da operadora: ");
        plano = scanner.next();

        switch (plano){
            case "B":{
                System.out.println("100 minutos de ligação:");
                break;
            }
            case "M": {
                System.out.println("100 minutos de liga + whatisapp + intragam gratis");
                break;
            }
            case "T":{
                System.out.println("100 minutos de liga + whatisapp + intragam gratis + 5Gb Youtube");
                break;
            }
            default:
            System.out.println("pro favor digitar umas desa opição B, M, T");
        }
    }
}
