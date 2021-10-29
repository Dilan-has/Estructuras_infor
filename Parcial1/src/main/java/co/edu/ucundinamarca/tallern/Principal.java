
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Principal {

    static Logger log = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {

        Lista lista1 = new Lista();
        
        lista1.agregarInicio(8);
        lista1.agregarInicio(5);
        lista1.agregarInicio(8);
        lista1.agregarInicio(8);
        lista1.agregarInicio(11);
        
        lista1.encontrarMayor(5);
        lista1.numeroRepetido(5);
        
    }

}
