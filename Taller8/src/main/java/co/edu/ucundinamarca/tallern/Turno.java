package co.edu.ucundinamarca.tallern;

public class Turno {

    private Nodo inicioCola, finalCola;
    String cola = "";

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

            return turno;

        } else {

            return Integer.MAX_VALUE;

        }
    }
}
