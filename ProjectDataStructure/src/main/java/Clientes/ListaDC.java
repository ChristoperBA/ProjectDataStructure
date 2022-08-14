package Clientes;

import Vehiculo.NodeCar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaDC {

    private static Node<Cliente> inicio;
    private static Node<Cliente> fin;

    public ListaDC() {
        ListaDC.inicio = null;
        ListaDC.fin = null;
    }

    public static boolean esVacia() {
        return inicio == null;
    }

    public static void agregar(Cliente c) {
        Node<Cliente> nuevo = new Node(c);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (c.getCategoria() < inicio.getElemento().getCategoria()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (c.getCategoria() >= fin.getElemento().getCategoria()) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente(); //fin=nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            Node aux = inicio;
            while (aux.getSiguiente().getElemento().getCategoria() < c.getCategoria()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

//    public void extraer() {
//        if (!esVacia()) {
//            inicio = inicio.getSiguiente();
//            JOptionPane.showMessageDialog(null, "El elemento fue extraído!");
//        } else {
//            JOptionPane.showMessageDialog(null,
//                    "No se puede extraer, lista vacía!");
//        }
//    }
//
//    public void modificar(String curso) {
//        String s = "";
//        Node aux = inicio;
//        Cliente c = new Cliente();
//        c.setNomCompleto(JOptionPane.showInputDialog(null,
//                "Digite el nuevo nombre: "));
//        c.setFechaNacimiento(JOptionPane.showInputDialog(null,
//                "Digite la nueva fecha de nacimiento: "));
//        c.setCategoria(Integer.parseInt(JOptionPane.showInputDialog(null,
//                "Digite la nueva categoría: ")));
//        if (aux.getElemento().getNomCompleto().equals(curso)) {
//            aux.setElemento(c);
//            aux = aux.getSiguiente();
//            while (aux != inicio) {
//                if (aux.getElemento().getNomCompleto().equals(curso)) {
//                    c.setNomCompleto(JOptionPane.showInputDialog(null,
//                            "Digite el nuevo nombre: "));
//                    c.setFechaNacimiento(JOptionPane.showInputDialog(null,
//                            "Digite la nueva fecha de nacimiento: "));
//                    c.setCategoria(Integer.parseInt(JOptionPane.showInputDialog(null,
//                            "Digite la nueva categoría: ")));
//                    aux.setElemento(c);
//                }
//                aux = aux.getSiguiente();
//            }
//            JOptionPane.showMessageDialog(null, "Los datos fueron modificados!");
//        }
//
//    }
    public static void llenarTablaC(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Node<Cliente> aux = inicio;
        while (aux != fin) {
            String s = categoria(aux.getElemento().getCategoria());
            Object[] TablaC = {aux.getElemento().getId(), aux.getElemento().getNomCompleto(), aux.getElemento().getFechaNacimiento(),
                aux.getElemento().getCorreo(), s, aux.getElemento().getCantAlquilado()};
            modelo.addRow(TablaC);
            aux = aux.getSiguiente();
        }
        String s = categoria(fin.getElemento().getCategoria());
        Object[] TablaC = {fin.getElemento().getId(), fin.getElemento().getNomCompleto(), fin.getElemento().getFechaNacimiento(),
            fin.getElemento().getCorreo(), s, fin.getElemento().getCantAlquilado()};
        modelo.addRow(TablaC);

    }

    public static void mostrarElementos() {
        Node aux = inicio;
        int cont = 0;
        String s;
        String info;
        while (aux != fin) {
            cont = cont + 1;
            s = categoria(aux.getElemento().getCategoria());
            info = "Posicion: " + cont
                    + "\nDatos del cliente"
                    + "\nCédula: " + aux.getElemento().getId()
                    + "\nNombre completo: " + aux.getElemento().getNomCompleto()
                    + "\nFecha de nacimiento: " + aux.getElemento().getFechaNacimiento()
                    + "\nCorreo: " + aux.getElemento().getCorreo()
                    + "\nCategoria: " + s
                    + "\nCantidad de vehiculos alquilados: " + aux.getElemento().getCantAlquilado();
            JOptionPane.showMessageDialog(null, info);
            aux = aux.getSiguiente();
        }
        s = categoria(fin.getElemento().getCategoria());
        info = "Posicion: " + (cont + 1)
                + "\nDatos del cliente"
                + "\nCédula: " + fin.getElemento().getId()
                + "\nNombre completo: " + fin.getElemento().getNomCompleto()
                + "\nFecha de nacimiento: " + fin.getElemento().getFechaNacimiento()
                + "\nCorreo: " + fin.getElemento().getCorreo()
                + "\nCategoria: " + s
                + "\nCantidad de vehiculos alquilados: " + fin.getElemento().getCantAlquilado();
        JOptionPane.showMessageDialog(null, info);
    }

    public static String categoria(int n) {
        String cat;
        cat = switch (n) {
            case 1 ->
                "Zafiro";
            case 2 ->
                "ORO";
            case 3 ->
                "PLATA";
            default ->
                "BRONCE";
        };
        return cat;
    }
}
