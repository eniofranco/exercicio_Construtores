
public class TestaPorta {
    public static void main (String[] args){
        
        Porta pt1 = new Porta(false, "Azul", 0.39, 1.77, 4.66);
        pt1.fecha();
        
        pt1.abre();
        
        System.out.println(pt1.getCor());
        System.out.println( pt1.getDimensaoX() );
        
       
        pt1.estaAberta();
        
    }
    
}
