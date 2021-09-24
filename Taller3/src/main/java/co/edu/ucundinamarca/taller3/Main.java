package co.edu.ucundinamarca.taller3;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    Funciones ejemploUno = new Funciones();

    public static void ItFact() {
        int factIt = 0;
        Scanner sc = new Scanner(System.in);
        log.info("Ingrese un numero para calcular el factorial");
        factIt = sc.nextInt();
        log.info("Iterativo factorial: " + Funciones.factorial(factIt));
    }

    public static void RecFact() {
        int factRec = 0;
        Scanner sc = new Scanner(System.in);
        log.info("Ingrese un numero para calcular el factorial");
        factRec = sc.nextInt();
        log.info("Recursivo factorial: " + Funciones.factorialRec(factRec));
    }

    public static void pot() {

        int base = 0;
        int exponente = 0;
        Scanner sc = new Scanner(System.in);
        log.info("Ingrese una base");
        base = sc.nextInt();
        log.info("Ingrese un exponente");
        exponente = sc.nextInt();
        log.info("Recursivo potencia: " + Funciones.potencia(base, exponente));
    }

    public static void main(String[] args) {

        ItFact();
        RecFact();
        pot();

    }

}
