public class producto{
   String codigo;
   double precio; 

   public producto(){
      codigo="";
      precio=0.0;
   }
   public producto(String c, double p){
      codigo=c;
      precio=p;
   }
   
   public void setcodigo(String c){
      codigo=c;
   }
   
   public String getcodigo(){
      return codigo;
   }
   
   public void setprecio(double p){
      precio=p;
   }
   
   public double getprecio(){
      return precio;
   }


   


}