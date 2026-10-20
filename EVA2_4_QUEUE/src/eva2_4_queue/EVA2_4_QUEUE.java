/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author calza
 */
public class EVA2_4_QUEUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
        MyQueue cola = new MyQueue();
        System.out.println("=== QUEUE ===");
        // PROBAR PUSH
        cola.push(100);
        cola.push(200);
        cola.push(300);
        cola.push(400);
        System.out.println("Despues de hacer push:");
        cola.imprimir();
        // PROBAR PEEK
        System.out.println("Peek: " + cola.peek());
        System.out.println("La cola sigue igual despues de peek:");
        cola.imprimir();
        // PROBAR POP
        System.out.println("Pop: " + cola.pop());
        System.out.println("Cola despues del primer pop:");
        cola.imprimir();
        System.out.println("Pop: " + cola.pop());
        System.out.println("Cola despues del segundo pop:");
        cola.imprimir();
        // REVISAR NUEVO FRENTE
        System.out.println("Nuevo peek: " + cola.peek());
        // REVISAR TAMAÑO
        System.out.println("Tamanio actual: " + cola.longitud());
   }   
}
