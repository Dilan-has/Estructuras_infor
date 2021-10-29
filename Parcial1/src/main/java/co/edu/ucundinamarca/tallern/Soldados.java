package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import java.util.Random;
import org.apache.log4j.Logger;

public class Soldados {

    ArrayList<String> Soldados = new ArrayList<String>();
    static Logger log = Logger.getLogger(Principal.class.getName());

    public void agregar() {
        Soldados.add("Carlos");
        Soldados.add("Jorge");
        Soldados.add("Luis");
        Soldados.add("Sergio");
    }

    public void elminarAleatorio(int x) {
        Random Aleatorio = new Random();

        int n = Aleatorio.nextInt(x);
        Soldados.remove(n);

        log.info(n);
    }

    public void Imprimir() {

        log.info(Soldados);
    }
}
