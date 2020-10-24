import java.util.Scanner;

public class sueldo{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      int pph=0 , hrst=0 , sn=0;
      double dc=0 ,   ss=0, stss=0 , stdc=0;
      
      System.out.println("INGRESE PAGO POR HORAS:");
      pph = sc.nextInt();
      
      System.out.println("CUANTAS HORAS TRABAJO:");
      hrst = sc.nextInt();
      
      System.out.println("INGRESE TAZA DE DESCUENTO DE SS:");
      ss = sc.nextDouble();
      
      System.out.println("INGRESE TANTO DE DESCUENTO EN CONTRIBUCION:");
      dc = sc.nextDouble();
      
      System.out.println("SUELDO NETO:");
      sn = pph * hrst;
      
      System.out.println("EL SALARIO NETO DEL TRABAJADOR ES:"+sn);
      
      System.out.println("CON TAZA DE DESCUENTO EN SEGURO SOCIAL:");
      stss = (sn * ss) - sn;
      System.out.println("SALARIO CON DESCUENTO DEL SEGURO SOCIAL:"+stss);
          
      System.out.println("SALARIO CON DESCUENTO DEL SEGURO SOCIAL Y CONTRIBUCION:");
      stdc = (stss * dc) - stss;
      System.out.println("SALARIO CON DESCUENTO DEL SEGURO SOCIAL:"+stdc);
   
   }
}