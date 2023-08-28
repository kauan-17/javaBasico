public class SmartTV {
    
       boolean ligar = false;
       int canal = 1;
       int volume =25;


    public void almentarCanal(){
    canal++;
    }

    public void diminuirCanal(){
    canal--;
    }

    public void mudarCanal(int novocanal){
        canal = novocanal;
    }

    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }

   public void liga (){
    ligar = true;
   }
   public void desligar(){
    ligar= false;
   }
}
