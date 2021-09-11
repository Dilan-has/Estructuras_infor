package co.edu.ucundinamarca.tallern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import org.apache.log4j.Logger;

/**
 *
 * @author dhper
 */
public class SeleccionColombia {

    static Logger log = Logger.getLogger(Main.class.getName());
    Scanner sc = new Scanner(System.in);

    Set<String> jugadores = new HashSet<>();

    public void agregarJugadores() {

        char entrada = 0;
        String nombre;

        do {

            log.info("Ingrese el nombre");
            nombre = sc.next();

            jugadores.add(nombre);

            log.info("Desea ingresar otro jugador escriba S(para si) o N(para no)");
            entrada = sc.next().charAt(0);

        } while (entrada != 'n' && entrada != 'N');

    }

    public void mostrarJugadores() {

        for (String s : jugadores) {
            System.out.println("Jugador: " + s);
        }

    }

    public void contieneJugador() {

        String nombreb;

        log.info("Ingrese el nomre del jugador el cual desea buscar");
        nombreb = sc.next();

        if (jugadores.contains(nombreb)) {
            log.info("Jugador encontrado: " + nombreb);
        } else {
            log.info("Jugador: " + nombreb + " No encontrado");
        }

    }

}
