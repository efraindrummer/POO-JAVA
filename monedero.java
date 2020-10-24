public class monedero
{
   int saldoi;

   public monedero()
   {
      saldoi=1000;
   }
   
   public int meter(int m)
   {
      saldoi = m+saldoi;
      return saldoi;
   }
   
   public int sacar(int s) 
   {
      
      if(s<=saldoi)
      {
         saldoi=saldoi-s;
      }
      else
      {
         System.out.println("SALDO INSUFUCIENTE");
      }
      return saldoi;
   }
   
   public void consulta()
   {
      System.out.println("SU SALDO ES DE:" + saldoi);
   
   }

}
