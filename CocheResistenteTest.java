

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CocheResistenteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CocheResistenteTest
{
    /**
     * Default constructor for test class CocheResistenteTest
     */
    public CocheResistenteTest()
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
    public void TestUsarCombustible()
    {
        CocheResistente cocheRes1 = new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO);
        CocheResistente cocheRes2 = new CocheResistente("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO);
        cocheRes1.UsarCombustible(490);
        cocheRes2.UsarCombustible(310);
        assertEquals(40, cocheRes2.getCombustibleRestante(), 0.1);
        assertEquals(70, cocheRes1.getCombustibleRestante(), 0.1);
        cocheRes2.UsarCombustible(70);
        assertEquals(70, cocheRes2.getCombustibleRestante(), 0.1);
    }
}


