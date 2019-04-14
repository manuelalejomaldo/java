

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class TestUtilidad  {

	Utilidad utilidad;
	
	@Before
	public void init() {
	   utilidad= new Utilidad();
	}

    @Test public void suma() {
        assertEquals("suma 2 + 3", 5, utilidad.suma(2,3));
    }

    @Test public void menor() {
        assertEquals("menor de 2 i 3", 2, utilidad.menor(2,3));
        assertEquals("menor de 3 i 2", 2, utilidad.menor(3,2));

    }

    @Test public void menorTresElementos() {
        assertEquals("menor de 2,3,1", 1, utilidad.menor(2,3,1));
        assertEquals("menor de 3,1,2", 1, utilidad.menor(3,1,2));
        assertEquals("menor de 0,2,3", 0, utilidad.menor(0,2,3));

    }

    @Test public void hayRepetidos() {
        assertFalse("NO repetidos a 2,3,1", utilidad.hayRepetidos(2,3,1));
        assertTrue("repetidos a 1,1,1", utilidad.hayRepetidos(1,1,1));
        assertTrue("repetidos a 2,1,1", utilidad.hayRepetidos(2,1,1));
        assertTrue("repetidos a 4,1,4", utilidad.hayRepetidos(4,1,4));
    }
    
    @Test(timeout=2000)
    public void sumatorio() {
    	assertEquals("sumatorio de 0", 0, utilidad.sumatorio(0));
    	assertEquals("sumatorio de 1", 1, utilidad.sumatorio(1));
    	assertEquals("sumatorio de 2", 1 + 2, utilidad.sumatorio(2));
    	assertEquals("sumatorio de 5", 1 + 2 + 3 + 4 + 5, utilidad.sumatorio(5));
    	
    	assertEquals("para 65636", 2154075066L, utilidad.sumatorio(65636));
    }

    @Test(timeout=4000)
    public void testFibonacci() {
    	int[] fibonaccis = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};
    	for (int i = 0; i < fibonaccis.length; i++) {
        	assertEquals("fibonacci de i", fibonaccis[i], utilidad.fibonacci(i));
    	}
    }
    
    @Test
    public void redondea() {
    	assertEquals("redondea de 2.0", 2, utilidad.redondea(2.0f));
    	assertEquals("redondea de 2.4", 2, utilidad.redondea(2.4f));
    	assertEquals("redondea de 2.45", 2, utilidad.redondea(2.45f));
    	assertEquals("redondea de 2.5", 3, utilidad.redondea(2.5f));
    	assertEquals("redondea de 2.7", 3, utilidad.redondea(2.5f));
    	assertEquals("redondea de -2.5", -2, utilidad.redondea(-2.5f));
    }
    
    @Test
    public void divisionFloat() {
    	assertEquals("5 / 2", 2.5, utilidad.divisionFloat(5, 2), 0f);
    	assertEquals("4 / 2", 2f, utilidad.divisionFloat(4, 2), 0f);
    	assertEquals("4 / 0", 0f, utilidad.divisionFloat(4, 0), 0f);
    }
    
    @Test(timeout=4000)
    public void esPrimo() {
    	assertTrue("1", utilidad.esPrimo(1));
    	assertTrue("2", utilidad.esPrimo(2));
    	assertTrue("3", utilidad.esPrimo(3));
    	assertFalse("4", utilidad.esPrimo(4));
    	assertFalse("9", utilidad.esPrimo(9));
    	assertTrue("17", utilidad.esPrimo(17));
    }
}
