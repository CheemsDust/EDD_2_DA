/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author calza
 */
public class EVA2_11_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here 
      System.out.println("Fibonacci(0 =)" + fibonacciRecu(0));
      System.out.println("Fibonacci(4) = " + fibonacciRecu(4));
      System.out.println("Fibonacci(7) = " + fibonacciRecu(7));
      System.out.println("Fibonacci(11) =" + fibonacciRecu(11));
      System.out.println("Fibonacci(46) =" + fibonacciRecu(13));
   }
   
   public static int fibonacciRecu(int numero){
      if(numero == 0 || numero == 1){
         return 1;
      } else {
         return fibonacciRecu(numero - 2) + fibonacciRecu(numero - 1);
      }
   }
   
}
