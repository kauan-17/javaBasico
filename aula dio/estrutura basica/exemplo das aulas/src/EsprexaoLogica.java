public class EsprexaoLogica {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 2;

        if(numero1>numero2){
            System.out.println("Numero 1 e maior que o numero 2");
        }
        if(numero1<numero2){
            System.out.println("Numero 1 e menor que o numero 2");
        }

        if(numero1==numero2){
            System.out.println("Numero 1 e ingual que o numero 2");
        }
        // exemplo com boolean 
/* 
        boolean sinNao = numero1 == numero2;
        System.out.println("Numero 1  e igual a numero 2?"+ sinNao);

         sinNao = numero1 !=  numero2;
        System.out.println("Numero 1  e diferente a numero 2?"+ sinNao);
      
        sinNao = numero1 > numero2;
        System.out.println("Numero 1  e maior a numero 2?"+ sinNao);
        
        sinNao = numero1 < numero2;
        System.out.println("Numero 1  e menor a numero 2"+ sinNao);
       */ 
      //usando a condição && e a ||

      boolean condicao1 = true;
      boolean condicao2 = false;

      if(condicao1 && condicao2){
        System.out.println("as dois condição sõa verdadeira");
      }
      if(condicao1 || condicao2){
        System.out.println("umas das condição e verdeira");
      }
      System.out.println("fim");
    }
}
