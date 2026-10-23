/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_factorial;

/**
 *
 * @author calza
 */
public class EVA2_9_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println(factorialCiclo(5));
      System.out.println(factorialRecu(5));
   }
   
   public static int factorialCiclo(int valor){
      int resultado = 1;
    for (int i = 1; i <= valor; i++) {
        System.out.print(i);      
        if (i < valor) {
            System.out.print(" x ");
        }
        resultado = resultado * i;
    }
    System.out.println();
    return resultado;
   }
   
   public static int factorialRecu(int valor){
      if(valor == 0)
         return 1;
      else
      return valor * factorialRecu(valor - 1);
      
   }
}
