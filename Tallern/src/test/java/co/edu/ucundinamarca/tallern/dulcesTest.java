package co.edu.ucundinamarca.tallern;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class dulcesTest {

    dulces test1 = new dulces();

    @Test
    public void TestTamañoDulces() {

        int resultado = test1.ImprimirElemento(9);
        assertEquals(10, resultado);

    }
    
    @Test
    public void TestBuscarDulce() {
        
        String resultado = test1.ImprimirSinIterador("Chocorramo");
        assertEquals("Chocorramo", resultado);
        
    }
    
}
