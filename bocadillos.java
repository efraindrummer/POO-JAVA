import java.util.Scanner;
public class bocadillos{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int op, num=0;
      int total=0;
      do {
         System.out.println("1. BOCADILLOS DE JAMON COSTO=50 PESOS");
         System.out.println("2. BOCADILLOS DE QUESO COSTO=20 PESOS");
         System.out.println("3. PAPAS FRITAS COSTO=30 PESOS");
         System.out.println("4. REFRESCOS COSTO=17 PESOS");
         System.out.println("5. CERVEZAS COSTO=25 PESOS"); 
         System.out.println("6. SACAR COSTO TOTAL="); 
         System.out.println("INGRESE NUMERO DE PEDIDO:");
         num = sc.nextInt();
         switch(num){
            case 1:System.out.println("1. BOCADILLOS DE JAMON COSTO=50 PESOS");
               total = total + 50;
               break;
            case 2: System.out.println("2. BOCADILLOS DE QUESO COSTO=20 PESOS");
               total = total + 20;
               break;
            case 3: System.out.println("3. PAPAS FRITAS COSTO=30 PESOS");
               total = total + 30;
               break;
            case 4: System.out.println("4. REFRESCOS COSTO=17 PESOS");
               total = total + 17;
               break;
            case 5: System.out.println("5. CERVEZAS COSTO=25 PESOS"); 
               total = total + 25;
               break; 
            case 6: System.out.println("6. SACAR COSTO TOTAL="+total); 
               break;
         }  
      }while(num !=6);
      
   }
}