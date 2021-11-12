package co.edu.ucundinamarca.tallern;

public class Nodo {

    private Nodo padre;
    private Nodo hiijoDerecho;
    private Nodo hijoIzquierdo;
    private int llave;
    private Object value;

    public Nodo(int llave, Object valor) {
        this.padre = null;
        this.hiijoDerecho = null;
        this.hijoIzquierdo = null;
        this.llave = llave;
        this.value = valor;
    }

    /**
     * @return the padre
     */
    public Nodo getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    /**
     * @return the hiijoDerecho
     */
    public Nodo getHiijoDerecho() {
        return hiijoDerecho;
    }

    /**
     * @param hiijoDerecho the hiijoDerecho to set
     */
    public void setHiijoDerecho(Nodo hiijoDerecho) {
        this.hiijoDerecho = hiijoDerecho;
    }

    /**
     * @return the hijoIzquierdo
     */
    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * @param hijoIzquierdo the hijoIzquierdo to set
     */
    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    /**
     * @return the llave
     */
    public int getLlave() {
        return llave;
    }

    /**
     * @param llave the llave to set
     */
    public void setLlave(int llave) {
        this.llave = llave;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
