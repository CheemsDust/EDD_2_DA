/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author calza
 */
public class ArbolBinario {
   private Nodo root;
    // CONSTRUCTOR
    public ArbolBinario() {
        root = null;
    }
    // AGREGAR
    public void agregar(int valor) {
        root = agregarRecu(root, valor);
    }
    // AGREGAR CON RECURSIVIDAD
    private Nodo agregarRecu(Nodo actual, int valor) {
        // CASO BASE
        if (actual == null) {
            return new Nodo(valor);
        }
        // SI ES MENOR, VA A LA IZQUIERDA
        if (valor < actual.getValor()) {
            actual.setIzquierda(agregarRecu(actual.getIzquierda(), valor)
            );
        // SI ES MAYOR, VA A LA DERECHA
        } else if (valor > actual.getValor()) {
            actual.setDerecha(agregarRecu(actual.getDerecha(), valor)
            );
        }
        return actual;
    }
    
    public void preOrden(){
       preOrdenRecu(root);
       System.out.println("");
    }
    
    private void preOrdenRecu(Nodo actual){
       if(actual != null){
          System.out.print(actual.getValor() + "-");
          preOrdenRecu(actual.getIzquierda()); //LEER EL LADO IZQUIERDO
          preOrdenRecu(actual.getDerecha());//LEER EL LADO DERECHO
       }
    }
    
    public void inOrden(){
       inOrdenRecu(root);
       System.out.println("");
    }
    
    private void inOrdenRecu(Nodo actual){
       if(actual != null){
        inOrdenRecu(actual.getIzquierda()); // LEER EL LADO IZQUIERDO
        System.out.print(actual.getValor() + "-");
        inOrdenRecu(actual.getDerecha()); // LEER EL LADO DERECHO
         }
    }
    
    public void postOrden(){
        postOrdenRecu(root);
        System.out.println("");
      }

    private void postOrdenRecu(Nodo actual){
        if(actual != null){
         postOrdenRecu(actual.getIzquierda()); // LEER EL LADO IZQUIERDO
         postOrdenRecu(actual.getDerecha()); // LEER EL LADO DERECHO
         System.out.print(actual.getValor() + "-");
    }
  }
}
