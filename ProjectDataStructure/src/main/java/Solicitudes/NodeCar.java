
package Solicitudes;

public class NodeCar {

    private Car value;
    private NodeCar next;

    public NodeCar(Car value) {
        this.value = value;
    }

    public Car getValue() {
        return value;
    }

    public void setValue(Car value) {
        this.value = value;
    }

    public NodeCar getNext() {
        return next;
    }

    public void setNext(NodeCar next) {
        this.next = next;
    }

}

