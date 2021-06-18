

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NocturnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NocturnoTest
{
    /**
     * Default constructor for test class NocturnoTest
     */
    public NocturnoTest()
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
        Nocturno noc1 = new Nocturno(circuito3);
        assertEquals(1.5, noc1.getValorComplejidad(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Nocturno noc2 = new Nocturno(circuito2);
        assertEquals(1.8, noc2.getValorComplejidad(), 0.1);
    }
    
    @Test
    public void TestGetDistancia()
    {
        CircuitoRally circuito3 = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Nocturno noc1 = new Nocturno(circuito3);
        assertEquals(220, noc1.getValorDistancia(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Nocturno noc2 = new Nocturno(circuito2);
        assertEquals(200, noc2.getValorDistancia(), 0.1);
    }
}
