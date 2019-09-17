
public class Esfera {
     private double raio;
     
     public Esfera (double r){
         this.setRaio (r);
     }
    
    public double getRaio(){
        return this.raio;
    }
    public void setRaio (double r){
        this.raio = r;
    }
     
    double volume (double vol){
        double volesfera = ((4.0/3.0) * 3.14 * raio*raio*raio);
        return volesfera;
    }
    
}
