/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Alquiler.Queue;
import Alquiler.Solicitud;
import Clientes.Cliente;
import Clientes.ListaDC;
import Vehiculo.Car;
import Vehiculo.StackCars;

/**
 *
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StackCars.push(new Car("BFF126", "Mitsubichi", "L200", 2016, "Azul", "2.400 cc ", 4, 20, "A", "Nuevo", "Disponible", 2));
        StackCars.push(new Car("CAF654", "Nissan", "Sentra", 2010, "Rojo", "1.600 cc ", 6, 20, "B", "Nuevo", "Disponible", 2));
        StackCars.push(new Car("BIC074", "Chevrolet", "Spark", 2014, "Azul", "1.400 cc ", 5, 23, "C", "Nuevo", "Disponible", 2));
        StackCars.push(new Car("FO902N", "Mitsubichi", "L200", 2022, "Azul", "2.400 cc ", 4, 50, "D", "Nuevo", "Disponible", 2));
        StackCars.push(new Car("J90NWA", "Mitsubichi", "L200", 2011, "Azul", "2.400 cc ", 4, 90, "E", "Nuevo", "Disponible", 2));

        ListaDC.agregar(new Cliente("00", "0000", "00/00/2000", "0@gmail.com", 2, 0));
        ListaDC.agregar(new Cliente("A1", "Alex", "01/01/2001", "a@gmail.com", 1, 0));
        ListaDC.agregar(new Cliente("D4", "Dani", "04/04/2004", "d@gmail.com", 1, 0));
        ListaDC.agregar(new Cliente("E5", "Eime", "05/05/2005", "e@gmail.com", 4, 0));
        ListaDC.agregar(new Cliente("B2", "Bart", "02/02/2002", "b@gmail.com", 3, 0));
        ListaDC.agregar(new Cliente("G7", "Gere", "07/07/2007", "g@gmail.com", 2, 0));
        ListaDC.agregar(new Cliente("H8", "Hime", "08/08/2008", "h@gmail.com", 3, 0));
        ListaDC.agregar(new Cliente("F6", "Ferr", "06/06/2006", "f@gmail.com", 4, 0));
        ListaDC.agregar(new Cliente("I9", "Ines", "09/09/2009", "i@gmail.com", 1, 0));
        ListaDC.agregar(new Cliente("C3", "Carl", "03/03/2003", "c@gmail.com", 4, 0));

        //Nodos nulos, se necesita un head (zafiro), un tail (bronce) y una variable en medio (oro) para que el codigo funcione correctamente
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", 0000, "0", 0, "####", "ZAFIRO", "##########"));
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", 0000, "0", 0, "####", "BRONCE", "##########"));
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", 0000, "0", 0, "####", "ORO", "##########"));

        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", 0000, "0", 0, "####", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "A1", 1, 1, "1", "1", 0000, "1", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "B2", 2, 2, "2", "2", 0000, "2", 0, "####", "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "C3", 3, 3, "3", "3", 0000, "3", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "D4", 4, 4, "Mitsubichi", "L200", 0000, "A", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "E5", 5, 5, "5", "5", 0000, "5", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "F6", 6, 6, "6", "2", 0000, "1", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "G7", 7, 7, "7", "7", 0000, "1", 0, "####", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "H8", 8, 8, "8", "8", 0000, "1", 0, "####", "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "I9", 9, 9, "9", "9", 0000, "1", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "J10", 10, 10, "10", "10", 0000, "10", 0, "####", "PLATA", "Procesada"));
        Queue.enqueue(new Solicitud("09/08/2022", "K11", 11, 11, "11", "11", 0000, "11", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "L12", 12, 12, "12", "12", 0000, "12", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "M13", 13, 13, "13", "13", 0000, "13", 0, "####", "PLATA", "Finalizada"));

        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
    }

}
