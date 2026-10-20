/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author calza
 */
public class MyQueue {
   private Nodo inicio;
    private Nodo fin;
    private int tamanio;

    // =========================
    // CONSTRUCTOR
    // =========================
    public MyQueue() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }


    // =========================
    // IMPRIMIR
    // =========================
    public void imprimir() {

        Nodo temp = inicio;

        while (temp != null) {

            System.out.print("[" + temp.getValor() + "]");

            temp = temp.getSiguiente();
        }

        System.out.println("");
    }


    // =========================
    // IMPRIMIR INVERSO
    // =========================
    public void imprimirInv() {

        Nodo temp = fin;

        while (temp != null) {

            System.out.print("[" + temp.getValor() + "]");

            temp = temp.getPrevio();
        }

        System.out.println("");
    }


    // =========================
    // LONGITUD O(1)
    // =========================
    public int longitud() {

        return tamanio;
    }


    // =========================
    // VALOR EN UNA POSICION
    // O(N)
    // =========================
    public int valorEn(int posicion) throws RuntimeException {

        int tama = longitud();

        // VALIDAR POSICION
        if (posicion >= 0 && posicion < tama) {

            Nodo temp = inicio;

            // RECORRER HASTA LA POSICION
            for (int i = 0; i < posicion; i++) {

                temp = temp.getSiguiente();
            }

            return temp.getValor();

        } else {

            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
        }
    }


    // =========================
    // LISTA VACIA O(1)
    // =========================
    public boolean listaVacia() {

        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }


    // =========================
    // VACIAR LISTA O(1)
    // =========================
    public void vaciarLista() {

        inicio = null;
        fin = null;
        tamanio = 0;
    }


    // =========================
    // AGREGAR AL FINAL O(1)
    // =========================
    public void agregar(int valor) {

        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {

            inicio = nuevo;
            fin = nuevo;

        } else {

            fin.setSiguiente(nuevo);

            nuevo.setPrevio(fin);

            fin = nuevo;
        }

        tamanio++;
    }


    // =========================
    // INSERTAR EN UNA POSICION
    // =========================
    public void insertarEn(int valor, int posicion) {

        int tama = longitud();

        // VALIDAR POSICION
        if (posicion < 0 || posicion > tama) {

            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
        }

        Nodo nuevo = new Nodo(valor);

        // LISTA VACIA
        if (inicio == null) {

            inicio = nuevo;
            fin = nuevo;

        // INSERTAR AL INICIO
        } else if (posicion == 0) {

            nuevo.setSiguiente(inicio);

            inicio.setPrevio(nuevo);

            inicio = nuevo;

        // INSERTAR AL FINAL
        } else if (posicion == tama) {

            nuevo.setPrevio(fin);

            fin.setSiguiente(nuevo);

            fin = nuevo;

        // INSERTAR EN CUALQUIER POSICION
        } else {

            Nodo temp = inicio;

            for (int i = 0; i < posicion; i++) {

                temp = temp.getSiguiente();
            }

            nuevo.setSiguiente(temp);

            nuevo.setPrevio(temp.getPrevio());

            temp.getPrevio().setSiguiente(nuevo);

            temp.setPrevio(nuevo);
        }

        tamanio++;
    }


    // =========================
    // BORRAR EN UNA POSICION
    // =========================
    public void borrarEn(int posicion) {

        if (inicio == null) {

            throw new RuntimeException(
                    "No se puede borrar: la lista esta vacia"
            );
        }

        int tama = longitud();

        if (posicion < 0 || posicion >= tama) {

            throw new RuntimeException(
                    "La posicion " + posicion + " no es valida!!!"
            );
        }

        // SOLO HAY UN NODO
        if (inicio == fin) {

            inicio = null;
            fin = null;

        // BORRAR PRIMER NODO
        } else if (posicion == 0) {

            inicio = inicio.getSiguiente();

            inicio.setPrevio(null);

        // BORRAR ULTIMO NODO
        } else if (posicion == tama - 1) {

            fin = fin.getPrevio();

            fin.setSiguiente(null);

        // BORRAR EN MEDIO
        } else {

            Nodo temp = inicio;
            int cont = 0;

            while (cont < posicion) {

                temp = temp.getSiguiente();

                cont++;
            }

            temp.getPrevio().setSiguiente(
                    temp.getSiguiente()
            );

            temp.getSiguiente().setPrevio(
                    temp.getPrevio()
            );
        }

        tamanio--;
    }


    // ========================================
    // QUEUE ---> FIFO
    // PRIMERO EN LLEGAR, PRIMERO EN SALIR
    // ========================================


    // AGREGA AL FINAL
    // O(1)
    public void push(int valor) {
        agregar(valor);
    }


    // LEE EL PRIMER VALOR SIN BORRARLO
    // O(1)
    public int peek() {
        if (listaVacia()) {
            throw new RuntimeException("No se puede leer: la cola esta vacia");
        }
        return inicio.getValor();
    }


    // LEE EL PRIMER VALOR Y LO BORRA
    // O(1)
    public int pop() {
        if (listaVacia()) {
            throw new RuntimeException("No se puede eliminar: la cola esta vacia");
        }
        int valor = inicio.getValor();
        borrarEn(0);
        return valor;
    }
}
