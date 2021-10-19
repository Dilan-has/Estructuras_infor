package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainListaCD {

    static Logger log = Logger.getLogger(MainLista.class.getName());
    Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
        ListaCircularDoble lista1 = new ListaCircularDoble();
        
        lista1.InsertarNodoInt(15);
        lista1.InsertarNodoString("Jose");
        
        lista1.MostrarLista();
        
    }

    }
