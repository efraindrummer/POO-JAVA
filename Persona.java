public class Persona{
   private String nombre, rfc;
   private int edad;
   private char sexo;
   private double peso, altura;
   public Persona(){
      nombre="";      rfc="";
      edad=0;      sexo='H';
      peso=0.0;      altura=0.0;
   }//fin de constructor defecto
   public Persona(String n, int e, char s){
      nombre=n;      rfc="";
      edad=e;
      comprobarSexo(s);
      peso=0.0;      altura=0.0;
   }//fin de constructor 2
   public Persona(String n, String r, int e, char s, double p, double a){
      nombre=n;      rfc=r;
      edad=e;
      comprobarSexo(s);
      peso=p;      altura=a;
   }//fin de constructor 3
   public int calcularIMC(){
      double imc;
      imc = peso /(altura*altura);
      if (imc < 18.5)
         return -1;//debajo del peso ideal
      else if(imc>18.5 && imc<=24.9)
         return 0;//peso normal
      else 
         return 1;//sobrepeso
   }//fin de calcularIMC()
    //Tarea incluir metodo esMayorDeEdad()
   public boolean mayoromenor(){
      int mom=0;
      if (mom >= 18)
         return true;//texto que indica que es mayor
      else
         return false;//texto que indica si es menor
   }// fin de mayor o menor 
   private void comprobarSexo(char s){
      if (s=='m'||s=='M'||s=='h'||s=='H')
         sexo=s;
      else
         sexo='H';
   }//fin de comprobarSexo()
   
   //Tarea hacer metodos set y get para todos los atributos
   public String tostring(){
      return (nombre+" "+rfc+" "+edad+" "+sexo+" "+peso+" "+altura);} 
}//fin de clase Persona