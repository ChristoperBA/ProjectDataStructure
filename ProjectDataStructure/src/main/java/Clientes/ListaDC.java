package Clientes;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import javax.swing.JTextField;
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

    public static boolean Eliminar(String Cedula) {

        boolean v = false;
        if (inicio == null) {
            System.out.println("La lista esta vacia");
        } else if (Cedula.equals(inicio.getElemento().getId())) {
            //Mueve head al siguiente nodo 
            inicio = inicio.getSiguiente();
            inicio.setAnterior(fin);
            //Mantiene la circularidad
            fin.setSiguiente(inicio);
            v = true;

        } else {
            Node<Cliente> aux = inicio;
            Node<Cliente> temp = aux.getSiguiente();
            while (aux.getSiguiente() != fin) {
                if (temp.getElemento().getId().equals(Cedula)) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    break;
                }
                aux = aux.getSiguiente();
                temp = aux.getSiguiente();
                v = true;

            }
            if (Cedula.equals(fin.getElemento().getId())) {
//                fin = aux;
//                fin.setSiguiente(inicio);
//                inicio.setSiguiente(fin);
                fin.setSiguiente(aux);
                fin = fin.getSiguiente(); //fin=nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);

                v = true;
            }
        }
        return v;
    }

    public static void cargarDatos(String ced, JTextField n, JTextField f, JTextField c, JComboBox cat) {
        Node aux = inicio;
        while (aux != fin) {
            if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                n.setText(aux.getElemento().getNomCompleto());
                f.setText(aux.getElemento().getFechaNacimiento());
                c.setText(aux.getElemento().getCorreo());
                switch (aux.getElemento().getCategoria()) {
                    case 1 ->
                        cat.setSelectedIndex(0);
                    case 2 ->
                        cat.setSelectedIndex(1);
                    case 3 ->
                        cat.setSelectedIndex(2);
                    case 4 ->
                        cat.setSelectedIndex(3);
                    default -> {
                    }
                }
                break;
            }
            aux = aux.getSiguiente();
        }
        if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
            n.setText(fin.getElemento().getNomCompleto());
            f.setText(fin.getElemento().getFechaNacimiento());
            c.setText(fin.getElemento().getCorreo());
            switch (fin.getElemento().getCategoria()) {
                case 1 ->
                    cat.setSelectedIndex(0);
                case 2 ->
                    cat.setSelectedIndex(1);
                case 3 ->
                    cat.setSelectedIndex(2);
                case 4 ->
                    cat.setSelectedIndex(3);
            }
        }
    }

    public void imprimirLista() {
        Node<Cliente> aux = inicio;
        while (aux != fin) {
            System.out.println(aux.getElemento().toString());
            aux = aux.getSiguiente();
        }
        System.out.println(fin.getElemento().toString());
    }

    public static void modificarCantAlquilado(String ced) {
        Node aux = inicio;
        boolean v = false;
        while (aux != fin) {
            if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                aux.getElemento().setCantAlquilado(aux.getElemento().getCantAlquilado() + 1);
            }
            aux = aux.getSiguiente();
        }
        if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
            fin.getElemento().setCantAlquilado(fin.getElemento().getCantAlquilado() + 1);
        }
    }

    public static boolean modificarCliente(String ced, String n, String f, String c, int cat) {
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
        return v;
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
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 3 -> {
                            aux.getElemento().setCategoria(2);
                            cat = "ORO";
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 4 -> {
                            aux.getElemento().setCategoria(3);
                            cat = "PLATA";
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                    }
                }
                aux = aux.getSiguiente();
            }
            if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (fin.getElemento().getCategoria()) {
                        case 2 -> {
                            fin.getElemento().setCategoria(1);
                            cat = "ZAFIRO";
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 3 -> {
                            fin.getElemento().setCategoria(2);
                            cat = "ORO";
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 4 -> {
                            fin.getElemento().setCategoria(3);
                            cat = "PLATA";
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
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
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 2 -> {
                            aux.getElemento().setCategoria(3);
                            cat = "PLATA";
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 3 -> {
                            aux.getElemento().setCategoria(4);
                            cat = "BRONCE";
                            String c = aux.getElemento().getId();
                            String n = aux.getElemento().getNomCompleto();
                            String f = aux.getElemento().getFechaNacimiento();
                            String co = aux.getElemento().getCorreo();
                            int ct = aux.getElemento().getCategoria();
                            int cantA = aux.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
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
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 2 -> {
                            fin.getElemento().setCategoria(3);
                            cat = "PLATA";
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
                        }
                        case 3 -> {
                            fin.getElemento().setCategoria(4);
                            cat = "BRONCE";
                            String c = fin.getElemento().getId();
                            String n = fin.getElemento().getNomCompleto();
                            String f = fin.getElemento().getFechaNacimiento();
                            String co = fin.getElemento().getCorreo();
                            int ct = fin.getElemento().getCategoria();
                            int cantA = fin.getElemento().getCantAlquilado();
                            Eliminar(ced);
                            agregar(new Cliente(c, n, f, co, ct, cantA));
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
        if (fin != null) {
            String s = categoria(fin.getElemento().getCategoria());
            Object[] TablaC = {fin.getElemento().getId(), fin.getElemento().getNomCompleto(), fin.getElemento().getFechaNacimiento(),
                fin.getElemento().getCorreo(), s, fin.getElemento().getCantAlquilado()};
            modelo.addRow(TablaC);
        }

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

    public static String promedio() {
        String promedio = "";
        String s;
        int cont = 0;
        ArrayList<Cliente> pCliente = new ArrayList();
        Node<Cliente> aux = inicio;
        while (aux != fin) {
            pCliente.add(aux.getElemento());
            aux = aux.getSiguiente();
        }
        pCliente.add(fin.getElemento());
        Collections.sort(pCliente);
        for (int i = 0; i < pCliente.size(); i++) {
            cont = cont + 1;
            if (cont <= 5) {
                s = categoria(pCliente.get(i).getCategoria());
                promedio = promedio + "\nTop #" + cont + "\nDatos del cliente \nCédula: " + pCliente.get(i).getId() + "\nNombre completo: " + pCliente.get(i).getNomCompleto()
                        + "\nNacimiento: " + pCliente.get(i).getFechaNacimiento() + "\nCorreo: " + pCliente.get(i).getCorreo()
                        + "\nCategoria: " + s + "\nCant. de alquileres: " + pCliente.get(i).getCantAlquilado() + "\n";
//                promedio = promedio + "Top #" + cont + pCliente.get(i).toString() + "\n";
            }
        }
        return promedio;
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
