public class articulo{
   private int clavenum;
   private String descripcion; 
   private int precio;
   private int stock;

   public articulo(){
      clavenum=140506;
      descripcion="bueno";
      precio=34;
      stock=200;}

   public void setclavenum(int c){
      clavenum=c;}
   public int getclavenum(){
      return clavenum;}

   public void setdescripcion(String d){
      descripcion=d;}
   public String getdescripcion(){
      return descripcion;}

   public void setprecio(int p){
      precio=p;}
   public int getprecio(){
      return precio;}

   public void setstock(int s){
      stock=s;}
   public int getstock(){
      return stock;}    
}