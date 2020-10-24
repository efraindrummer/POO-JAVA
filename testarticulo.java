public class testarticulo{
   public static void main(String[]args){
      articulo v1 = new articulo();
   
      System.out.println("valor="+v1.getclavenum());
      v1.setclavenum(171431);
      System.out.println("valor="+v1.getclavenum());
   
      System.out.println("valor="+v1.getdescripcion());
      v1.setdescripcion("malo");
      System.out.println("valor="+v1.getdescripcion());
   
      System.out.println("valor="+v1.getprecio());
      v1.setprecio(800);
      System.out.println("valor="+v1.getprecio());
   
      System.out.println("valor="+v1.getstock());
      v1.setstock(171);
      System.out.println("valor="+v1.getstock());
   
   }
}


