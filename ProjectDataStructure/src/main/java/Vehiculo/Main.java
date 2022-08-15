package Vehiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {;

        //Christopher
        StackCars Stack = new StackCars();
        Scanner sc = new Scanner(System.in);
        //Testing
        //Car(String Placa,String Marca, String Model, int Years, String Color, String CylinderCapacity, String Passangers, String Price, String Condition, String Extra)
        Stack.push(new Car("BFF126", "Mitsubichi", "L200", 2016, "Azul", "2.400 cc ", 4, 40.0, "", "Disponible","",4));
        Stack.push(new Car("CAF654", "Nissan", "Sentra", 2010, "Rojo", "1.600 cc ", 4, 20.0, "", "Disponible","",4));
        Stack.push(new Car("BIC074", "Chevrolet", "Spark", 2014, "Azul", "1.400 cc ", 4, 23.0, "", "Disponible","",4));
      
//        System.out.println("----------------------------------------Car List----------------------------------------\n");
//        Stack.PrintStack();

        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("""
                                   ____________________Menu del Sistema____________________
                                   
                                   [1] Control Vehiculos
                                   [2] Control Clientes 
                                   [3] Control Alquileres
                                   [4] Salir del sistema""");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    int OpcionVehiculos;
                    do {
                        System.out.println("""
                                                ____________________Menu Vehiculos____________________

                                                [1] Agregar Vehiculo
                                                [2] Modificar Vehiculo 
                                                [3] Eliminar Vehiculo
                                                [4] Ver Lista Carros
                                                [5] Salir del sistema""");
                        OpcionVehiculos = Integer.parseInt(sc.nextLine());
                        switch (OpcionVehiculos) {
                            case 1 -> {
                                //Ingreso de datos del Vehiculo
                                System.out.println("Placa?");
                                String Placa = sc.nextLine();
                                System.out.println("Marca?");
                                String Marca = sc.nextLine();
                                System.out.println("Model?");
                                String Model = sc.nextLine();
                                System.out.println("Years?");
                                int Years = Integer.parseInt(sc.nextLine());
                                System.out.println("Color?");
                                String Color = sc.nextLine();
                                System.out.println("Cylinder?");
                                String CylinderCapacity = sc.nextLine();
                                System.out.println("Pasajeros?");
                                int Passangers = Integer.parseInt(sc.nextLine());
                                System.out.println("Precio?");
                                double Price = Double.parseDouble(sc.nextLine());
                                System.out.println("Condicion?");
                                String Condition = sc.nextLine();
                                System.out.println("Estado?");
                                String estado = sc.nextLine();
                                System.out.println("Cantidad Alquilado?");
                                int cantAlquilado = Integer.parseInt(sc.nextLine());
                                String Extra = "";
                                boolean extra = true;
                                while (extra) {
                                    System.out.println("Quieres agregrar un Extra al Vehiculo?\n[1] Si\n[2] No");
                                    int opcionextra = Integer.parseInt(sc.nextLine());
                                    switch (opcionextra) {
                                        case 1:
                                            System.out.println("Extra");
                                            String mensaje = sc.nextLine();
                                            Extra = Extra + mensaje + ",";
                                            break;
                                        case 2:
                                            extra = false;
                                            break;
                                        default:
                                            System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");

                                    }
                                }
                                Stack.push(new Car(Placa, Marca, Model, Years, Color, CylinderCapacity, Passangers, Price, Extra,Condition,estado,cantAlquilado));
                                
                                break;
                            }
                            case 2 -> {
                                //Modificar
                                System.out.println("Ingresa la placa, para modificar la informacion: ");
                                String placa = sc.nextLine();
                                Stack.Modify(placa);
                                break;
                            }
                            case 3 -> {
                                //Borrar
                                //Stack.eliminar("BFF126");
                                //Stack.eliminar("CAF654");
                                Stack.Delete("BFF126");
                                Stack.PrintStack();
                                break;
                            }
                            case 4 -> {
                                System.out.println("""
                                                Que deseas ver?

                                                [1] Ver Lista
                                                [2] Buscar Vehiculo
                                                [3] Salir del sistema""");
                                int OpcionModificar=sc.nextInt();
                                if(OpcionModificar==1){
                                System.out.println("----------------------------------------Car List----------------------------------------\n");
                                Stack.PrintStack();
                                }
                                else if(OpcionModificar==2){
                                    System.out.println("Ingresa la placa del vehiculo, que quieres buscar");
                                    String Placa =sc.nextLine();
                                    Stack.SearchCar(Placa);
                                }
                                else{
                                    System.out.println("Opcion Invalida");
                                }
                                break;
                            }
                            case 5 -> {
                                System.out.println("""
                               Cerrando Programa...
                               El programa fue cerrado con exito
                             
                               ___________________________Fin del programa___________________________""");
                                break;
                            }
                            default ->
                                System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");
                        }

                    } while (OpcionVehiculos != 5);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    System.out.println("""
                                           Cerrando Programa...
                                           El programa fue cerrado con exito
                                           
                                           ___________________________Fin del programa___________________________""");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");

            }
        }

    }//Main

}
