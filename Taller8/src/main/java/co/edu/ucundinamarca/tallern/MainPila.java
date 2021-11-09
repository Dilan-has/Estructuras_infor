package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class MainPila {

    static Logger log = Logger.getLogger(MainTurno.class.getName());

    public static void main(String[] args) {
        Pila pila1 = new Pila();

        pila1.InsertarNodo(0);
        pila1.InsertarNodo(1);
        pila1.InsertarNodo(2);
        pila1.InsertarNodo(3);
                
        pila1.PilaVacia();

        pila1.EliminarNodo();

        pila1.MostrarUltimoValorIngresado();

        pila1.MostrarValores();
        
        pila1.TamañoPila();
        
        pila1.VaciarPila();

    }

}
