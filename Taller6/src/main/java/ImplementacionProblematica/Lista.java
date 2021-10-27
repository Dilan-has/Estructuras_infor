package ImplementacionProblematica;

import co.edu.ucundinamarca.tallern.MainLista;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Lista {

    static Logger log = Logger.getLogger(MainLista.class.getName());

    ArrayList<String> Computador = new ArrayList<String>();

    public void agregarParte(String parte) {

        Computador.add(parte);
    }

    public void buscarParte(String parte) {

        boolean rpta = Computador.contains(parte);

        if (rpta == true) {
            log.info("Parte del computador encontrada" + parte);
        } else {
            log.info("Parte no encontrada");
        }
    }

    public void borrarParte(String parte) {

        Computador.remove(parte);
        log.info("Parte borrada correctamente");
    }
    
    public void numeroPartes(){
        log.info(Computador.size());
    }
    
    public void mostrarComputador(){
        log.info(Computador);
    }
}
