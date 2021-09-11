package co.edu.ucundinamarca.tallern;

import static co.edu.ucundinamarca.tallern.Colegio.log;
import java.util.ArrayList;
import java.util.Scanner;

public class Semana {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> semana = new ArrayList<String>();

    public void cargarDias() {

        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

    }

    public void cuantosDias() {

        log.info(semana.size());

    }

    public void obtenerDia() {

        int n;
        log.info("Ingrese el numero de dia que desea obtener");
        n = sc.nextInt();
        
        log.info(semana.get(n-1));

    }
    
    public void mostrarDias(){
        log.info(semana);
    }

}
