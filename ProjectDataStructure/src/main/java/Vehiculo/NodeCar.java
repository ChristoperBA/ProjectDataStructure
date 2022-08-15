
package Vehiculo;

public class NodeCar <T>{

    private T value;
    private NodeCar<T> next;

    public NodeCar() {
    }

    public NodeCar(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeCar<T> getNext() {
        return next;
    }

    public void setNext(NodeCar<T> next) {
        this.next = next;
    }
    
}

