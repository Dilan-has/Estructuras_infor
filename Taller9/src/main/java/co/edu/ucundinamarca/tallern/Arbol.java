/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author dhper
 */
public class Arbol {
    
    static Logger log = Logger.getLogger(Main.class.getName());
    
    public Nodo raiz;
    private String[] niveles;
    private int tamaño;
    private int altura;
    
    public Arbol(){
        this.raiz = null;
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public void setRaiz(){
        this.raiz = raiz;
    }
    
    public void agregar(int llave, Object value) {
        Nodo n1 = new Nodo(llave, value);
        
        if (raiz == null) {
            raiz = n1;
        } else {
            Nodo temp = raiz;
            while (temp != null) {
                n1.setPadre(temp);
                if (n1.getLlave() < temp.getLlave()) {
                    temp = temp.getHijoIzquierdo();
                } else {
                    temp = temp.getHiijoDerecho();
                }
            }
            
            if (n1.getLlave() < n1.getPadre().getLlave()) {
                n1.getPadre().setHijoIzquierdo(n1);
            } else {
                n1.getPadre().setHiijoDerecho(n1);
            }
        }
    }
    
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 0);
        return altura;
    }
    
    private void retornarAltura(Nodo num, int nivel) {
        if (num != null) {
            retornarAltura(num.getHijoIzquierdo(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(num.getHiijoDerecho(), nivel + 1);
        }
    }
    
    public void porNiveles() {
        niveles = new String[altura + 1];
        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            log.info("Llaves ->" + niveles[i] + "(nivel: " + (i + 1) + ")");
        }
    }
    
    private void imprimirNivel(Nodo num, int nivel) {
        if (num != null) {
            niveles[nivel] = num.getLlave() + "  " + ((niveles[nivel] != null) ? niveles[nivel] : "");
            imprimirNivel(num.getHiijoDerecho(), nivel + 1);
            imprimirNivel(num.getHijoIzquierdo(), nivel + 1);
        }
    }
    
    public void preOrden(Nodo num) {
        if (num != null) {
            log.info("La llave es: " + num.getLlave() + " y el elemento es: " + num.getValue());
            preOrden(num.getHijoIzquierdo());
            preOrden(num.getHiijoDerecho());
        }
    }
    
    public void postOrden(Nodo num) {
        if (num != null) {
            postOrden(num.getHijoIzquierdo());
            postOrden(num.getHiijoDerecho());
            log.info("La llave es: " + num.getLlave() + "y el elemento es: " + num.getValue());
        }
    }
    
}
