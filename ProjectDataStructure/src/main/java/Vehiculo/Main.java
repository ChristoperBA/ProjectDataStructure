package Vehiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {;

        //Christopher
        StackCars Stack = new StackCars();
        Scanner sc = new Scanner(System.in);
        
        //Car(String Placa, String Marca, String Model, int Years, String Color, String CylinderCapacity, int Passangers, double Price, String Extra, String Condition, String estado, int cantAlquilado)
        Stack.push(new Car("BFF126", "Mitsubichi", "L200", 2016, "Azul", "2.400 cc ", 4, 40.0, "", "Disponible","",4));
        Stack.push(new Car("CAF654", "Nissan", "Sentra", 2010, "Rojo", "1.600 cc ", 4, 20.0, "", "Disponible","",4));
        Stack.push(new Car("BIC074", "Chevrolet", "Spark", 2014, "Azul", "1.400 cc ", 4, 23.0, "", "Disponible","",4));
//        
//        System.out.println("----------------------------------------Car List----------------------------------------\n");
//        Stack.PrintStack();

        boolean salir = false;
        int opcion;
        while (!salir)
        {
            System.out.println("""
            ____________________Menu del Sistema____________________
                                   
            [1] Control Vehiculos
            [2] Control Clientes 
            [3] Control Alquileres
            [4] Salir del sistema""");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion)
            {
                case 1 ->
                {
                    int OpcionVehiculos;
                    do
                    {
                        System.out.println("""
                        ____________________Menu Vehiculos____________________
                       [1] Agregar Vehiculo
                       [2] Modificar Vehiculo
                       [3] Eliminar Vehiculo
                       [4] Ver Lista Carros
                       [5] Salir del sistema""");
                        OpcionVehiculos = Integer.parseInt(sc.nextLine());
                        switch (OpcionVehiculos)
                        {
                            case 1 ->
                            {
                                //Ingreso de datos del Vehiculo
                                //Car(    
                                // double Price, String Extra, String Condition, String estado, int cantAlquilado)
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
                                while (extra)
                                {
                                    System.out.println("Quieres agregrar un Extra al Vehiculo?\n[1] Si\n[2] No");
                                    int opcionextra = Integer.parseInt(sc.nextLine());
                                    switch (opcionextra)
                                    {
                                        case 1 ->
                                        {
                                            System.out.println("Extra");
                                            String mensaje = sc.nextLine();
                                            Extra = Extra + mensaje + ",";
                                        }
                                        case 2 -> extra = false;
                                        default -> System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");

                                    }
                                }
                                
                                Stack.push(new Car(Placa, Marca, Model, Years, Color, CylinderCapacity, Passangers, Price, Extra,Condition,estado,cantAlquilado));
                                Stack.PrintStack();
                                break;
                            }
                            case 2 ->
                            {
                                //Modificar
                                System.out.println("Ingresa la placa, para modificar la informacion: ");
                                String placa = sc.nextLine();
                                Stack.Modify(placa);
                                break;
                            }
                            case 3 ->
                            {
                                //Borrar
                                //Stack.eliminar("BFF126");
                                //Stack.eliminar("CAF654");
                                Stack.Delete("BFF126");
                                Stack.PrintStack();

                                break;
                            }
                            case 4 ->
                            {
                                //
                                System.out.println("----------------------------------------Car List----------------------------------------\n");
                                Stack.PrintStack();
                                //Stack.SearchCar("BFF126");
                                break;
                            }
                            case 5 ->
                            {
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
                }
                case 2 ->
                {
                }
                case 3 ->
                {
                }
                case 4 ->
                {
                    salir = true;
                    System.out.println("""
                              Cerrando Programa...
                              El programa fue cerrado con exito
                              ___________________________Fin del programa___________________________""");
                }
                case 5 ->
                {
                }
                default ->
                    System.out.println("Opcion Invalida, Intentelo nuevamente\n:(");

            }
            //Chris Fin************************************************
        }

    }//Main

}
