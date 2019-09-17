
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa (String n, int i){
        this.setNome(n);
        this.setIdade (i);
    }
   
    public String getNome(){
        return this.nome;
    }
    public void setNome (String n){
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade (int i){
        this.idade = i;
    }
    
    void fazAniversario()
    {
        idade = this.idade + 1;
        
    }
}
