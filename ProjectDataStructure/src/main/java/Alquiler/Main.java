/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Alquiler;

import Principal.MenuPrincipal;

/**
 *
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Queue.enqueue(new Solicitud("09/08/2022", "A1", 1, 1, "1", "1", 2022, "1", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "B2", 2, 2, "2", "2", 2022, "2", 0, "####", "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "C3", 3, 3, "3", "3", 3022, "3", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "D4", 4, 4, "4", "4", 4022, "4", 0, "####", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "E5", 5, 5, "5", "5", 5022, "5", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "F6", 6, 6, "6", "2", 6022, "1", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "G7", 7, 7, "7", "7", 7022, "1", 0, "####", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "H8", 8, 8, "8", "8", 8022, "1", 0, "####", "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "I9", 9, 9, "9", "9", 9022, "1", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "J10", 10, 10, "10", "10", 1022, "10", 0, "####", "PLATA", "Procesada"));
        Queue.enqueue(new Solicitud("09/08/2022", "K11", 11, 11, "11", "11", 1122, "11", 0, "####", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "L12", 12, 12, "12", "12", 1222, "12", 0, "####", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "M13", 13, 13, "13", "13", 1322, "13", 0, "####", "PLATA", "Finalizada"));  
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);

    }

}
