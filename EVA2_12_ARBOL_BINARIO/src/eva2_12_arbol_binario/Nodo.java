/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author calza
 */
public class Nodo {
   
    // ATRIBUTOS
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;


    // CONSTRUCTORES
    public Nodo() {
        derecha = null;
        izquierda = null;
    }

    public Nodo(int dato) {
        this.valor = dato;
        derecha = null;
        izquierda = null;
    }


    // GET Y SET

    public int getValor() {
        return valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setValor(int dato) {
        this.valor = dato;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}
