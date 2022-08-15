package Clientes;

import javax.swing.table.DefaultTableModel;

public class ListaDC {

    private static Node<Cliente> inicio;
    private static Node<Cliente> fin;
    public static String estado;

    public ListaDC() {
        ListaDC.inicio = null;
        ListaDC.fin = null;
    }

    public static boolean esVacia() {
        return inicio == null;
    }

    public static boolean agregar(Cliente c) {
        Node<Cliente> nuevo = new Node(c);
        boolean v = false;
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            v = true;
        } else if (c.getCategoria() < inicio.getElemento().getCategoria()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            v = true;
        } else if (c.getCategoria() >= fin.getElemento().getCategoria()) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente(); //fin=nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            v = true;
        } else {
            Node aux = inicio;
            while (aux.getSiguiente().getElemento().getCategoria() < c.getCategoria()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
            v = true;
        }
        return v;
    }

    public static void modificarCliente(String ced, String n, String f, String c, int cat) {
        Node aux = inicio;
        boolean v = false;
        while (aux != fin) {
            if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                aux.getElemento().setNomCompleto(n);
                aux.getElemento().setFechaNacimiento(f);
                aux.getElemento().setCorreo(c);
                aux.getElemento().setCategoria(cat);
                v = true;
            }
            aux = aux.getSiguiente();
        }
        if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
            fin.getElemento().setNomCompleto(n);
            fin.getElemento().setFechaNacimiento(f);
            fin.getElemento().setCorreo(c);
            fin.getElemento().setCategoria(cat);
            v = true;
        }
    }

    public static String cambiarCategoria(String ced, String tipo) {

        Node<Cliente> aux = inicio;
        String cat = "";
        if (tipo.equalsIgnoreCase("Subir Categoria")) {
            while (aux != fin) {
                if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (aux.getElemento().getCategoria()) {
                        case 2 -> {
                            aux.getElemento().setCategoria(1);
                            cat = "ZAFIRO";
                        }
                        case 3 -> {
                            aux.getElemento().setCategoria(2);
                            cat = "ORO";
                        }
                        case 4 -> {
                            aux.getElemento().setCategoria(3);
                            cat = "PLATA";
                        }
                    }
                }
                aux = aux.getSiguiente();
            }
            if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (fin.getElemento().getCategoria()) {
                        case 2 -> {
                            aux.getElemento().setCategoria(1);
                            cat = "ZAFIRO";
                        }
                        case 3 -> {
                            fin.getElemento().setCategoria(2);
                            cat = "ORO";
                        }
                        case 4 -> {
                            fin.getElemento().setCategoria(3);
                            cat = "PLATA";
                        }
                    }
                }
            }

        } else if (tipo.equalsIgnoreCase("Bajar Categoria")) {
            while (aux != fin) {
                if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (aux.getElemento().getCategoria()) {
                        case 1 -> {
                            aux.getElemento().setCategoria(2);
                            cat = "ORO";
                        }
                        case 2 -> {
                            aux.getElemento().setCategoria(3);
                            cat = "PLATA";
                        }
                        case 3 -> {
                            aux.getElemento().setCategoria(4);
                            cat = "BRONCE";
                        }
                    }
                }
                aux = aux.getSiguiente();
            }
            if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (fin.getElemento().getCategoria()) {
                        case 1 -> {
                            aux.getElemento().setCategoria(2);
                            cat = "ORO";
                        }
                        case 2 -> {
                            fin.getElemento().setCategoria(3);
                            cat = "PLATA";
                        }
                        case 3 -> {
                            fin.getElemento().setCategoria(4);
                            cat = "BRONCE";
                        }
                        default -> {
                        }
                    }
                }
            }
        }
        return cat;
    }

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

    public static boolean validarCliente(String ced) {
        Node aux = inicio;
        boolean v = false;
        while (aux != fin) {
            if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                v = true;
            }
            aux = aux.getSiguiente();
        }
        if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
            v = true;
        }
        return v;
    }

    public static String mostrarCliente(String ced) {
        Node aux = inicio;
        String s;
        String info = "";
        while (aux != fin) {
            if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                s = categoria(aux.getElemento().getCategoria());
                info = "\nDatos del cliente \nCédula: " + aux.getElemento().getId() + "\nNombre completo: " + aux.getElemento().getNomCompleto()
                        + "\nFecha de nacimiento: " + aux.getElemento().getFechaNacimiento() + "\nCorreo: " + aux.getElemento().getCorreo()
                        + "\nCategoria: " + s + "\nCantidad de vehiculos alquilados: " + aux.getElemento().getCantAlquilado();
            }
            aux = aux.getSiguiente();
        }
        if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
            s = categoria(fin.getElemento().getCategoria());
            info = "\nDatos del cliente \nCédula: " + fin.getElemento().getId() + "\nNombre completo: " + fin.getElemento().getNomCompleto()
                    + "\nFecha de nacimiento: " + fin.getElemento().getFechaNacimiento() + "\nCorreo: " + fin.getElemento().getCorreo()
                    + "\nCategoria: " + s + "\nCantidad de vehiculos alquilados: " + fin.getElemento().getCantAlquilado();
        }
        return info;
    }

    public static String categoria(int n) {
        String cat;
        switch (n) {
            case 1 -> {
                cat = "ZAFIRO";
                estado = "ZAFIRO";
            }
            case 2 -> {
                cat = "ORO";
                estado = "ORO";
            }
            case 3 -> {
                cat = "PLATA";
                estado = "PLATA";
            }
            default -> {
                cat = "BRONCE";
                estado = "BRONCE";
            }
        }
        return cat;
    }
}
