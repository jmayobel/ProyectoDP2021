

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
    public void TestgetDestreza()
    {
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Ogier", Concentracion.NORMAL);
        assertEquals(0.78, pilotoEx1.getDestreza(), 0.2);
}

    @Test
    public void TestAñadirResultados()
    {
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Kankunnen", Concentracion.CONCENTRADO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        pilotoEx1.añadirTiempo(circuito1, 123.32);
        pilotoEx1.añadirPuntos(circuito1, 10);
        assertEquals(1, pilotoEx1.getTamañoResultados());
        assertEquals(1, pilotoEx1.getCarrerasTerminadas());
        assertEquals(10, pilotoEx1.getPuntosTotales());
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        pilotoEx1.añadirTiempo(circuito2, -142.12);
        pilotoEx1.añadirPuntos(circuito2, 0);
        assertEquals(1, pilotoEx1.getCarrerasTerminadas());
        assertEquals(10, pilotoEx1.getPuntosTotales());
        CircuitoRally circuito3 = new CircuitoRally("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Mojado mojado1 = new Mojado(circuito3);
        pilotoEx1.añadirTiempo(mojado1, 159.3);
        pilotoEx1.añadirPuntos(mojado1, 6);
        assertEquals(16, pilotoEx1.getPuntosTotales());
        assertEquals(3, pilotoEx1.getTamañoResultados());
        assertEquals(2, pilotoEx1.getCarrerasTerminadas());
    }
}

