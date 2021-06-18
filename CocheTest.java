

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CocheTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CocheTest
{
    /**
     * Default constructor for test class CocheTest
     */
    public CocheTest()
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
        Coche coche1 = new Coche("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        Gravilla gravilla1 = new Gravilla(circuito1);
        PilotoNovato pilotoNo1 = new PilotoNovato("Blomquist", Concentracion.DESPISTADO);
        assertEquals(153.33, coche1.getVelocidadReal(pilotoNo1, gravilla1), 2);
        coche1.UsarCombustible(90);
        assertEquals(260, coche1.getCombustibleRestante(), 0.1);
    }
}

