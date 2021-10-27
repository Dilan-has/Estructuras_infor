package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainLista {

    static Logger log = Logger.getLogger(MainLista.class.getName());

    public static void main(String[] args) {
        
        Lista lista1 = new Lista();

        Scanner lectura = new Scanner(System.in);
        
        int opcion = 0;
        do {
            log.info("Elija una opcion");
            log.info("1. Ingresar Nodo");
            log.info("2. Mostrar lista");
            log.info("3. Buscar lista");
            log.info("4. Modificar");
            log.info("5. Salir");
            opcion = lectura.nextInt();
        } while (opcion != 0);
        
        switch(opcion){
            case 1:
                log.info("ingrese un nodo");
                int dato = lectura.nextInt();
                lista1.ingresar(dato);
                break;
        
            case 2:
                log.info("Mostrar lista");
                lista1.mostrar();
                break;
                
            case 3:
                log.info("Buscar");
                log.info("Ingrese un ndato a buscar");
                int dato3 = lectura.nextInt();
                lista1.buscar(dato3);
                break;
                
            case 4:
                log.info("Ingrese el dato a modificar");
                int dato4 = lectura.nextInt();
                lista1.modificar(dato4);
        }

    }

}
