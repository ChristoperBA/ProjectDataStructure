
package Sugerencias;


public class Main {

    
    public static void main(String[] args) {
       Sugerencias ListaSugerencia=new Sugerencias();
        System.out.println("_______________________Buzon de Sugerencias_______________________");
       ListaSugerencia.inserta("No tienen autos electricos");
       ListaSugerencia.inserta("Cobran muy caro");
       ListaSugerencia.inserta("El auto no estaba disponible");
       ListaSugerencia.inserta("No tenia el tanque de gasolina lleno");
       
       ListaSugerencia.InOrden();
    }
    
}
