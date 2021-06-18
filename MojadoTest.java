

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MojadoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MojadoTest
{
    /**
     * Default constructor for test class MojadoTest
     */
    public MojadoTest()
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
        Mojado mojado1 = new Mojado(circuito3);
        assertEquals(1.4375, mojado1.getValorComplejidad(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Mojado mojado2 = new Mojado(circuito2);
        assertEquals(1.725, mojado2.getValorComplejidad(), 0.1);
    }
    
    @Test
    public void TestGetDistancia()
    {
        CircuitoRally circuito3 = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Mojado mojado1 = new Mojado(circuito3);
        assertEquals(233.75, mojado1.getValorDistancia(), 0.1);
        CircuitoRally circuito2 = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        Mojado mojado2 = new Mojado(circuito2);
        assertEquals(212.5, mojado2.getValorDistancia(), 0.1);
    }
}
