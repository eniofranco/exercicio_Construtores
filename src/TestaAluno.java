
public class TestaAluno {
    
    public static void main (String[] args){
        
        Data data1 = new Data (14, 4, 1988);
        
        Aluno a1 = new Aluno ("Meriane", "025.147.892-58",data1);
           
           
        
        a1.getDataDeNascimento();
        
        String dados = a1.imprimir();
        System.out.println(dados);
    }
    
}
