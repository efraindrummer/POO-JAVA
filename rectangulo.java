public class rectangulo {
   private double longitud;
   private double ancho=0;
 
   public rectangulo(){
      longitud=1;
      ancho=1;}
      
   public rectangulo(double l , double an){
      longitud=l;
      ancho=an;
   }
      
   public double calcularperimetro(){
      double p=0;
      p=(longitud+ancho)*2;
      return p;}
      
   public double calculararea(){
      double a=0;
      a=longitud*ancho;
      return a;}
      
   public void mostrar(){
      System.out.println("Ancho= " + ancho + ", longitud= " + longitud);
   }
   
   public boolean esigual(rectangulo r){
      if(longitud == r.getlongitud() && ancho  == r.getancho())
         return true;
      else 
         return false;}
   public void setLongitud(double l){
      longitud=l;}
   public double getlongitud(){
      return longitud;}
   public void setancho(double an){
      ancho= an;}
   public double getancho(){
      return ancho;}
   
   
   
}