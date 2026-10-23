/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_recursividad;

/**
 *
 * @author calza
 */
public class EVA2_8_RECURSIVIDAD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      imprimirCiclo(5);
      imprimirRecu(5);
   }
   
   public static void imprimirCiclo(int numero){
      for (int i = numero; i >= 1; i--) {
         System.out.print(i + " - ");
      }
      System.out.println("");
   }
   
   
   public static void imprimirRecu(int numero){
      //resuelve una parte del problema
      System.out.print(numero + " - ");
      //se llama a si mismo
      if(numero > 1) //detener la recursividad
      imprimirRecu(numero - 1);
     
      
   }
   
   
}
