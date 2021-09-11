package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {
    
    static Logger log = Logger.getLogger(Main.class.getName());
    Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
    

    Persona personaUno = new Persona("Hanner", 10, 20);
    Persona personaDos = new Persona("Hanner", 10, 20);

    if (personaUno.equals (personaDos) 
        ) {
            log.info("******* Instacias Iguales *********");
    }

    
        else {
            log.info("******* Instacias Diferentes *********");
    }

}
}
