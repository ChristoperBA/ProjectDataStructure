package Vehiculo;

import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StackCars {

    private static NodeCar top;

    Scanner sc = new Scanner(System.in);

    //Push usa void porque no devuelve nada
    public static boolean push(Car value) {

        NodeCar newNode = new NodeCar(value);
        boolean v;
        if (top == null) {
            top = newNode;
            v = true;
        } else {
            newNode.setNext(top);
            top = newNode;
            v = true;
        }

        return v;
    }

    public void PrintStack() {
        NodeCar aux = top;
        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
    }

    public static void SearchCar(String Placa) {
        NodeCar aux = top;
        while (aux != null && !Placa.equals(aux.getValue().getPlaca())) {
            aux = aux.getNext();
        }
        if (aux != null) {
            System.out.println(aux.getValue().toString());
        } else {
            System.out.println("El Vehiculo no se encuentra, dentro de nuestro inventario");

        }
    }

    public void Modify(String Placa) {
        int OpcionModificar;
        do {
            System.out.println("""
         ____________________Modificar Vehiculo____________________

        [1] Modificar Marca
        [2] Modificar Modelo
        [3] Modificar Anios
        [4] Modificar Color
        [5] Modificar Capacidad de Cilindraje
        [6] Modificar Cantidad de Pasajeros 
        [7] Modificar Precio
        [8] Modificar Condicion 
        [9] Modificar Extra                        
        [8] Modificar Extra 
        [9] Modificar Condicion
        [10] Modificar Estado 
        [11] Modificar Cantidad Alquilado                                             
        [12] Salir del sistema""");
            OpcionModificar = Integer.parseInt(sc.nextLine());
            NodeCar aux = top;
            while (aux != null && !Placa.equals(aux.getValue().getPlaca())) {
                aux = aux.getNext();
            }
            if (Placa.equals(aux.getValue().getPlaca())) {

                switch (OpcionModificar) {
                    case 1 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setMarca(dato);
                    }
                    case 2 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setModel(dato);
                    }
                    case 3 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setYears(Integer.parseInt(dato));
                    }
                    case 4 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setColor(dato);
                    }
                    case 5 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setCylinderCapacity(dato);
                    }
                    case 6 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setPassangers(Integer.parseInt(dato));
                    }
                    case 7 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setPrice(Double.parseDouble(dato));
                    }
                    case 8 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setExtra(dato);
                    }
                    case 9 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setCondition(dato);
                    }
                    case 10 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setEstado(dato);
                    }
                    case 11 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setCantAlquilado(Integer.parseInt(dato));                    }
                    case 12 -> {
                        System.out.println("""
                               Cargando menu
                               ...
                               :)
                               ___________________________Fin del programa___________________________""");
                    }
                    default -> {
                        System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");
                    }

                }
            } else {
                System.out.println("El carro con la placa: " + Placa + "\nNo existe dentro de nuestro sistema");
                break;
            }

        } while (OpcionModificar != 10);

    }

    public void Delete(String Placa) {
        NodeCar aux = top;
        while (aux != null && !Placa.equals(aux.getValue().getPlaca()))
        {
            aux = aux.getNext();
        }
        if(aux!=null){
            //primero
            if(aux==top){
                top=aux.getNext();
            }else{
                NodeCar temp = top;
                    while (temp.getNext()!=aux)
                    {
                        temp = temp.getNext();
                    }
                //Ultimo
                if(aux.getNext()==null){

                temp.setNext(null);
                }
                //medio
                else{

                    temp.setNext(aux.getNext());
                }

            }
        }else{
            System.out.println("El vehiculo ingresado, no se encuentra en nuestra  base de datos");
        }


    }

    public static void buscar(String placa, DefaultTableModel modelo) {

        NodeCar aux = top;
        while (aux != null) {
            if (aux.getValue().getPlaca().equalsIgnoreCase(placa)) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                Object[] TablaC = {aux.getValue().getPlaca(), aux.getValue().getMarca(), aux.getValue().getModel(), aux.getValue().getYears(),
                    aux.getValue().getColor(), aux.getValue().getCylinderCapacity(), aux.getValue().getPassangers(), aux.getValue().getPrice(),
                    aux.getValue().getExtra(), aux.getValue().getCondition(), aux.getValue().getEstado(), aux.getValue().getCantAlquilado()};
                modelo.addRow(TablaC);
                break;
            }
            aux = aux.getNext();
        }

    }

    public static void llenarTabla(DefaultTableModel modelo) {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        NodeCar aux = top;
        while (aux != null) {
            Object[] TablaC = {aux.getValue().getPlaca(), aux.getValue().getMarca(), aux.getValue().getModel(), aux.getValue().getYears(),
                aux.getValue().getColor(), aux.getValue().getCylinderCapacity(), aux.getValue().getPassangers(), aux.getValue().getPrice(),
                aux.getValue().getExtra(), aux.getValue().getCondition(), aux.getValue().getEstado(), aux.getValue().getCantAlquilado()};
            modelo.addRow(TablaC);
            aux = aux.getNext();
        }

    }

    public static boolean llenarTA(DefaultTableModel modelo, int cantP, String ma, String mo, String ex) {

        boolean v = false;
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        NodeCar aux = top;
        while (aux != null) {
            if (aux.getValue().getPassangers() == cantP && aux.getValue().getMarca().equalsIgnoreCase(ma)
                    && aux.getValue().getModel().equalsIgnoreCase(mo) || aux.getValue().getExtra().equalsIgnoreCase(ex)) {
                if (aux.getValue().getEstado().equalsIgnoreCase("Disponible")) {
                    Object[] TablaC = {aux.getValue().getPlaca(), aux.getValue().getMarca(), aux.getValue().getModel(), aux.getValue().getYears(),
                        aux.getValue().getColor(), aux.getValue().getCylinderCapacity(), aux.getValue().getPassangers(), aux.getValue().getPrice(),
                        aux.getValue().getExtra(), aux.getValue().getCondition(), aux.getValue().getEstado()};
                    modelo.addRow(TablaC);
                    v = true;
                }
            }
            aux = aux.getNext();
        }

        return v;
    }

    public static void cambiarEstadoVehiculo(String placa, String tipo) {

        NodeCar aux = top;
        if (tipo.equalsIgnoreCase("Asignar")) {
            while (aux != null) {
                if (aux.getValue().getPlaca().equalsIgnoreCase(placa)) {
                    aux.getValue().setEstado("Alquilado");
                    aux.getValue().setCantAlquilado(aux.getValue().getCantAlquilado() + 1);
                    break;
                }
                aux = aux.getNext();
            }
        } else if (tipo.equalsIgnoreCase("Devolucion")) {
            while (aux != null) {
                if (aux.getValue().getPlaca().equalsIgnoreCase(placa)) {
                    String c = JOptionPane.showInputDialog(null, "Ingrese la condicion en la que se devuelve el vehiculo: ");
                    aux.getValue().setCondition(c);
                    aux.getValue().setEstado("Disponible");
                    break;
                }
                aux = aux.getNext();
            }
        }
    }

    public static boolean modificarVehiculo(String placa, String c, String cl, double p, String ex, String cd, String est) {

        NodeCar aux = top;
        boolean v = false;
        while (aux != null) {
            if (placa.equals(aux.getValue().getPlaca())) {
                aux.getValue().setColor(c);
                aux.getValue().setCylinderCapacity(cl);
                aux.getValue().setPrice(p);
                aux.getValue().setExtra(ex);
                aux.getValue().setCondition(cd);
                aux.getValue().setEstado(est);
                v = true;
                break;

            }
            aux = aux.getNext();
        }

        return v;
    }

    public static boolean validarVehiculo(String placa) {
        NodeCar aux = top;
        boolean v = false;
        while (aux != null) {
            if (aux.getValue().getPlaca().equalsIgnoreCase(placa)) {
                v = true;
                break;
            }
            aux = aux.getNext();
        }
        return v;
    }

    public static void agregarDatos(String placa, JTextField ma, JTextField mo, JTextField añ, JTextField cl, JTextField cp,
            JSpinner ps, JTextField pc, JTextField ex, JTextField cd, JComboBox est) {
        NodeCar aux = top;
        while (aux != null) {
            if (aux.getValue().getPlaca().equalsIgnoreCase(placa)) {
                ma.setText(aux.getValue().getMarca());
                mo.setText(aux.getValue().getModel());
                añ.setText(String.valueOf(aux.getValue().getYears()));
                cl.setText(aux.getValue().getColor());
                cp.setText(aux.getValue().getCylinderCapacity());
                ps.setValue(aux.getValue().getPassangers());
                pc.setText(String.valueOf(aux.getValue().getPrice()));
                ex.setText(aux.getValue().getExtra());
                cd.setText(aux.getValue().getCondition());
                if (aux.getValue().getEstado().equalsIgnoreCase("Disponible")) {
                    est.setSelectedIndex(0);
                } else if (aux.getValue().getEstado().equalsIgnoreCase("Alquilado")) {
                    est.setSelectedIndex(1);
                } else if (aux.getValue().getEstado().equalsIgnoreCase("En reparación")) {
                    est.setSelectedIndex(2);
                } else if (aux.getValue().getEstado().equalsIgnoreCase("Fuera de circulación")) {
                    est.setSelectedIndex(3);
                }
                break;
            }
            aux = aux.getNext();
        }
    }

}
