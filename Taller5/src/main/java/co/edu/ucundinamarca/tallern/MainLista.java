
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class MainLista {

    static Logger log = Logger.getLogger(MainLista.class.getName());
    Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
        ListaCircular lista1 = new ListaCircular();
        
        lista1.ingresarNodo(25);
        lista1.ingresarNodo(26);
        lista1.ingresarNodo(27);
        lista1.ingresarNodo(28);
        
        lista1.VerLista();
        
        lista1.ModificarNodo(26);
        
        lista1.VerLista();
    }

}
