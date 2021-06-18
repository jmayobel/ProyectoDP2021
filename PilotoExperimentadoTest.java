

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PilotoExperimentadoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PilotoExperimentadoTest
{
    /**
     * Default constructor for test class PilotoExperimentadoTest
     */
    public PilotoExperimentadoTest()
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
    public void TestPilotoExperimentado()
    {
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Ogier", Concentracion.NORMAL);
        assertEquals(0.78, pilotoEx1.getDestreza(), 0.2);
}
}
