package co.edu.ucundinamarca.taller3;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    Scanner sc = new Scanner(System.in);
    Fact_Pot ejemploUno = new Fact_Pot();

    int factIt = 0;
    int factRec = 0;
    int base = 0;
    int exponente = 0;

    public static void ItFact() {
        log.info("Ingrese un numero para calcular el factorial");
        factIt = sc.nextInt();
        log.info("Iterativo factorial: " + ejemploUno.factorial(factIt));
    }

    public static void RecFact() {
        log.info("Ingrese un numero para calcular el factorial");
        factIt = sc.nextInt();
        log.info("Recursivo factorial: " + ejemploUno.factorialRec(factRec));
    }

    public static void pot() {
        log.info("Ingrese una base");
        base = sc.nextInt();
        log.info("Ingrese un exponente");
        exponente = sc.nextInt();
        log.info("Recursivo potencia: " + ejemploUno.potencia(base, exponente));
    }

    public static void main(String[] args) {
        
        ItFact();

    }

}
