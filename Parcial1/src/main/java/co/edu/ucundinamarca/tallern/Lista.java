package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Lista {

    public class Nodo {

        public int dato;
        public Nodo siguiente;

        public Nodo(int x) {
            dato = x;
            siguiente = this;
        }
    }

    static Logger log = Logger.getLogger(Principal.class.getName());
    Scanner lectura = new Scanner(System.in);

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void agregarInicio(int x) {
        Nodo nuevo;
        nuevo = new Nodo(x);
        nuevo.dato = x;
        if (inicio == null) {
            nuevo.siguiente = null;
            inicio = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }

    }

    public void imprimirMayor() {
        Nodo Imprimirult = inicio;
        while (Imprimirult != null) {
            if (Imprimirult.siguiente == null) {
                log.info("El dato mayor es: " + Imprimirult.dato);
            }
            Imprimirult = Imprimirult.siguiente;
        }

    }

    public void encontrarMayor(int n) {

        int aux;

        Nodo recorrer = inicio;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = recorrer.dato;
            recorrer = recorrer.siguiente;
        }

        for (int a = 0; a < n; a++) {
            for (int j = a + 1; j < n; j++) {
                if (array[a] < array[j]) {
                    aux = array[a];
                    array[a] = array[j];
                    array[j] = aux;
                }
            }
        }
        Lista nueva = new Lista();
        for (int f = 0; f < n; f++) {
            nueva.agregarInicio(array[f]);
        }
       nueva.imprimirMayor();
    }

    public void numeroRepetido(int n)   {
        int a, b = 0, c = -1;
        Nodo recorrer = inicio;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = recorrer.dato;
            recorrer = recorrer.siguiente;
        }
        for (int i = 0; i < array.length - 1; i++) {
            a = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    a++;
                }
            }
            if (a > b) {
                b = a;
                c = array[i];
            }
        }
        log.info("El elemento más repetido en la lista es: " + c + ", con una frecuencia de: " + b);
    }
}
