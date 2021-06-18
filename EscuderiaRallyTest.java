

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EscuderiaRallyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EscuderiaRallyTest
{
    /**
     * Default constructor for test class EscuderiaRallyTest
     */
    public EscuderiaRallyTest()
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
    public void TestgetEscuderiaDescalificada()
    {
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Blomquist", Concentracion.DESPISTADO);
        PilotoEstrella pilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        ComparadorTotalPuntos comparad3 = new ComparadorTotalPuntos();
        ComparadorCombustible comparad4 = new ComparadorCombustible();
        EscuderiaRally escuderi2 = new EscuderiaRally("Seat", comparad3, comparad4);
        escuderi2.addListaPilotos(pilotoEx1);
        escuderi2.OrdenarListaPilotos();
        escuderi2.addListaPilotos(pilotoEs1);
        assertEquals(false, escuderi2.EscuderiaDescalificada());
        pilotoEx1.descalificar();
        assertEquals(false, escuderi2.EscuderiaDescalificada());
        pilotoEs1.descalificar();
        assertEquals(true, escuderi2.EscuderiaDescalificada());
    }
     @Test
    public void TestgetCarrerasTerminadas()
    {
        ComparadorTotalPuntos comparad3 = new ComparadorTotalPuntos();
        ComparadorCombustible comparad4 = new ComparadorCombustible();
        EscuderiaRally escuderi2 = new EscuderiaRally("Seat", comparad3, comparad4);
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Blomquist", Concentracion.DESPISTADO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        pilotoEx1.añadirTiempo(circuito1,170);
        pilotoEx1.añadirTiempo(circuito2,-160);
        escuderi2.addListaPilotos(pilotoEx1);
        assertEquals(1, escuderi2.getCarrerasTerminadasEsc());
        PilotoEstrella pilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        pilotoEs1.añadirTiempo(circuito1,170);
        pilotoEs1.añadirTiempo(circuito2,80);
        escuderi2.OrdenarListaPilotos();
        escuderi2.addListaPilotos(pilotoEs1);
        assertEquals(3, escuderi2.getCarrerasTerminadasEsc());
        
    }
    @Test
    public void TestgetPuntosTotalesEsc()
    {
        ComparadorTotalPuntos comparad3 = new ComparadorTotalPuntos();
        ComparadorCombustible comparad4 = new ComparadorCombustible();
        EscuderiaRally escuderi2 = new EscuderiaRally("Seat", comparad3, comparad4);
        PilotoExperimentado pilotoEx1 = new PilotoExperimentado("Blomquist", Concentracion.DESPISTADO);
        CircuitoRally circuito1 = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        CircuitoRally circuito2 = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        pilotoEx1.añadirTiempo(circuito1,170);
        pilotoEx1.añadirPuntos(circuito1, 10);
        pilotoEx1.añadirTiempo(circuito2,-160);
        pilotoEx1.añadirPuntos(circuito2, 0);
        escuderi2.addListaPilotos(pilotoEx1);
        assertEquals(10, escuderi2.getPuntosTotalesEscuderia());
        PilotoEstrella pilotoEs1 = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        pilotoEs1.añadirTiempo(circuito1,170);
        pilotoEs1.añadirTiempo(circuito2,80);
        pilotoEs1.añadirPuntos(circuito2, 8);
        pilotoEs1.añadirPuntos(circuito2, 4);
        escuderi2.OrdenarListaPilotos();
        escuderi2.addListaPilotos(pilotoEs1);
        assertEquals(22, escuderi2.getPuntosTotalesEscuderia());
        
    }
}

