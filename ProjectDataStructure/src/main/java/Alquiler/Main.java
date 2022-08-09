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

        Queue.enqueue(new Solicitud("1", 0, "A", 0, "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("1", 1, "B", 1, "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("2", 2, "C", 2, "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("3", 3, "D", 3, "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("4", 4, "E", 4, "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("5", 5, "F", 5, "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("6", 6, "G", 6, "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("7", 7, "H", 7, "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("8", 8, "I", 8, "BRONCE", "Registrada"));
        Queue.enqueue(new Solicitud("9", 9, "J", 9, "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("10", 10, "K", 10, "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("11", 11, "L", 11, "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("12", 12, "M", 12, "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("13", 13, "N", 13, "PLATA", "Registrada"));
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);

    }

}
