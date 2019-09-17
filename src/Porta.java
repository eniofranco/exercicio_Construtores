
public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    public Porta (boolean a, String c, double dx, double dy, double dz){
        this.setAberta(a);
        this.setCor(c);
        this.setDimensaoX(dx);
        this.setDimensaoY(dy);
        this.setDimensaoZ(dz);
    }
    
    public boolean isAberta(){
        return this.aberta;
    }
    public void setAberta(boolean a){
        this.aberta = a;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public double getDimensaoX(){
        return this.dimensaoX;
    }
    public void setDimensaoX(double dx){
        this.dimensaoX = dx;
    }
    public double getDimensaoY(){
        return this.dimensaoY;
    }
    public void setDimensaoY(double dy){
        this.dimensaoY = dy;
    }
    public double getDimensaoZ(){
        return this.dimensaoZ;
    }
    public void setDimensaoZ(double dz){
        this.dimensaoZ = dz;
    }
    
    
    void fecha (){
        aberta = false;
        System.out.println("A Porta está fechada!");
    }
    
    void abre (){
        aberta = true;
        System.out.println("A porta está aberta");
    }
    
    boolean estaAberta(){
        abre();
        return true;

    }
    
}
