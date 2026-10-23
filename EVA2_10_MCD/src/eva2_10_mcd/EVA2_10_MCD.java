/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author calza
 */
public class EVA2_10_MCD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      System.out.println("MCD con recursividad:");
      System.out.println(maximoDiviRecu(180, 48));
   }
   
   public static int maximoDiviRecu(int valor1, int valor2) {
        // CASO BASE:
        // SI EL RESIDUO YA LLEGO A 0,
        // TERMINA LA RECURSIVIDAD
        if (valor2 == 0) {
            return valor1;
        } else {
            // SE LLAMA A SI MISMO
            return maximoDiviRecu(valor2,valor1 % valor2);
        }
    }

}
