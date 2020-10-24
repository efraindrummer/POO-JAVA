public class testvehicle{
   public static void main(String[]args){
      vehicle v1 = new vehicle();
      vehicle v2 = new vehicle();
   
      System.out.println("valor="+v1.getmaxload());
      v1.setmaxload(34);
      System.out.println("valor="+v1.getmaxload());
   //
      System.out.println("valor="+v2.getmaxload());
      v2.setmaxload(24);
      System.out.println("valor="+v2.getmaxload());
   }
}