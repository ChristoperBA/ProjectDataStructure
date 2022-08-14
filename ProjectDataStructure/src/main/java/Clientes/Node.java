package Clientes;

public class Node <T>{

    private Cliente elemento;
    private Node<T> siguiente;
    private Node<T> anterior;

    public Node() {
    }

    public Node(Cliente elemento) {
        this.elemento = elemento;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

    public Node<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Node<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Node<T> anterior) {
        this.anterior = anterior;
    }
    
}
