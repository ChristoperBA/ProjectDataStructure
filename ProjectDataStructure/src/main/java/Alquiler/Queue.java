/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antho
 */
public class Queue{

    private static Node<Solicitud> head;
    private static Node<Solicitud> tail;

    public static void enqueue(Solicitud value) {
        Node<Solicitud> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (value.getCategoria().equalsIgnoreCase("ZAFIRO")) {
            Node<Solicitud> aux = new Node<>(value);
            aux.setNext(head);
            head = aux;
        } 
        else if (value.getCategoria().equalsIgnoreCase("ORO")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        } 
        else if (value.getCategoria().equalsIgnoreCase("PLATA")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO") || aux.getNext().getValue().getCategoria().equalsIgnoreCase("ORO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        } 
        else if (value.getCategoria().equalsIgnoreCase("Bronce")){
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    public static Node<Solicitud> dequere(){
        
        Node<Solicitud> firstInQuere = head;
        
        if (head == null){
            System.out.println("La cola ya se encuentra vacia");
            return null;
        }else{
            head = head.getNext();
            return firstInQuere;
        }
        
    }
    public static void buscar(String cedula, DefaultTableModel modelo) {

        Node<Solicitud> aux = head;
        boolean exist = false;

        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equals(cedula)) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                Object[] TablaC = {aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                    aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
                exist = true;
                break;
            } else if (tail.getValue().getCedulaCliente().equals(cedula)) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                exist = true;
                Object[] TablaC = {aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                    aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
                break;
            }
            aux = aux.getNext();
        }
        if (exist == false) {
            JOptionPane.showMessageDialog(null, "No existe ninguna solicitud con la cedula ingresada");
        }

    }

    public static void finalizarEstado(String cedula) {

        Node<Solicitud> aux = head;
        boolean exist = false;

        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equals(cedula)) {
                aux.getValue().setEstadoSolicitud("Finalizado");
                JOptionPane.showMessageDialog(null, "Estado de la solicitud finalizado");
                exist = true;
                break;
            } else if (tail.getValue().getCedulaCliente().equals(cedula)) {
                aux.getValue().setEstadoSolicitud("Finalizado");
                JOptionPane.showMessageDialog(null, "Estado de la solicitud finalizado");
                exist = true;
                break;
            }
            aux = aux.getNext();
        }
        if (exist == false) {
            JOptionPane.showMessageDialog(null, "");
        }

    }

    public static void llenarTabla(DefaultTableModel modelo) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Node<Solicitud> aux = head;
        while (aux != tail) {
            Object[] TablaC = {aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
            aux = aux.getNext();
            modelo.addRow(TablaC);
        }
        Object[] TablaC = {tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getPlacaVehiculo(),
            tail.getValue().getPrecioTotal(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
        modelo.addRow(TablaC);

    }
    
    public static void llenarRegistros(DefaultTableModel modelo) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Node<Solicitud> aux = head;
        while (aux != tail) {
            Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
            aux = aux.getNext();
            modelo.addRow(TablaC);
        }
        Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getPlacaVehiculo(),
            tail.getValue().getPrecioTotal(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
        modelo.addRow(TablaC);

    }
    
    public static void imprimirCola() {

        Node<Solicitud> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());

    }

}
