

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CocheRapidoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CocheRapidoTest
{
    /**
     * Default constructor for test class CocheRapidoTest
     */
    public CocheRapidoTest()
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
    public void TestgetVelocidadReal()
    {
        CocheRapido cocheRap1 = new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO);
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Ogier", Concentracion.NORMAL);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        Gravilla gravilla1 = new Gravilla(circuito1);
        assertEquals(224.52, cocheRap1.getVelocidadReal(pilotoEx1, gravilla1), 1);
        PilotoEstrella pilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        Gravilla gravilla2 = new Gravilla(circuito2);
        assertEquals(169.52, cocheRap1.getVelocidadReal(pilotoEs1, gravilla2), 1);
    }
}

