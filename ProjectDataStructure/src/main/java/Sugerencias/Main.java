package Sugerencias;

public class Main {

    public static void main(String[] args) {
        Sugerencias ListaSugerencia = new Sugerencias();
        System.out.println("_______________________Buzon de Sugerencias_______________________");
        Sugerencias.inserta("No tienen autos electricos");
        Sugerencias.inserta("Cobran muy caro");
        Sugerencias.inserta("El auto no estaba disponible");
        Sugerencias.inserta("No tenia el tanque de gasolina lleno");
        Sugerencias.InOrden();
    }

}
