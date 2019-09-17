
public class TestaPessoa {
    public static void main (String [] args)
    {
        Pessoa p1 = new Pessoa ("Josiane", 20);
     
        
        System.out.println("Idade antiga  " + p1.getIdade());
        
        
        p1.fazAniversario();
        System.out.println("Parabéns Você fez  " + p1.getIdade());
       
        
    }
    
}
