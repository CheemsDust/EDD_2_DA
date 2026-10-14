/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author calza
 */
public class Nodo {
   //DOS ATRIBUTOS
   private int valor;
   private Nodo siguiente;
   //CONSTRUCTORES:
   public Nodo(){
      siguiente = null;//ESTO ES MUY IMPORTANTE MARCAR EN NULL EL OBJETO, MARCA EL FIN DE LA LISTA
   }
   public Nodo(int dato){//PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
      this.valor = dato;
      siguiente = null;
   }
   //get y set

   public int getValor() {
      return valor;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setValor(int dato) {
      this.valor= dato;
   }

   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }
   
}
