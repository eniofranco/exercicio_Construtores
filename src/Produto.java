
public class Produto {
    private double preco;
    private String nome;
    
    public Produto (double p, String n){
        this.setPreco (p);
        this.setNome (n);
    }
    
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double p){
        this.preco = p;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    
    double diminuir10 (double diminui){
        double promo =  (diminui * 0.9);
        return promo;
    }
    
    double aumenta25 (double aumenta){
        double acresc = (aumenta * 1.25);
        return acresc;
    }
    
}
