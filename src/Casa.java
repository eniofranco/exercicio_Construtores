
public class Casa {
   private String cor;
   private boolean porta1;
   private boolean porta2;
   private boolean porta3;
   private int total;
   
   public Casa (String c, boolean p1,boolean p2,boolean p3,int t){
       this.setCor(c);
       this.setPorta1(p1);
       this.setPorta2(p2);
       this.setPorta3(p3);
       this.setTotal(t);
       
   }
   
   public String getCor(){
       return this.cor;
   }
   public void setCor(String c){
       this.cor = c;
   }
   public boolean isPorta1(){
       return porta1;
   } 
   public void setPorta1(boolean p1){
       this.porta1 = p1;
   }
   public boolean isPorta2(){
       return porta2;
   }
   public void setPorta2(boolean p2){
       this.porta2 = p2;
   }
   public boolean isPorta3(){
       return porta3;
   }
   public void setPorta3 (boolean p3){
       this.porta3 = p3;
   }
   public int getTotal(){
       return this.total;
   }
   public void setTotal (int t){
       this.total = t;
   }
   void pinta (String s){
       cor = s;
       System.out.println("A cor da casa é "+cor);
   }
   
   int quantasPortasAbertas(){
       if (porta1 == true){
           int p1 = 1;
           total = p1;
       }
       if (porta2 == true){
           int p2 = 1;
           total = total + p2;
       }
       if (porta3 == true){
           int p3 = 1;
           total = total + p3;
       }
       return total;
       
   }

}
