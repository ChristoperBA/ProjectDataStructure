/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solicitudes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antho
 */
public class ListaDobleC {

    private Node<Solicitud> head;
    private Node<Solicitud> tail;

    public void insertar(Solicitud value) {

        if (head == null) {
            head = new Node<>(value);
            tail = head;
            tail.setNext(head);
            head.setNext(tail);
            head.setBack(tail);
            tail.setBack(head);
        } else if (value.getCategoria().equalsIgnoreCase("ZAFIRO")) {
            Node<Solicitud> aux = new Node<>(value);
            aux.setNext(head);
            head = aux;
            tail.setNext(head);
            head.setBack(tail);

        } else if (value.getCategoria().equalsIgnoreCase("BRONCE")) {
            Node<Solicitud> aux = new Node<>(value);
            aux.setBack(tail);
            tail.setNext(aux);
            tail = aux;
            tail.setNext(head);
            head.setBack(tail);
        } else if (value.getCategoria().equalsIgnoreCase("ORO")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        } else if (value.getCategoria().equalsIgnoreCase("PLATA")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO") || aux.getNext().getValue().getCategoria().equalsIgnoreCase("ORO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);

        }
        head.setBack(tail);
        tail.setNext(head);

    }

    public void buscar(String cedula, DefaultTableModel modelo) {

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

    public void finalizarEstado(String cedula) {

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

    public void llenarTabla(DefaultTableModel modelo) {

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

    public void imprimirList() {

        Node<Solicitud> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());

    }

}
