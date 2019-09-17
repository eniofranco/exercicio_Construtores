
public class TestaEsfera {
    public static void main (String[] args){
        
        Esfera esfera1 = new Esfera(1.24);
        
        
        double calculoDoVolume = esfera1.volume(esfera1.getRaio());
        System.out.println("O Volume da esfera será de: " +calculoDoVolume);
        
    }
    
}
