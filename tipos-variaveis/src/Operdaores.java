public class Operdaores {

    public static void main(String[] args) {
        String nomeCompleto ="LINGUAGEM" + "JAVA"; /* + foram de juntar duas palavras */
        
        System.out.println(nomeCompleto);

        /*Mix de números e textos */
        
        String concatenacao ="?"; 
       //System.out.println(concatenacao);


        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
       
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        
        //Operadores

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual é diferente a numeroDois"+simNao);

        simNao = numero1 != numero2;
         


        //Comparação de Textos ou Objetos

        String nomeUm = "Thayliny";
        //String nomeDois = "Thayliny";
        String nomeDois = new String("Thayliny");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        // Para nueros Operador == para Objetos e nomes equals

        

        
    }
}
