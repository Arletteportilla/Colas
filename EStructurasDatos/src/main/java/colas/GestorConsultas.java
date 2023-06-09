/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Stefanny
 */
public class GestorConsultas {
    
    private Queue<Consulta> cola;

    public GestorConsultas() {
        cola = new LinkedList<>(); //crear la cola se hace en el constructor 
        
    }
    
    
    public void nuevaConsulta(Consulta c){
        cola.add(c);
    
}
    public void atenderConsulta(){
        //sacar el elemento a eleminar 
        System.out.println(cola.element().toString());
        cola.poll();
    }
    public int consultaPendientes(){
         return cola.size();
    }
    
}
