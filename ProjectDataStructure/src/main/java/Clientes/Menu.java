package Clientes;

import javax.swing.JOptionPane;

public class Menu {

    public void mostrarMenu() {
        int opc = 0;
        ListaDC l = new ListaDC();
        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     ***MENU PRINCIPAL***
                                                                     1.Agregar nodo
                                                                     2.Extraer nodo al inicio
                                                                     3.Mostrar nodos
                                                                     4.Mostrar nodos a la inversa
                                                                     5.Modificar datos
                                                                     6.Salir del sistema
                                                                     
                                                                     Digite su opci\u00f3n:""", "Menú Principal", JOptionPane.QUESTION_MESSAGE));
            switch (opc) {

                case 1 -> {
                    l.agregar(new Cliente("00", "0000", "00/00/2000", "0@gmail.com", 2, 0));
                    l.agregar(new Cliente("A1", "Alex", "01/01/2001", "a@gmail.com", 1, 0));
                    l.agregar(new Cliente("D4", "Dani", "04/04/2004", "d@gmail.com", 1, 0));
                    l.agregar(new Cliente("E5", "Eime", "05/05/2005", "e@gmail.com", 4, 0));
                    l.agregar(new Cliente("B2", "Bart", "02/02/2002", "b@gmail.com", 3, 0));
                    l.agregar(new Cliente("G7", "Gere", "07/07/2007", "g@gmail.com", 2, 0));
                    l.agregar(new Cliente("H8", "Hime", "08/08/2008", "h@gmail.com", 3, 0));
                    l.agregar(new Cliente("F6", "Ferr", "06/06/2006", "f@gmail.com", 4, 0));
                    l.agregar(new Cliente("I9", "Ines", "09/09/2009", "i@gmail.com", 1, 0));
                    l.agregar(new Cliente("C3", "Carl", "03/03/2003", "c@gmail.com", 4, 0));
                }
                case 2 -> {
                }
                case 3 -> {
                    l.mostrarElementos();
                }
                case 4 -> {
//                    l.mostrarElementosInversa();

                }
                case 5 -> {
                }
                case 6 -> {
                    System.exit(0);
                }
                default -> {
                    JOptionPane.showMessageDialog(null,
                            "¡Opción incorrecta!", "Opción no válida", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
