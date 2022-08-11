package Vehiculo;

import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class StackCars {

    private static NodeCar top;
    Scanner sc = new Scanner(System.in);

    //Push usa void porque no devuelve nada
    public static void push(Car value) {
        NodeCar newNode = new NodeCar(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

    }

    public void PrintStack() {
        NodeCar aux = top;
        while (aux != null) {
            System.out.println(aux.getValue().toString());
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
            aux.getValue().getCondition(), aux.getValue().getExtra()};
            modelo.addRow(TablaC);
            aux = aux.getNext();
        }
        
    }

    public void SearchCar(String Placa) {
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

    public void modificar(String Placa) {
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
        [10] Salir del sistema""");
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
                        aux.getValue().setPassangers(dato);
                    }
                    case 7 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setPrice(Integer.parseInt(dato));
                    }
                    case 8 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setCondition(dato);
                    }
                    case 9 -> {
                        System.out.println("Ingresa el dato a modificar: ");
                        String dato = sc.nextLine();
                        aux.getValue().setExtra(dato);
                    }
                    case 10 -> {
                        System.out.println("""
                           Cerrando Programa...
                           El programa fue cerrado con exito
                             
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

    public void eliminar(String Placa) {
    }

}
