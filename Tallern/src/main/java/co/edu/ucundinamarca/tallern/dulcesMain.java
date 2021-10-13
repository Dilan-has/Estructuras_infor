
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class dulcesMain {

    static Logger log = Logger.getLogger(dulcesMain.class.getName());

    public static void main(String[] args) {
        
        dulces dulce1 = new dulces();
        
        dulce1.ImprimirElemento(10);
        dulce1.ImprimirSinIterador("Chocorramo");

        
    }

}
