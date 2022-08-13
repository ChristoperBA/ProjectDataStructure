package Clientes;

import Clientes.Cliente;
import javax.swing.JOptionPane;

public class ListaDC {

    private Node inicio;
    private Node fin;

    public ListaDC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Cliente c = new Cliente();
        c.setId(JOptionPane.showInputDialog(null,
                "Digite su ID: "));
        c.setNomCompleto(JOptionPane.showInputDialog(null,
                "Digite su nombre : "));
        c.setFechaNacimiento(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite la fecha de nacimiento :")));
        c.setCorreo(JOptionPane.showInputDialog(null,
                "Digite su correo: "));
        c.setCategoria(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite su categoria: \n "
                        + "1. Bronce == 2. Plata == 3. Oro == 4. Zafiro. "
                        + "\n Seleccione por medio de un número su categoría:  ")));
        Node nuevo = new Node();
        nuevo.setElemento(c);
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
            while (aux.getSiguiente().getElemento().getCategoria()
                    < c.getCategoria()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void extraer() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede extraer, lista vacía!");
        }
    }

    public void modificar(String curso) {
        String s = "";
        Node aux = inicio;
        Cliente c = new Cliente();
        c.setNomCompleto(JOptionPane.showInputDialog(null,
                "Digite el nuevo nombre: "));
        c.setFechaNacimiento(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite la nueva fecha de nacimiento: ")));
        c.setCategoria(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite la nueva categoría: ")));
        if (aux.getElemento().getNomCompleto().equals(curso)) {
            aux.setElemento(c);
            aux = aux.getSiguiente();
            while (aux != inicio) {
                if (aux.getElemento().getNomCompleto().equals(curso)) {
                    c.setNomCompleto(JOptionPane.showInputDialog(null,
                            "Digite el nuevo nombre: "));
                    c.setFechaNacimiento(Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite la nueva fecha de nacimiento: ")));
                    c.setCategoria(Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Digite la nueva categoría: ")));
                    aux.setElemento(c);
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Los datos fueron modificados!");
        }

    }

    public void mostrarElementos() {
        String s = "";
        Node aux = inicio;
        s = s + aux.getElemento().getNomCompleto()+ "=="
                + aux.getElemento().getFechaNacimiento()+ "=="
                + aux.getElemento().getCategoria()+ "<==>";
        aux = aux.getSiguiente();
        while (aux != inicio) {
            s = s + aux.getElemento().getNomCompleto()+ "=="
                    + aux.getElemento().getFechaNacimiento()+ "=="
                    + aux.getElemento().getCategoria()+ "<==>";
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
    }


}
