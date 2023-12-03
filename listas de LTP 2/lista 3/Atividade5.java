import java.util.Scanner;


public class Atividade5 
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os tempos de preparo do miojo e das ampulhetas
        int tempoPreparoMiojo = scanner.nextInt();
        int ampulheta1 = scanner.nextInt();
        int ampulheta2 = scanner.nextInt();

        // Calcular o tempo mínimo necessário
        int tempoMinimo = calcularTempoMinimo(tempoPreparoMiojo, ampulheta1, ampulheta2);

        // Exibir o resultado
        System.out.println(tempoMinimo);
    }

    public static int calcularTempoMinimo(int tempoPreparoMiojo, int ampulheta1, int ampulheta2) {
        // Iniciar a contagem a partir do momento em que as duas ampulhetas são viradas
        int tempoTotal = Math.max(ampulheta1, ampulheta2);

        // Enquanto a ampulheta menor (tempoPreparoMiojo) não se esgotar
        while (tempoTotal % tempoPreparoMiojo != 0) {
            tempoTotal += Math.min(ampulheta1, ampulheta2);
        }

        return tempoTotal;
    }
}

