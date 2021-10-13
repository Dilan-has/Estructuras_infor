package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dulces {

    static Logger log = Logger.getLogger(dulcesMain.class.getName());

    ArrayList<String> Dulces = new ArrayList<String>();

    public void AgregarElemento() {

        Dulces.add("Colombina");
        Dulces.add("Menta");
        Dulces.add("Chocolate");
        Dulces.add("Chocolatina");
        Dulces.add("Chicle");
        Dulces.add("Bombombun");
        Dulces.add("Chocorramo");
        Dulces.add("Gancito");
        Dulces.add("Sparkies");
        Dulces.add("Gomitas");
    }

    public int ImprimirElemento(int Tamaño) {

        AgregarElemento();

        Iterator<String> ite = Dulces.iterator();
        while (ite.hasNext()) {
            log.info(ite.next());
        }

        log.info(Dulces.size());

        return Tamaño = Dulces.size();
    }

    public String ImprimirSinIterador(String buscardulce) {
        
        log.info(Dulces);

        if (Dulces.contains(buscardulce)) {
            log.info("Si se encuntra dentro del arreglo: " + buscardulce);
            String dulcedentrodelista = "ChocoRamo";
            return buscardulce = dulcedentrodelista;
        }
        
        else{
            log.info("No encontro dulce");
            return buscardulce;
        }
    }


}
