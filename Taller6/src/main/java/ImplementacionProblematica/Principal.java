package ImplementacionProblematica;

import co.edu.ucundinamarca.tallern.MainLista;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Principal {

    static Logger log = Logger.getLogger(MainLista.class.getName());

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        Lista Computador1 = new Lista();

        int respuesta = 0;

        log.info("****Armado de computador****");
        do {
            log.info("Seleccione una opcion");
            log.info("1. Agregar parte a su computador");
            log.info("2. Buscar parte de su computador");
            log.info("3. Borrar parte de su computador");
            log.info("4. Ver el numero de partes de su computador");
            log.info("5. Ver partes del computador");
            log.info("6. Salir");
            respuesta = lectura.nextInt();

        } while (respuesta != 6);

        switch (respuesta) {
            case 1:
                log.info("Ingrese la parte del computador que desea agregar");
                String parte = lectura.next();
                Computador1.agregarParte(parte);
                break;

            case 2:
                log.info("Ingrese la parte del computador que desea buscar");
                String parteb = lectura.next();
                Computador1.buscarParte(parteb);
                break;
                
            case 3:
                log.info("Ingrese la parte del computador que desea borrar");
                String partec = lectura.next();
                Computador1.borrarParte(partec);
                break;
                
            case 4:
                Computador1.numeroPartes();
                break;
                
            case 5:
                Computador1.mostrarComputador();
                break;
                
        }

    }

}
