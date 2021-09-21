package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;

public class Sucesion {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static double sucesion(int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else if (n <= 0) {
            return n;

        } else {

            return (0.91 * sucesion(n - 1)) + (0.1 * sucesion(n - 2));
        }

    }

    public static double Sucesion2(int contador, double n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else if (n == 2) {

            return Sucesion2(contador, 2) * 0.91 + Sucesion2(contador, 1) * 0.1;
        } else if (n == 3) {

            return Sucesion2(contador, 1.92) * 0.91 + Sucesion2(contador, 2) * 0.1;
        } else if (n == 4) {

            return Sucesion2(contador, 1.9472) * 0.91 + Sucesion2(contador, 1.92) * 0.1;
        } else if (n == 5) {

            return Sucesion2(contador, 1.963952) * 0.91 + Sucesion2(contador, 1.9472) * 0.1;
        } else if (n == 6) {

            return Sucesion2(contador, Sucesion2(contador, 5)) * 0.91 + Sucesion2(contador, Sucesion2(contador, 4)) * 0.1;
        } else if (n == 7) {

            return Sucesion2(contador, Sucesion2(contador, 6)) * 0.91 + Sucesion2(contador, Sucesion2(contador, 5)) * 0.1;
        } else if (n == 8) {

            return Sucesion2(contador, Sucesion2(contador, 7)) * 0.91 + Sucesion2(contador, Sucesion2(contador, 6)) * 0.1;
        } else if (n == 9) {

            return Sucesion2(contador, Sucesion2(contador, 8)) * 0.91 + Sucesion2(contador, Sucesion2(contador, 7)) * 0.1;
        } else if (n == 10) {
            contador++;
            log.info("Numero de ejecucion: " + contador);
            return Sucesion2(contador, Sucesion2(contador, 9)) * 0.91 + Sucesion2(contador, Sucesion2(contador, 8)) * 0.1;
        }
        return n;
    }

    public static double SucesionIt(int n) {

        int i = 0;

        do {

            return (0.91 * sucesion(n - 1)) + (0.1 * sucesion(n - 2));

        } while (i < n);

    }

}
