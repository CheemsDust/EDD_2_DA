/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author calza
 */
public class EVA2_5_STACK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
        MyStack pila = new MyStack();
        System.out.println("=== STACK ===");
        // PROBAR PUSH
        pila.push(100);
        pila.push(200);
        pila.push(300);
        pila.push(400);
        System.out.println("Despues de hacer push:");
        pila.imprimir();
        // PROBAR PEEK
        System.out.println("Peek: " + pila.peek());
        System.out.println("La pila sigue igual despues de peek:");
        pila.imprimir();
        // PROBAR POP
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pila despues del primer pop:");
        pila.imprimir();
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pila despues del segundo pop:");
        pila.imprimir();
        // REVISAR NUEVO TOPE
        System.out.println("Nuevo peek: " + pila.peek());
        // REVISAR TAMAÑO
        System.out.println("Tamanio actual: " + pila.longitud());
   }
   
}
