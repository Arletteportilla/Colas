/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Stefanny
 */
public class Ejecutable {
    public static void main(String[] args) {
        GestorConsultas gestor=  new GestorConsultas();
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa tu nombre:");
            String nombre=entrada.next();
            System.out.println("Ingresa tu correo: ");
            String correo=entrada.next();
            System.out.println("Ingresa el motivo de tu consulta:");
            String consulta= entrada.next();
            gestor.nuevaConsulta(new Consulta(nombre, correo, consulta));
        }
        System.out.println("Existen:"+gestor.consultaPendientes()+"consultas pendientes");
        while (gestor.consultaPendientes()>0){
            System.out.println("Si desea atender la consulta presione:");
            String bandera=entrada.next();
            if(bandera.equals("1")){
                gestor.atenderConsulta();
                System.out.println("existen: "+gestor.consultaPendientes()+"Consultas pedientes");
            }
        }
    }
    
}
