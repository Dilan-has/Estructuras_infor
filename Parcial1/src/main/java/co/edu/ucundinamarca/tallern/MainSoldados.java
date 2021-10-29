package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainSoldados {
    static Logger log = Logger.getLogger(MainSoldados.class.getName());

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Soldados primerosmuertos = new Soldados();

        primerosmuertos.agregar();
        primerosmuertos.Imprimir();
        int i = 0;
        do{
        int n=3;    
        primerosmuertos.elminarAleatorio(n);
        n--;
        i++;
        }while(i<3);
        primerosmuertos.Imprimir();
    }
}
