package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author dhper
 */
public class MainAnimal {

    static Logger log = Logger.getLogger(Main.class.getName());
    Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {

        Animal AnimalUno = new Animal("Perro", 5, 01, "Canino", 4);
        Animal AnimalDos = new Animal("Gato", 3, 02, "Felino", 4);

        if (AnimalUno.equals(AnimalDos)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }

    }
}
