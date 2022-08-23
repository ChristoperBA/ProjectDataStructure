package Sugerencias;

public class NodeSugerencia {

    private NodeSugerencia ChildLeft;
    private NodeSugerencia ChildRigth;
    private String sugerencia;

    public NodeSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public NodeSugerencia getChildLeft() {
        return ChildLeft;
    }

    public void setChildLeft(NodeSugerencia Left) {
        this.ChildLeft = Left;
    }

    public NodeSugerencia getChildRigth() {
        return ChildRigth;
    }

    public void setChildRigth(NodeSugerencia Rigth) {
        this.ChildRigth = Rigth;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

}
