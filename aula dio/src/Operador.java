public class Operador {
    public static void main(String[] args) {
        int numero = 5;
        boolean variaveis = true;
    //--------------------------------------------------------------------------
    //Alterar o valor de positivo para negativo
        numero = -numero;
        System.out.println(numero);// valor negativo
        numero = numero * - 1;
        System.out.println(numero); // valor positivos
    // -----------------------------------------------------------------------------
    //ccomo aumentar o valor sem fazer alteração na variavel inicial
        numero = numero + 1 ;
        System.out.println(numero); //almentarndo o valor em mas 1        
    //-------------------------------------------------------------------------------
    // variável booleana
        variaveis = !variaveis; //deixar negativo
        System.out.println(variaveis);
        
    }
}
