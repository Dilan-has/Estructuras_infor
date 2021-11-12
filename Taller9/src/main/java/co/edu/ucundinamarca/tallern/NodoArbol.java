package co.edu.ucundinamarca.tallern;

public class NodoArbol {

    int dato;
    String nombre;
    NodoArbol hijoizquierdo, hijoderecho;

    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.hijoderecho = null;
        this.hijoizquierdo = null;
    }

    public String toString() {
        return nombre + "Su dato es " + dato;
    }
}
