package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;

public class Fact_Pot {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static long factorial(int numero) {

        if (numero < 0) {
            numero = numero * -1;
        }
        if (numero <= 0) {
            return 1;
        }
        long factorial = 1;
        while (numero > 1) {
            factorial = factorial * numero;
            numero--;
        }
        return factorial;

    }

    public static long factorialRec(int numero) {

        if (numero == 0) {
            return 1;
        } else {
            return numero * factorialRec(numero - 1);
        }

    }

    public static long potencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;

        } else {
            return base * potencia(base, exponente - 1);
        }

    }

}
