import java.util.Scanner;
public class mostrar{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int  num=0;
      do {
         System.out.println("INGRESE UN NUMERO DEl 0 al 9 :");
         num = sc.nextInt();
         switch(num){
            case 0:System.out.println("****");
               System.out.println("*  *");
               System.out.println("*  *");
               System.out.println("****");
               break;
            case 1: System.out.println("*");
               System.out.println("*");
               System.out.println("*");
               System.out.println("*");
            
               break;
            case 2: System.out.println("****");
               System.out.println("   *");
               System.out.println("   *");
            
               System.out.println("****");
               System.out.println("*   ");
            
               System.out.println("*   ");
               System.out.println("****");
               break;
            case 3: System.out.println("****");
               System.out.println("   *");
               System.out.println("****");
               System.out.println("   *");
               System.out.println("****");
               break;
            case 4: System.out.println("*  *"); 
               System.out.println("****");
               System.out.println("   *");
               System.out.println("   *");
               break; 
            case 5: System.out.println("****"); 
               System.out.println("*   ");
               System.out.println("****");
               System.out.println("   *");
               System.out.println("****");
               break;
            case 6: System.out.println("****"); 
               System.out.println("*   ");
               System.out.println("****");
               System.out.println("*  *");
               System.out.println("****"); 
               break;
            case 7: System.out.println("****");
               System.out.println("  * ");
               System.out.println(" *  ");
               System.out.println("*   ");
               break;
            case 8: System.out.println("****"); 
               System.out.println("*  *");
               System.out.println("****");
               System.out.println("*  *");
               System.out.println("****");
               break;
            case 9: System.out.println("****"); 
               System.out.println("*  *");
               System.out.println("****");
               System.out.println("   *");
               System.out.println("****");
               break;
         }  
      }while(num !=10);
      
   }
}