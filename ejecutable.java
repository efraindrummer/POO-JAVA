import java.util.Scanner;
public class ejecutable{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int nf;
      producto pa;
      factura f = new factura();
      System.out.println("INGRESE EL NUMERO DE LA FACTURA:");
      nf = sc.nextInt();
      f.setnumfactura(nf);
      System.out.println("numero de la factura:"+ f.getnumfactura());
      pa = new producto("c1",24);
      f.agregarp(pa , 0);
      pa = new producto("m03",109);
      f.agregarp(pa , 1);
      pa = new producto("p3w",205);
      f.agregarp(pa , 2);
      for(int i=0; i <=2; i++){
         pa = f.consultarp(i);
         System.out.println("producto"+(i+1));
         System.out.println("cod:"+pa.getcodigo()+"; pr:"+ pa.getprecio());
      }   
      
   }

}