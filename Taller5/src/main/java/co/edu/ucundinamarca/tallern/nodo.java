package co.edu.ucundinamarca.tallern;

public class nodo {

    int dato;
    nodo siguiente;
    nodo anterior;
    String datos;

    public int getValor() {
        return dato;
    }

    public void setValor(int dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
