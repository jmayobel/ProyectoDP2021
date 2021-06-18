

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FrioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FrioTest
{
    /**
     * Default constructor for test class FrioTest
     */
    public FrioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void TestGetComplejidad()
    {
        CircuitoRally circuito3 = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Frio frio1 = new Frio(circuito3);
        assertEquals(1.375, frio1.getValorComplejidad(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Frio frio2 = new Frio(circuito2);
        assertEquals(1.65, frio2.getValorComplejidad(), 0.1);
    }
    
    @Test
    public void TestGetDistancia()
    {
        CircuitoRally circuito3 = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Frio frio1 = new Frio(circuito3);
        assertEquals(247.5, frio1.getValorDistancia(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Frio frio2 = new Frio(circuito2);
        assertEquals(225, frio2.getValorDistancia(), 0.1);
    }
}
