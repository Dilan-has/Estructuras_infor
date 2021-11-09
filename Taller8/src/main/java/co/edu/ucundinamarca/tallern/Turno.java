package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Turno {

    Scanner lectura = new Scanner(System.in);

    ArrayList<String> Datos = new ArrayList<String>();

    static Logger log = Logger.getLogger(MainTurno.class.getName());

    private Nodo inicioCola, finalCola;
    String cola = " ";

    public Turno() {
        inicioCola = null;
        finalCola = null;
    }

    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarTurno(int dato) {
        Nodo turno = new Nodo();
        turno.dato = dato;
        turno.siguiente = null;

        if (colaVacia()) {
            inicioCola = turno;
            finalCola = turno;
        } else {
            finalCola.siguiente = turno;
            finalCola = turno;
        }
    }

    public int TurnoAtendido() {
        if (!colaVacia()) {
            int turno = inicioCola.dato;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }

            log.info("Turno atendido " + turno);

            return turno;

        } else {

            return Integer.MAX_VALUE;

        }

    }

    public void MostrarTurnos() {

        Nodo recorrido = inicioCola;
        String ColaInvertida = " ";

        while (recorrido != null) {
            cola += recorrido.dato + " ";
            recorrido = recorrido.siguiente;
        }

        String cadena[] = cola.split(" ");

        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " + cadena[i];
        }

        log.info("Turnos pendientes " + ColaInvertida);
        cola = " ";

    }

    public void AgregarDatos() {
        String identificacion = "", nombre = "", titulo = "";

        if (Datos.contains(identificacion)) {
            log.info("No se puede registrar 2 veces la misma identificacion");
        } else {
            log.info("Ingrese identificacion");
            identificacion = lectura.next();
            Datos.add(identificacion);
        }

        log.info("Ingrese Nombre");
        nombre = lectura.next();
        Datos.add(nombre);

        if (Datos.contains(titulo)) {
            log.info("No se puede registrar 2 veces el mismo titulo");
        } else {
            log.info("Ingrese titulo del libro");
            titulo= lectura.next();
            Datos.add(titulo);
        }

    }
    
    public void VerDatos() {
        log.info(Datos);
        Datos.clear();
    }
}
