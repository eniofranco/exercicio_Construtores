
public class TestaCasa {
     public static void main (String[] args){
         
        Casa casa1 = new Casa("Azul",true, true, false, 3);
      
        
        casa1.pinta("Azul");
        
        System.out.println("Portas abertas é " + casa1.quantasPortasAbertas());
        
    }
}
