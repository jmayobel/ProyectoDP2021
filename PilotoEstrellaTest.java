

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PilotoEstrellaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PilotoEstrellaTest
{
    /**
     * Default constructor for test class PilotoEstrellaTest
     */
    public PilotoEstrellaTest()
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
        PilotoEstrella pilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        assertEquals(0.92, pilotoEs1.getDestreza(), 0.2);
}
     @Test
    public void TestAñadirResultados()
    {
        PilotoEstrella PilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        PilotoEs1.añadirTiempo(circuito1, 123.32);
        PilotoEs1.añadirPuntos(circuito1, 10);
        assertEquals(1, PilotoEs1.getTamañoResultados());
        assertEquals(1, PilotoEs1.getCarrerasTerminadas());
        assertEquals(10, PilotoEs1.getPuntosTotales());
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        PilotoEs1.añadirTiempo(circuito2, -142.12);
        PilotoEs1.añadirPuntos(circuito2, 0);
        assertEquals(1, PilotoEs1.getCarrerasTerminadas());
        assertEquals(10, PilotoEs1.getPuntosTotales());
        CircuitoRally circuito3 = new CircuitoRally("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Mojado mojado1 = new Mojado(circuito3);
        PilotoEs1.añadirTiempo(mojado1, 159.3);
        PilotoEs1.añadirPuntos(mojado1, 6);
        assertEquals(16, PilotoEs1.getPuntosTotales());
        assertEquals(3, PilotoEs1.getTamañoResultados());
        assertEquals(2, PilotoEs1.getCarrerasTerminadas());
    }
}
