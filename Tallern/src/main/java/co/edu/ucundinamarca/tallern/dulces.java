package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dulces {
    
    static Logger log = Logger.getLogger(Main.class.getName());

    ArrayList<String> Dulces = new ArrayList<String>();

    public void AgregarElementos() {

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

    public void ImprimirElemento() {

        for (int i = 0; i < Dulces.size(); i++) {
            log.info(Dulces.get(i));
        }

    }

}
