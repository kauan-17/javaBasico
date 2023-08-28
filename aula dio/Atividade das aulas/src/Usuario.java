public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.liga();
          System.out.println("Novo status: TV ligada? :" + smartTV.ligar);

          smartTV.desligar();
          System.out.println("Novo status: TV ligada? :" + smartTV.ligar);
        
        
         smartTV.diminuirVolume();
         smartTV.aumentarVolume();
        System.out.println("volume atual? :"+ smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("canal atual? :" + smartTV.canal);

        smartTV.almentarCanal();
        System.out.println("canal atual? :" + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("canal atual? :" + smartTV.canal);
    }
    
}
