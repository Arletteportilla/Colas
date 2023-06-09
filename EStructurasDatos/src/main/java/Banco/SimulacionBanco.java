/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author Stefanny
 */
public class SimulacionBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Simulación del sistema de atención al cliente en un banco");
        System.out.println("Ingrese la duración de la simulación en minutos:");
        int duracionSimulacion = entrada.nextInt();

        int tiempo = 0;
        while (tiempo < duracionSimulacion) {
            System.out.println("Minuto: " + tiempo);

            // Simular llegada de clientes
            System.out.println("¿Llegó un cliente al banco? (1: Sí, 0: No)");
            int llegadaCliente = entrada.nextInt();
            if (llegadaCliente == 1) {
                System.out.println("Ingresa el nombre del cliente:");
                String nombre = entrada.next();
                System.out.println("Ingresa el correo del cliente:");
                String correo = entrada.next();
                System.out.println("Ingresa la consulta del cliente:");
                String consulta = entrada.next();
                banco.llegadaCliente(new Cliente(nombre, correo, consulta));
            }

            // Simular atención de clientes
            System.out.println("¿Se atendió a un cliente? (1: Sí, 0: No)");
            int atenderCliente = entrada.nextInt();
            if (atenderCliente == 1) {
                banco.atenderCliente();
            }

            tiempo++;
        }

        System.out.println("Estadísticas de la simulación:");
        System.out.println("Clientes atendidos: " + banco.getClientesAtendidos());
        System.out.println("Tiempo promedio de espera en la cola: " + banco.getTiempoPromedioEspera() + " minutos");
    }
}
