
package Clientes;

public class Node 
{
    
    private Cliente elemento;
    private Node siguiente;
    private Node anterior;
    
    public Node(){
        this.siguiente=null;
        this.anterior=null;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    
}
