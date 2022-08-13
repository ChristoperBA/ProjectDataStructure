package Clientes;

import Clientes.ListaDC;
import javax.swing.JOptionPane;

public class Menu {

    public void mostrarMenu() {
        int opc = 0;
        short cod;
        String desc;
        ListaDC l = new ListaDC();
        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***MENU PRINCIPAL***\n"
                    + "1.Agregar nodo\n"
                    + "2.Extraer nodo al inicio\n"
                    + "3.Mostrar nodos\n"
                    + "4.Mostrar nodos a la inversa\n"
                    + "5.Modificar datos\n"
                    + "6.Salir del sistema\n\n"
                    + "Digite su opción:", "Menú Principal", JOptionPane.QUESTION_MESSAGE));
            switch (opc) {

                case 1: {
                    l.agregar();
                    break;
                }
                case 2: {
                    l.extraer();
                    break;
                }
                case 3: {
                    l.mostrarElementos();
                    break;
                }
                case 4: {
//                    l.mostrarElementosInversa();
                    break;
                }
                case 5: {
                    String id = JOptionPane.showInputDialog(null,
                            "Digite el id de la persona a modificar: ");
                    l.modificar(id);
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "¡Opción incorrecta!", "Opción no válida", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
