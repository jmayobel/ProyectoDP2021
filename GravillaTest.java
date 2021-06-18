

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GravillaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GravillaTest
{
    /**
     * Default constructor for test class GravillaTest
     */
    public GravillaTest()
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
        Gravilla gravilla1 = new Gravilla(circuito3);
        assertEquals(1.3125, gravilla1.getValorComplejidad(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Gravilla gravilla2 = new Gravilla(circuito2);
        assertEquals(1.575, gravilla2.getValorComplejidad(), 0.1);
    }
    
    @Test
    public void TestGetDistancia()
    {
        CircuitoRally circuito3 = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Gravilla gravilla1 = new Gravilla(circuito3);
        assertEquals(261.25, gravilla1.getValorDistancia(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Gravilla gravilla2 = new Gravilla(circuito2);
        assertEquals(237.5, gravilla2.getValorDistancia(), 0.1);
    }
}

