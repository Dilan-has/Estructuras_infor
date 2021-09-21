package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;

public class Mcd {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public static void main(String[] args) {

        int a = 96;
        int b = 36;

        log.info("Inicio mcd " + a + "," + b);

        log.info("mcd(" + a + "," + b + ")=" + mcd(a, b));
        
        log.info("Fin mcd " + a + "," + b);

    }
}
