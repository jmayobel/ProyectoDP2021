

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PilotoNovatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PilotoNovatoTest
{
    /**
     * Default constructor for test class PilotoNovatoTest
     */
    public PilotoNovatoTest()
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
        PilotoNovato PilotoNo1 = new PilotoNovato("Blomquist", Concentracion.DESPISTADO);
        assertEquals(0.7, PilotoNo1.getDestreza(), 0.2);
    }   
     @Test
    public void TestAñadirResultados()
    {
        PilotoNovato PilotoNo1 = new PilotoNovato("Blomquist", Concentracion.DESPISTADO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        PilotoNo1.añadirTiempo(circuito1, 123.32);
        PilotoNo1.añadirPuntos(circuito1, 10);
        assertEquals(1, PilotoNo1.getTamañoResultados());
        assertEquals(1, PilotoNo1.getCarrerasTerminadas());
        assertEquals(10, PilotoNo1.getPuntosTotales());
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        PilotoNo1.añadirTiempo(circuito2, -142.12);
        PilotoNo1.añadirPuntos(circuito2, 0);
        assertEquals(1, PilotoNo1.getCarrerasTerminadas());
        assertEquals(10, PilotoNo1.getPuntosTotales());
        CircuitoRally circuito3 = new CircuitoRally("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        Mojado mojado1 = new Mojado(circuito3);
        PilotoNo1.añadirTiempo(mojado1, 159.3);
        PilotoNo1.añadirPuntos(mojado1, 6);
        assertEquals(16, PilotoNo1.getPuntosTotales());
        assertEquals(3, PilotoNo1.getTamañoResultados());
        assertEquals(2, PilotoNo1.getCarrerasTerminadas());
    }
}
