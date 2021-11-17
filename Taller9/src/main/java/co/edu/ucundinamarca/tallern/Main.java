package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        arbol.agregar(6, "a");
        arbol.agregar(0, "b");
        arbol.agregar(4, "c");
        arbol.agregar(5, "d");
        arbol.agregar(1, "e");
        arbol.agregar(3, "f");
        arbol.agregar(2, "g");

    }

}
