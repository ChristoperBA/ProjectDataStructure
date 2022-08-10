/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antho
 */
public class Queue {

    private static Node<Solicitud> head;
    private static Node<Solicitud> tail;

    public static boolean enqueue(Solicitud value) {
        boolean v;
        Node<Solicitud> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            v = true;
        } else if (value.getCategoria().equalsIgnoreCase("ZAFIRO")) {
            Node<Solicitud> aux = new Node<>(value);
            aux.setNext(head);
            head = aux;
            v = true;
        } else if (value.getCategoria().equalsIgnoreCase("ORO")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            v = true;
        } else if (value.getCategoria().equalsIgnoreCase("PLATA")) {
            Node<Solicitud> aux = head;
            while (aux.getNext().getValue().getCategoria().equalsIgnoreCase("ZAFIRO") || aux.getNext().getValue().getCategoria().equalsIgnoreCase("ORO")) {
                aux = aux.getNext();
            }
            Node<Solicitud> temp = new Node<>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            v = true;
        } else if (value.getCategoria().equalsIgnoreCase("Bronce")) {
            tail.setNext(newNode);
            tail = newNode;
            v = true;
        } else {
            v = false;
        }
        return v;
    }

    public static Node<Solicitud> dequere() {

        Node<Solicitud> firstInQuere = head;

        if (head == null) {
            System.out.println("La cola ya se encuentra vacia");
            return null;
        } else {
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

    public static void llenarPanelAV(String cedula, JTextField f, JTextField d, JTextField cP, JTextField ma, JTextField mo, JTextField a, JTextField ex, JTextField ca, JTextField es) {

        Node<Solicitud> aux = head;
        boolean exist = false;
        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equals(cedula)) {
                f.setText(aux.getValue().getFecha());
                d.setText(String.valueOf(aux.getValue().getDias()));
                cP.setText(String.valueOf(aux.getValue().getCantidadPasajeros()));
                ma.setText(aux.getValue().getMarca());
                mo.setText(aux.getValue().getModelo());
                a.setText(String.valueOf(aux.getValue().getAño()));
                ex.setText(aux.getValue().getExtras());
                ca.setText(aux.getValue().getCategoria());
                es.setText(aux.getValue().getEstadoSolicitud());
                exist = true;
                break;
            }
            aux = aux.getNext();
        }
        if (tail.getValue().getCedulaCliente().equals(cedula)) {
            f.setText(tail.getValue().getFecha());
            d.setText(String.valueOf(tail.getValue().getDias()));
            cP.setText(String.valueOf(tail.getValue().getCantidadPasajeros()));
            ma.setText(tail.getValue().getMarca());
            mo.setText(tail.getValue().getModelo());
            a.setText(String.valueOf(tail.getValue().getAño()));
            ex.setText(tail.getValue().getExtras());
            ca.setText(tail.getValue().getCategoria());
            es.setText(tail.getValue().getEstadoSolicitud());
            exist = true;
        }
        if (exist == false) {
            JOptionPane.showMessageDialog(null, "Error, No se puede cargar los datos de la solicitud");
        }

    }

    public static void cambiarEstado(String cedula) {

        Node<Solicitud> aux = head;
        boolean exist = false;

        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equals(cedula)) {
                aux.getValue().setEstadoSolicitud("Finalizada");
                JOptionPane.showMessageDialog(null, "Estado de la solicitud finalizado");
                exist = true;
                break;
            } else if (tail.getValue().getCedulaCliente().equals(cedula)) {
                aux.getValue().setEstadoSolicitud("Finalizada");
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

    public static void llenarTabla(String tipo, DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        if (tipo.equalsIgnoreCase("LlenarRegistro")) {
            Node<Solicitud> aux = head;
            while (aux != tail) {
                if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Procesada") || aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Finalizada")) {
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                        aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                }
                aux = aux.getNext();
            }
            if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Procesada") || aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Finalizada")) {
                Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getPlacaVehiculo(),
                    tail.getValue().getPrecioTotal(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }
        } else if (tipo.equalsIgnoreCase("LlenarSolicitudes")) {

            Node<Solicitud> aux = head;
            while (aux != tail) {
                if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Registrada")) {
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                        aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                }
                aux = aux.getNext();
            }
            if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Registrada")) {
                Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                    aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }
        } else if (tipo.equalsIgnoreCase("LlenarRechazas")) {
            Node<Solicitud> aux = head;
            while (aux != tail) {
                if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                        aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                }
                aux = aux.getNext();
            }
            if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                    aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }

        }

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
