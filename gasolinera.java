import java.util.Scanner;
public class gasolinera{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      double precio=20, total, galones;
      
      System.out.println("CUANTOS GALOS DE GASOLINA CARGO:");
      galones = sc.nextDouble();
      
      total = (galones * 3.7854) * precio;
      System.out.println("EL PRECIO TOTAL EN LIBRES ES:"+total);
      
   }
}