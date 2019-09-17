
public class Aluno {
    
    private String nome;
    private String cpf;
    private Data dataDeNascimento;
    
    public Aluno (String n, String c, Data d){
        this.setNome(n);
        this.setCpf(c);
        this.setDatadeNascimento(d);
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public void setNome (String n){
        this.nome = n;
    }
    public void setCpf (String c){
        this.cpf = c;
    }
    public void setDatadeNascimento(Data d){
        this.dataDeNascimento = d;
    }
    
    String imprimir(){
        
        String aluno;
        aluno = this.nome + "\n" + this.cpf + "\n" + this.dataDeNascimento.dataDeNascimento();
        return aluno;
    }

    void setdataDeNascimento(String d) {
        System.out.println(dataDeNascimento);

   
}}
