package co.edu.ucundinamarca.tallern;

public class Arbol {

    NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoizquierdo;
                    if (auxiliar == null) {
                        padre.hijoizquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoderecho;
                    if (auxiliar == null) {
                        padre.hijoderecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

}
