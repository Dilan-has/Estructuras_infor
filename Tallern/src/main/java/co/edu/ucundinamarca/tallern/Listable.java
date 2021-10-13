package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Listable {

    nodo primero;
    nodo ultimo;

    static Logger log = Logger.getLogger(dulcesMain.class.getName());
    Scanner lectura = new Scanner(System.in);

    public Listable() {
        primero = null;
        ultimo = null;
    }

    public void Agregar(int dato) {

        nodo nodoNuevo = new nodo();

        nodoNuevo.dato = dato;

        if (primero == null) {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;
        }

    }

    public void VerLista() {
        nodo actual = new nodo();
        actual = primero;
        while (actual != null) {
            log.info(actual.dato);
            actual = actual.siguiente;
        }

    }

    public void Contiene(int dato) {

        boolean respuesta;

        nodo actual = new nodo();

        actual = primero;

        while (actual != null) {

            if (actual.dato == dato) {
                respuesta = true;
            } else {
                respuesta = false;
            }
            actual = actual.siguiente;

            log.info(respuesta);
        }

    }

    public void EstaVacia() {

        nodo actual = new nodo();

        actual = primero;

        boolean rpta;

        if (primero == null) {
            rpta = false;
        } else {
            rpta = true;
        }
        log.info(rpta);

    }

    public void PrimerElemento() {
        nodo actual = new nodo();

        try {
            actual = primero;

        } catch (ArithmeticException ex) {

            primero = null;

            log.info("Error: " + ex);

        }
    }

    public void Sustituir(int dato) {
        nodo actual = new nodo();
        actual = primero;

        while (actual != null) {
            if (actual.dato == dato) {

                log.info("Ingrese dato a sustituir");
                actual.dato = lectura.nextInt();

            }

            actual = actual.siguiente;
        }
    }

    public void Vaciar() {

        nodo actual = new nodo();
        actual = primero;

        if (primero != null) {

            primero = null;

        }

    }

    public class ListaDoble {

        private NodoDoble inicio, fin;

        public ListaDoble() {
            inicio = fin = null;
        }

        public boolean estaVacia() {
            return inicio == null;
        }

        public void Nodo(int el) {

            if (!estaVacia()) {
                fin = new NodoDoble(el, null, fin);
                fin.anterior.siguiente = fin;
            } else {
                inicio = fin = new NodoDoble(el);
            }

        }

        public void NodoInicio(int el) {

            if (!estaVacia()) {
                fin = new NodoDoble(el, fin, null);
                inicio.siguiente.anterior = inicio;
            } else {
                inicio = fin = new NodoDoble(el);
            }

        }

        public void MostrarNodo() {

            log.info(inicio);

        }

        public void MostarSiguiente() {
            log.info(fin);
        }

    }

}
