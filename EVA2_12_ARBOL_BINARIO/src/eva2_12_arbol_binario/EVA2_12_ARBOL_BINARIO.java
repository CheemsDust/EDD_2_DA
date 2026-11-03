/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author calza
 */
public class EVA2_12_ARBOL_BINARIO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      ArbolBinario arbol = new ArbolBinario();
      arbol.agregar(13);
      arbol.agregar(10);
      arbol.agregar(18);
      arbol.agregar(2);
      arbol.agregar(11);
      arbol.agregar(17);
      arbol.agregar(20);
      arbol.agregar(16);
      System.out.println("preOrden");
      arbol.preOrden();
      System.out.println("inOrden");
      arbol.inOrden();
      System.out.println("postOrden");
      arbol.postOrden();
   }
   
}
