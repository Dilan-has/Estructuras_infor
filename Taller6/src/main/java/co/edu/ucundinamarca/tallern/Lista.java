package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Lista {

    static Logger log = Logger.getLogger(MainLista.class.getName());
    Scanner lectura = new Scanner(System.in);

    nodo primero;
    nodo ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int x) {
        nodo nuevo = new nodo();
        nuevo.datos = x;
        if (primero == null) {
            primero.siguiente = primero;
            primero.anterior = ultimo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            primero.anterior = ultimo;
        }

    }

    public void mostrar() {

        nodo actual = new nodo();
        actual = primero;
        do {

        } while (actual != primero);

    }

    public void buscar(int x) {
        nodo actual = new nodo();
        actual = ultimo;
        boolean encontrado = false;
        int dato = 0;
        do {
            if (actual.datos == x) {
                encontrado = true;
                dato = actual.datos;
            }
            actual = actual.anterior;

        } while (actual != ultimo);
        if (encontrado == true) {
            log.info("Nodo encontrado");
            log.info(dato);
        } else {
            log.info("Nodo no encontrado");
        }
    }

    public void modificar(int x) {
        nodo actual = new nodo();
        actual = primero;
        do {
            if (actual.datos == x) {
                log.info("Ingrese un nuevo valor");
                actual.datos = lectura.nextInt();
            }
        } while (actual != primero);

    }
}
