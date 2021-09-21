package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;

public class MainSucesion {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void sucesionRec() {

        Sucesion s1 = new Sucesion();

        Long startTime = System.currentTimeMillis();

        log.info(s1.sucesion(10));;

        Long endTime = System.currentTimeMillis();

        log.info("Tiempo total " + (endTime - startTime));
    }

    public static void sucesionIt() {

        Sucesion s2 = new Sucesion();

        Long startTime = System.currentTimeMillis();

        log.info(s2.SucesionIt(10));

        Long endTime = System.currentTimeMillis();

        log.info("Tiempo total " + ( endTime-startTime ));
    }
    
    public static void main(String[] args) {
        
        sucesionRec();
        sucesionIt();
        
    }

}
