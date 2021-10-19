package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class ListaCircular {

    static Logger log = Logger.getLogger(MainLista.class.getName());
    Scanner lectura = new Scanner(System.in);

    nodo primero;
    nodo ultimo;

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public void ingresarNodo(int dato) {
        nodo nuevo = new nodo();
        nuevo.dato = dato;

        if (primero == null) {
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }

    public void VerLista() {
        nodo actual = new nodo();
        actual = primero;
        do {
            log.info("" + actual.dato);
            actual = actual.siguiente;
        } while (actual != primero);

    }

    public void BuscarNodo(int dato) {
        nodo actual = new nodo();
        actual = primero;
        boolean encontrar = false;
        do {
            if (actual.dato == dato) {
                encontrar = true;
            }
            actual = actual.siguiente;
        } while (actual != primero);
        if (encontrar == true) {
            log.info("Nodo encontrado");
        } else {
            log.info("Nodo no encontrado");
        }

    }

    public void ModificarNodo(int dato) {
        nodo actual = new nodo();
        actual = primero;
        do {
            if (actual.dato == dato) {
                log.info("Ingrese nuevo nodo");
                actual.dato = lectura.nextInt();
            }
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void EliminarNodo(int dato) {
        nodo actual = new nodo();
        nodo anterior = new nodo();
        actual = primero;
        anterior = ultimo;

        do {
            if (actual.dato == dato) {
                if (actual == primero) {
                    primero = primero.siguiente;
                }else if (actual == ultimo){
                    anterior.siguiente = ultimo.siguiente;
                    ultimo = anterior;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);

    }
}
