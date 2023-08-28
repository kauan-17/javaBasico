public class Operador {
    public static void main(String[] args) {
        int numero = 5;
        boolean variaveis = true;
        //--------------------------------------------------------------------------
        //Altera o valos de positivo para negativo 
        numero = -numero;
        System.out.println(numero);// valores negativo

        numero = numero * - 1;
        System.out.println(numero); // valor positivos
    // -----------------------------------------------------------------------------
        //como almenta o valor sem fazer alteraçõa na variavel inicial
        numero = numero + 1 ;
        System.out.println(numero); //almentarndo o valor em mas 1 
        
//-----------------------------------------------------------------------------------
// vareavel boolean
        variaveis = !variaveis; //deixar negativo
    
        System.out.println(variaveis);
        
    }
}
