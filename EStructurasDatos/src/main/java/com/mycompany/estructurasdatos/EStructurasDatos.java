/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurasdatos;

import java.util.Scanner;

/**
 *
 * @author Stefanny
 */
public class EStructurasDatos {

    public static void main(String[] args) {
      
        //Promedio();  
        //BusquedaArreglo();
        //MaxMin();
        //MayoresQuePromedio();
        AscenDesen();
    }
    public static void Promedio() {
      Scanner sc = new Scanner(System.in);
      //Ingresamos la longitud del arreglo
      System.out.print("Ingrese la longitud del arreglo: ");
      int longitud = sc.nextInt();
      int[] arreglo = new int[longitud];
      //Ingresamos los elementos del arreglo
      System.out.println("Ingrese los elementos del arreglo: ");
      for (int i = 0; i < longitud; i++) {
         arreglo[i] = sc.nextInt();
      }
      //Calculamos el promedio
      double promedio = 0;
      for (int i = 0; i < longitud; i++) {
         promedio += arreglo[i];
      }
      promedio /= longitud;

      System.out.println("El promedio de los elementos del arreglo es: " + promedio);
   
    }
    public static void BusquedaArreglo(){
      Scanner sc = new Scanner(System.in);
      //Ingresamos la longitud del arreglo
      System.out.print("Ingrese la longitud del arreglo: ");
      int longitud = sc.nextInt();
      int[] arreglo = new int[longitud];
      //Ingresamos los elementos del arreglo
      System.out.println("Ingrese los elementos del arreglo: ");
      for (int i = 0; i < longitud; i++) {
         arreglo[i] = sc.nextInt();
      }
      //Ingresamos los elementos del arreglo
      System.out.print("Ingrese el valor que desea buscar en el arreglo: ");
      int valor = sc.nextInt();
      //Busamos el arreglo ingresado
      boolean encontrado = false;
      for (int i = 0; i < longitud; i++) {
         if (arreglo[i] == valor) {
            encontrado = true;
            break;
         }
      }
      //Salida del dato en caso de ser encontrado o no
      if (encontrado) {
         System.out.println("El valor " + valor + " se encuentra en el arreglo.");
      } else {
         System.out.println("lo siento el valor " + valor + " no se encuentra en el arreglo.");
      }
   }
   public static void MaxMin() {
      Scanner sc = new Scanner(System.in);
      //Ingresamos la longitud del arreglo
      System.out.print("Ingrese la longitud del arreglo: ");
      int longitud = sc.nextInt();
      int[] arreglo = new int[longitud];
      //Ingresamos los elementos del arreglo
      System.out.println("Ingrese los elementos del arreglo: ");
      for (int i = 0; i < longitud; i++) {
         arreglo[i] = sc.nextInt();
      }

      int maximo = arreglo[0];
      int minimo = arreglo[0];
      //Recorremos el arreglo buscando el maximo y minimo
      for (int i = 1; i < longitud; i++) {
         if (arreglo[i] > maximo) {
            maximo = arreglo[i];
         }

         if (arreglo[i] < minimo) {
            minimo = arreglo[i];
         }
      }

      System.out.println("El valor máximo del arreglo es: " + maximo);
      System.out.println("El valor mínimo del arreglo es: " + minimo);
      
   }


public static void MayoresQuePromedio() {
        //Ingresamos la longitud del arreglo
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = input.nextInt();

        // Crear el arreglo
        int[] arr = new int[n];

        // Pedir al usuario que ingrese los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Calcular el promedio de los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arr[i];
        }
        double promedio = (double) suma / n;

        // Contar la cantidad de números mayores que el promedio
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > promedio) {
                contador++;
            }
        }

        System.out.println("La cantidad de números mayores que el promedio es: " + contador);
    }

    public static void AscenDesen() {
        Scanner sc = new Scanner(System.in);
        //Ingresamos la longitud del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
      //Ingresamos los elementos del arreglo
        int[] arr = new int[n];
        System.out.println("Ingrese los números del arreglo:");

        //Llenamos el arreglo con los números ingresados por el usuario
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (Desendiente(arr)) {
            System.out.println("El arreglo está ordenado en orden ascendente");
        } else {
            System.out.println("El arreglo NO está ordenado en orden ascendente");
        }
    }

    public static boolean Desendiente(int[] arr) {
        /*
        Función que recibe un arreglo de números enteros y devuelve verdadero si el arreglo
        está ordenado en orden ascendente y falso en caso contrario.
        */
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}


   
    


