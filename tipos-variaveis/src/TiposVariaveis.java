public class TiposVariaveis {
   
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudem a classe String que representa texto na aplicação

        double salarioMinimo = 2500;
        short numeroCurto = 1;


        int numeroNormal = numeroCurto;
        short numeroCurto2 =(short) numeroNormal;

        int numero = 5;
        numero = 10; 

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; /*  precisa colar o final para garantir que a var não seja alterada
        */



    }
}