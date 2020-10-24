public class factura{
   int numfactura;
   producto[] serieproducto;
   
   public factura(){
      numfactura=0;
      serieproducto= new producto[10];
   }
   
   public factura (int n){
      numfactura= n;
      serieproducto=  new producto[10];
   }
   
   public void setnumfactura(int n ){
      numfactura= n;
   }
   public int getnumfactura(){
      return numfactura;
   }
   public void agregarp(producto p, int pos)
   {
      serieproducto[pos]=p;
   }
   public producto consultarp(int pos){
      return serieproducto[pos];
   } 
   public void modificarp(int pos, String cp, double pp){
      producto pa = new producto(cp, pp );
      serieproducto[pos] = pa;
   }
   
   

}