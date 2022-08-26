package Sugerencias;

public class Sugerencias {

    private static NodeSugerencia root;
    private int altura;

    public static void inserta(String value) {
        if (root == null) {
            root = new NodeSugerencia(value);

        } else {
            insertar(root, value);
        }
    }

    public static void insertar(NodeSugerencia nodo, String value) {

        if ((nodo.getChildLeft() == null)) {
            if (nodo.getChildLeft() == null) {
                nodo.setChildLeft(new NodeSugerencia(value));
            } else {
                insertar(nodo.getChildLeft(), value);

            }
        } else {
            if (nodo.getChildRigth() == null) {
                nodo.setChildRigth(new NodeSugerencia(value));
            } else {
                insertar(nodo.getChildRigth(), value);

            }

        }
    }

    public static String InOrden() {

        String sug;
        if (root != null) {
            sug = inOrdenRecorrer(root);
        } else {
            sug = "Arbol esta vacio";
        }

        return sug;
    }

    private static String inOrdenRecorrer(NodeSugerencia nodo) {

        String v = "";
        if (nodo != null) {
            v = v + inOrdenRecorrer(nodo.getChildLeft());
            v = v + nodo.getSugerencia() + "\n";
            v = v + inOrdenRecorrer(nodo.getChildRigth());
        }

        return v;
    }

//    public static void InOrden() {
//        if (root != null) {
//            inOrdenRecorrer(root);
//
//        } else {
//            System.out.print("Arbol esta vacio");
//        }
//    }
//    private static void inOrdenRecorrer(NodeSugerencia nodo) {
//        if (nodo != null) {
//            inOrdenRecorrer(nodo.getChildLeft());
//            System.out.print(nodo.getSugerencia() + "\n");
//            inOrdenRecorrer(nodo.getChildRigth());
//        }
//    }
}
