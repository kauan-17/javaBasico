public class HeroXPClassification {
    public static void main(String[] args) {
        String nomeDoHeroi = "Super Herói";
        int xpDoHeroi = 7500;

        if (xpDoHeroi < 1000) {
            System.out.println(nomeDoHeroi + " é classificado como Ferro.");
        } else if (xpDoHeroi >= 1001 && xpDoHeroi <= 2000) {
            System.out.println(nomeDoHeroi + " é classificado como Bronze.");
        } else if (xpDoHeroi >= 2001 && xpDoHeroi <= 5000) {
            System.out.println(nomeDoHeroi + " é classificado como Prata.");
        } else if (xpDoHeroi >= 6001 && xpDoHeroi <= 7000) {
            System.out.println(nomeDoHeroi + " é classificado como Ouro.");
        } else if (xpDoHeroi >= 7001 && xpDoHeroi <= 8000) {
            System.out.println(nomeDoHeroi + " é classificado como Platina.");
        } else if (xpDoHeroi >= 8001 && xpDoHeroi <= 9000) {
            System.out.println(nomeDoHeroi + " é classificado como Ascendente.");
        } else if (xpDoHeroi >= 9001 && xpDoHeroi <= 10000) {
            System.out.println(nomeDoHeroi + " é classificado como Imortal.");
        } else {
            System.out.println(nomeDoHeroi + " é classificado como Radiante.");
        }
    }
}
