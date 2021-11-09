package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class Pila {

    static Logger log = Logger.getLogger(MainTurno.class.getName());

    private Nodo_ UltimoValorIngresado;
    int tamaño = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tamaño = 0;
    }

    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    public void InsertarNodo(int nodo) {
        Nodo_ nuevo_nodo = new Nodo_(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }

    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado;
        tamaño--;
        return auxiliar;
    }

    public int MostrarUltimoValorIngresado() {
        return UltimoValorIngresado.informacion;
    }

    public int TamañoPila() {
        return tamaño;
    }

    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    public void MostrarValores() {
        Nodo_ recorrido = UltimoValorIngresado;

        while (recorrido != null) {
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;

            log.info(Lista);
            Lista = "";
        }

    }

}
