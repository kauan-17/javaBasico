public class HeroXPClassofocationmetodo {

        public static void main(String[] args) {
            int vitorias = 75;
            int derrotas = 20;
    
            String resultado = calcularNivel(vitorias, derrotas);
    
            System.out.println("O Herói tem um saldo de " + (vitorias - derrotas) + " está no nível de " + resultado);
        }
    
        public static String calcularNivel(int vitorias, int derrotas) {
            int saldoVitorias = vitorias - derrotas;
    
            if (vitorias < 10) {
                return "Ferro";
            } else if (vitorias >= 11 && vitorias <= 20) {
                return "Bronze";
            } else if (vitorias >= 21 && vitorias <= 50) {
                return "Prata";
            } else if (vitorias >= 51 && vitorias <= 80) {
                return "Ouro";
            } else if (vitorias >= 81 && vitorias <= 90) {
                return "Diamante";
            } else if (vitorias >= 91 && vitorias <= 100) {
                return "Lendário";
            } else {
                return "Imortal";
            }
        }
    }
    
