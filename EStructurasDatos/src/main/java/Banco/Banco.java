/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Stefanny
 */
    public class Banco {
    private Queue<Cliente> colaClientes;
    private int clientesAtendidos;
    private int tiempoEsperaTotal;

    public Banco() {
        colaClientes = new LinkedList<>();
        clientesAtendidos = 0;
        tiempoEsperaTotal = 0;
    }

    public void llegadaCliente(Cliente cliente) {
        colaClientes.add(cliente);
        System.out.println("El cliente " + cliente.getNombre() + " ha llegado al banco y se ha agregado a la cola.");
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.poll();
            System.out.println("Atendiendo al cliente: " + cliente.toString());
            clientesAtendidos++;
            tiempoEsperaTotal += colaClientes.size();
        } else {
            System.out.println("No hay clientes en la cola para atender.");
        }
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public double getTiempoPromedioEspera() {
        if (clientesAtendidos > 0) {
            return (double) tiempoEsperaTotal / clientesAtendidos;
        } else {
            return 0;
        }
    }
}
