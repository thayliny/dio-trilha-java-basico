public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("TV Ligada? "+ smartTV.ligada);
        System.out.println("Canal Atual?"+smartTV.canal);
        System.out.println("Volume Atual?"+smartTV.volume);
       
        
        //System.out.println();

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada ?" +smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada ?" +smartTV.ligada);


        smartTV.mudarCanal(13);
        System.out.println("Canal Atual:"+smartTV.canal);




    }
}
