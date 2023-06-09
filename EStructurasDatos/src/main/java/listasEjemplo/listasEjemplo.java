/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasEjemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Stefanny
 */
public class listasEjemplo {
    public static void main(String[] args) {
        //ArrayList();
        //ListString();
        ListaNombres();
    }
    
    public static void ArrayList(){
        
        List<Integer>lista= new ArrayList<Integer>();
        List<Integer>lista2= new ArrayList<Integer>();
        lista2.add(8);
        lista2.add(4);
        lista.add(1);
        lista.add(5);
        lista.add(3);
        System.out.println(lista);
        lista.addAll(0,lista2);
        System.out.println(lista2);
        System.out.println(lista);
        System.out.println(lista.contains(1));
        System.out.println(lista.get(3));
        //Como recorrer listas 
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));      
        }
        //forma 2
        for(Integer integer : lista){
            System.out.println(integer);
        }
        for (Iterator<Integer> iterator = lista2.iterator(); iterator.hasNext();) {
            System.out.println(iterator);
            Integer next = iterator.next();
            System.out.println(next);   
        }
        ListIterator l=lista.listIterator();
        lista.remove(0);//eliminar por posicion 
        System.out.println(lista);
        lista.set(0,10);//Remplazar valores
        System.out.println(lista);
        System.out.println(lista.subList(0, 2));//subdividir Listas
        System.out.println(lista.subList(2, 4));
    }  
    public static void ListString(){
        String[]arreglo={"Arlette","JuanPablo","Santiago","Ricardo","Anthony","Danny","Nicolas","Kevin","Leonardo","Anderson"};
        List<String> lista=new ArrayList<>();
        //lista= Arrays.asList(arreglo);
        for (int i = 0; i <arreglo.length; i++) {
            lista.add(arreglo[i]);           
        }
        System.out.println(lista);
        lista.remove("Santiago");
        System.out.println(lista);
         //Un progrmaa que reciba 5 nombres, los guarde en una lista y permita buscar o eliminarlos.
    }  
        public static void ListaNombres(){

        List<String> nombres = new ArrayList<>();

        // Ingresar 5 nombres y guardarlos en la lista
        nombres.add("Arlette");
        nombres.add("Santiago");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");

        // Buscar nombre
        String nombreBuscar = "Nombre2";
        int posicion = nombres.indexOf(nombreBuscar);
        if (posicion != -1) {
            System.out.println("El nombre " + nombreBuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El nombre " + nombreBuscar + " no se encuentra en la lista.");
            // Agregar nombre
            nombres.add("NombreNuevo");
            System.out.println("El nombre " + "NombreNuevo" + " ha sido agregado a la lista.");
        }

        // Eliminar nombre
        String nombreEliminar = "Nombre3";
        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("El nombre " + nombreEliminar + " se ha eliminado de la lista.");
        } else {
            System.out.println("El nombre " + nombreEliminar + " no se encuentra en la lista.");
        }

        // Imprimir la lista de nombres con sus posiciones
        System.out.println("Lista de nombres:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));
        }
    }
}

