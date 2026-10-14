/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA2_2_LISTA_SIMPLE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      
      ListaSimple lista = new ListaSimple();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.imprimir();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      System.out.println("valor del Nodo: " + lista.valorEn(0));
      
      System.out.println("Primera posicion del 100: " + lista.encontrarEn(100));
      System.out.println("Primera posicion del 200: " + lista.encontrarEn(200));
      System.out.println("Primera posicion del 999: " + lista.encontrarEn(999));
      System.out.println("Primera posicion del 700: " + lista.encontrarEn(700));
      
      lista.insertarEn(9999, 3);
      
      System.out.println("Borrar posicion 0:");
      lista.borrarEn(0);
      lista.imprimir();
      System.out.println("Borrar posicion 3:");
      lista.borrarEn(3);
      lista.imprimir();
      
      System.out.println(lista.longitud());
      
      System.out.println("imprecion inversa:");
      lista.imprimirInverso();
      
      
      lista.vaciarLista();
      lista.imprimir();
      System.out.println("Tamaño de la lista: " + lista.longitud());
      
      
      
   }
   
}
/*
      int [] arreglo = new int[1000000];
      long ini, fin, tiempo;
      ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
      for (int i = 0; i < arreglo.length; i++) {
         arreglo[i] = (int)(Math.random() * 100);
      }
      fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIZAR EL PROCESO
      tiempo = fin - ini;
      System.out.println("Tiempo arreglo = " + tiempo);
      
       ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
      for (int i = 0; i < 1000000; i++) {
         lista.agregar((int)(Math.random()) * 100);
      }
      fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIZAR EL PROCESO
      tiempo = fin - ini;
      System.out.println("Tiempo lista = " + tiempo);*/