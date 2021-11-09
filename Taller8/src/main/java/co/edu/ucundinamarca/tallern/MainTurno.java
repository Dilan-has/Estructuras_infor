package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class MainTurno {

    static Logger log = Logger.getLogger(MainTurno.class.getName());

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        int i = 0, rta, rta2;

        Turno lista1 = new Turno();

        do {
            log.info("Desea tomar un turno" + "\n" + "1.SI" + "\n" + "2.NO");
            rta = lectura.nextInt();

            lista1.InsertarTurno(i);
            i++;

            lista1.AgregarDatos();

            lista1.VerDatos();
            log.info("Turno: " + i);
            
        } while (rta != 2);

        do {
            log.info("1 para atender turno");
            log.info("2 para ver turnos por atender");
            log.info("3 para salir");
            rta2 = lectura.nextInt();

            switch (rta2) {
                case 1:
                    lista1.TurnoAtendido();
                    break;
                    
                case 2:
                    lista1.MostrarTurnos();
            }

        } while (rta2 != 3);

    }

}
