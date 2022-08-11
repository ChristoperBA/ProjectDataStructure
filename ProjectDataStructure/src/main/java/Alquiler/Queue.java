/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;

import Vehiculo.StackCars;
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

    public static void buscar(String tipoBus, String dato, DefaultTableModel modelo) {

        Node<Solicitud> aux = head;
        boolean exist = false;

        if (tipoBus.equalsIgnoreCase("Solicitudes")) {
            while (aux != tail) {
                if (aux.getValue().getCedulaCliente().equalsIgnoreCase(dato) || aux.getValue().getPlacaVehiculo().equalsIgnoreCase(dato)) {
                    while (modelo.getRowCount() > 0) {
                        modelo.removeRow(0);
                    }
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                        aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                    exist = true;
                    break;
                }
                aux = aux.getNext();
            }
            if (tail.getValue().getCedulaCliente().equalsIgnoreCase(dato) || tail.getValue().getPlacaVehiculo().equalsIgnoreCase(dato)) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                exist = true;
                Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getCantidadPasajeros(),
                    tail.getValue().getMarca(), tail.getValue().getModelo(), tail.getValue().getAño(), tail.getValue().getExtras(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }
        } else if (tipoBus.equalsIgnoreCase("Registradas")) {
            while (aux != tail) {
                if (aux.getValue().getCedulaCliente().equalsIgnoreCase(dato) || aux.getValue().getPlacaVehiculo().equalsIgnoreCase(dato)) {
                    while (modelo.getRowCount() > 0) {
                        modelo.removeRow(0);
                    }
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getPlacaVehiculo(),
                        aux.getValue().getPrecioTotal(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                    exist = true;
                    break;
                }
                aux = aux.getNext();
            }
            if (tail.getValue().getCedulaCliente().equalsIgnoreCase(dato) || tail.getValue().getPlacaVehiculo().equalsIgnoreCase(dato)) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                exist = true;
                Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getPlacaVehiculo(),
                    tail.getValue().getPrecioTotal(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }
        }
        if (exist == false) {
            JOptionPane.showMessageDialog(null, "No existe ninguna solicitud con la cedula o placa ingresada");
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
        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equals(cedula)) {
                if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Registrada")) {
                    aux.getValue().setEstadoSolicitud("Rechazada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha cambiado a Rechazada");
                } else if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Procesada")) {
                    StackCars.cambiarEstadoVehiculo(aux.getValue().getPlacaVehiculo(), "Devolucion");
                    aux.getValue().setEstadoSolicitud("Finalizada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha finalizado");
                } else if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                    aux.getValue().setEstadoSolicitud("Registrada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha cambiado a Registrada nuevamente");
                } else if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Finalizada")) {
                    JOptionPane.showMessageDialog(null, "Estado de la solicitud ha finalizado, no se puede cambiar el estado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error con el estado de la solicitud");
                }
                break;
            } else if (tail.getValue().getCedulaCliente().equals(cedula)) {
                if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Registrada")) {
                    tail.getValue().setEstadoSolicitud("Rechazada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha cambiado a Rechazada");
                } else if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Procesada")) {
                    tail.getValue().setEstadoSolicitud("Finalizada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha finalizado");
                } else if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                    tail.getValue().setEstadoSolicitud("Registrada");
                    JOptionPane.showMessageDialog(null, "El estado de la solicitud ha cambiado a Registrada nuevamente");
                } else if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Finalizada")) {
                    JOptionPane.showMessageDialog(null, "Estado de la solicitud finalizado, no se puede cambiar el estado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error con el estado de la solicitud");
                }
            }
            aux = aux.getNext();
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
            if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Registrada")) {
                Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getCantidadPasajeros(),
                    tail.getValue().getMarca(), tail.getValue().getModelo(), tail.getValue().getAño(), tail.getValue().getExtras(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }
        } else if (tipo.equalsIgnoreCase("LlenarRechazadas")) {
            Node<Solicitud> aux = head;
            while (aux != tail) {
                if (aux.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                    Object[] TablaC = {aux.getValue().getFecha(), aux.getValue().getCedulaCliente(), aux.getValue().getDias(), aux.getValue().getCantidadPasajeros(),
                        aux.getValue().getMarca(), aux.getValue().getModelo(), aux.getValue().getAño(), aux.getValue().getExtras(), aux.getValue().getCategoria(), aux.getValue().getEstadoSolicitud()};
                    modelo.addRow(TablaC);
                }
                aux = aux.getNext();
            }
            if (tail.getValue().getEstadoSolicitud().equalsIgnoreCase("Rechazada")) {
                Object[] TablaC = {tail.getValue().getFecha(), tail.getValue().getCedulaCliente(), tail.getValue().getDias(), tail.getValue().getCantidadPasajeros(),
                    tail.getValue().getMarca(), tail.getValue().getModelo(), tail.getValue().getAño(), tail.getValue().getExtras(), tail.getValue().getCategoria(), tail.getValue().getEstadoSolicitud()};
                modelo.addRow(TablaC);
            }

        }

    }

    public static boolean asignarVehiculo(String ced, double total, String placa, String nuevoEst) {

        boolean v = false;
        Node<Solicitud> aux = head;
        while (aux != tail) {
            if (aux.getValue().getCedulaCliente().equalsIgnoreCase(ced)) {
                aux.getValue().setPrecioTotal(total);
                aux.getValue().setPlacaVehiculo(placa);
                aux.getValue().setEstadoSolicitud(nuevoEst);
                v = true;
                StackCars.cambiarEstadoVehiculo(placa, "Asignar");
                break;
            }
            aux = aux.getNext();
        }
        if (tail.getValue().getCedulaCliente().equalsIgnoreCase(ced)) {
            tail.getValue().setPrecioTotal(total);
            tail.getValue().setPlacaVehiculo(placa);
            tail.getValue().setEstadoSolicitud(nuevoEst);
            StackCars.cambiarEstadoVehiculo(placa, "Asignar");
            v = true;
        }

        return v;
    }

}
