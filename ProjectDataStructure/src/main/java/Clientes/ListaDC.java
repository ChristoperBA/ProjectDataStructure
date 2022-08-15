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

<<<<<<< HEAD

    public void agregar() {
        Cliente c = new Cliente();
        c.setCedula(JOptionPane.showInputDialog(null,"Digite su ID: "));
        c.setNomCompleto(JOptionPane.showInputDialog(null,"Digite su nombre : "));
        c.setFechaNacimiento(JOptionPane.showInputDialog(null,"Digite la fecha de nacimiento :"));
        c.setCorreo(JOptionPane.showInputDialog(null,"Digite su correo: "));
        c.setCategoria(JOptionPane.showInputDialog(null, """
                Digite su categoria: 
                1. Bronce == 2. Plata == 3. Oro == 4. Zafiro. 
                Seleccione por medio de un n\u00famero su categor\u00eda:  """));
        
        Node nuevo = new Node();
        nuevo.setElemento(c);

    public static void agregar(Cliente c) {
        Node<Cliente> nuevo = new Node(c);

=======
    public static boolean agregar(Cliente c) {
        Node<Cliente> nuevo = new Node(c);
        boolean v = false;
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
<<<<<<< HEAD

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
            while (aux.getSiguiente().getElemento().getCategoria()< c.getCategoria()) 
            {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);

=======
            v = true;
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
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
<<<<<<< HEAD
=======
            v = true;
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
        }
        return v;
    }

    public static Node<Cliente> extraer(String ced) {
        Node<Cliente> aux = inicio;
        if (!esVacia()) {
            while (aux != fin) {
                if (aux.getSiguiente().getElemento().getId().equalsIgnoreCase(ced)) {
                    aux = aux.getSiguiente();
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
        return aux;
    }
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
<<<<<<< HEAD
    public static void llenarTablaC(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }
=======
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e

    public static void cambiarCategoria(String ced, String tipo) {

        Node<Cliente> aux = inicio;

        if (tipo.equalsIgnoreCase("Subir Categoria")) {
            while (aux != fin) {
                if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (aux.getElemento().getCategoria()) {
                        case 2 ->
                            aux.getElemento().setCategoria(1);
                        case 3 ->
                            aux.getElemento().setCategoria(2);
                        case 4 ->
                            aux.getElemento().setCategoria(3);
                        default -> {
                        }
                    }
                }
                aux = aux.getSiguiente();
            }
            if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (fin.getElemento().getCategoria()) {
                        case 2 ->
                            aux.getElemento().setCategoria(1);
                        case 3 ->
                            fin.getElemento().setCategoria(2);
                        case 4 ->
                            fin.getElemento().setCategoria(3);
                        default -> {
                        }
                    }
                }
            }

        } else if (tipo.equalsIgnoreCase("Bajar Categoria")) {
            while (aux != fin) {
                if (aux.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (aux.getElemento().getCategoria()) {
                        case 1 ->
                            aux.getElemento().setCategoria(2);
                        case 2 ->
                            aux.getElemento().setCategoria(3);
                        case 3 ->
                            aux.getElemento().setCategoria(4);
                        default -> {
                        }
                    }
                }
                aux = aux.getSiguiente();
            }
<<<<<<< HEAD
            JOptionPane.showMessageDialog(null, "Los datos fueron modificados!");

=======
            if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                if (fin.getElemento().getId().equalsIgnoreCase(ced)) {
                    switch (fin.getElemento().getCategoria()) {
                        case 1 ->
                            aux.getElemento().setCategoria(2);
                        case 2 ->
                            fin.getElemento().setCategoria(3);
                        case 3 ->
                            fin.getElemento().setCategoria(4);
                        default -> {
                        }
                    }
                }
            }
        }
    }

    public static void llenarTablaC(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
        Node<Cliente> aux = inicio;
        while (aux != fin) {
            String s = categoria(aux.getElemento().getCategoria());
            Object[] TablaC = {aux.getElemento().getId(), aux.getElemento().getNomCompleto(), aux.getElemento().getFechaNacimiento(),
                aux.getElemento().getCorreo(), s, aux.getElemento().getCantAlquilado()};
            modelo.addRow(TablaC);
            aux = aux.getSiguiente();
<<<<<<< HEAD

=======
>>>>>>> f6b087012ae75e98bcd5cbf27ba259acd46f112e
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
