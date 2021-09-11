package co.edu.ucundinamarca.tallern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.vm.ci.code.CodeUtil.K;
import org.apache.log4j.Logger;

public class Colegio {

    private int codigo;
    private int nacionalidad;

    Scanner sc = new Scanner(System.in);

    static Logger log = Logger.getLogger(Main.class.getName());
    Scanner lectura = new Scanner(System.in);

    Map alumno = new HashMap();

    public void addAlumno() {

        char entrada;

        do {

            log.info("Ingrese una nacionalidad");
            String nacionalidad = sc.next();
            
            

            alumno.put(codigo, nacionalidad.toUpperCase());

            codigo++;

            log.info("Desea ingresar nacionalidad escriba S(para si) o N(para no)");
            entrada = sc.next().charAt(0);

        } while (entrada != 'n' && entrada != 'N');
    }

    public void MostrarTodosAlumno() {
        log.info("Alumnos registradas: " + alumno.values());
    }

    public void CuantosAlumno() {

        log.info("Cantidad de alumnos: " + alumno.size());
    }

    public void BorrarAlumno() {

        char resp = 0;

        log.info("Desea borrar registros escriba S(para si) o N(para no)");
        resp = sc.next().charAt(0);

        if (resp == 'S') {

            alumno.clear();
            log.info("Correctamente borrados");
            
        } else {
            log.info("Los datos no se borraron");
        }
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
