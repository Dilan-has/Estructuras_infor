
package co.edu.ucundinamarca.tallern;

import java.util.Iterator;
import java.util.ListIterator;
import org.apache.log4j.Logger;

public class MainListable {
    
     static Logger log = Logger.getLogger(dulcesMain.class.getName());

    public static void main(String[] args) {
        
        Listable lista1 = new Listable();
        
        lista1.Agregar(25);
        lista1.Agregar(26);
        lista1.Agregar(27);
        lista1.Agregar(28);
        
        lista1.VerLista();
        
        lista1.Contiene(27);
        lista1.EstaVacia();
        lista1.PrimerElemento();
        lista1.Sustituir(28);
        lista1.Vaciar();
        
    }
    
}
