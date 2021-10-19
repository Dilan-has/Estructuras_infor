package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class ListaCircularDoble {

    static Logger log = Logger.getLogger(MainLista.class.getName());
    Scanner lectura = new Scanner(System.in);

    nodo primero;
    nodo ultimo;

    public ListaCircularDoble() {

        primero = null;
        ultimo = null;
    }

    public void InsertarNodoInt(int dato) {
        nodo nuevo = new nodo();
        nuevo.dato = dato;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }

    public void InsertarNodoString(String dato) {
        nodo nuevo = new nodo();
        nuevo.datos = dato;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }

    public void MostrarLista() {
        nodo actual = new nodo();
        actual = primero;
        do {
            log.info(actual.dato);
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void MostrarListaS() {
        nodo actual = new nodo();
        actual = primero;

        log.info(actual.datos);
    }
    
}
