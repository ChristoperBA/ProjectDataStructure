/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Alquiler;

/**
 *
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Queue.enqueue(new Solicitud("09/08/2022", "1", 1, 1, "1", "1", 1, "1", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "2", 2, 2, "2", "2", 2, "2","BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "3", 3, 3, "3", "3", 3, "3", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "4", 4, 4, "4", "4", 4, "4", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "5", 5, 5, "5", "5", 5, "5", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "6", 6, 6, "6", "2", 6, "1", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "7", 7, 7, "7", "7", 7, "1", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "8", 8, 8, "8", "8", 8, "1", "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "9", 9, 9, "9", "9", 9, "1", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "10", 10, 10, "10", "10", 10, "10", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "11", 11, 11, "11", "11", 11, "11", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "12", 12, 12, "12", "12", 12, "12", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "13", 13, 13, "13", "13", 13, "13", "PLATA", "Registrada"));
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);

    }

}
