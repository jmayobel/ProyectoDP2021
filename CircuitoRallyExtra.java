/**
 * Clase padre del patron decorator
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public abstract class CircuitoRallyExtra extends CircuitoRally
{
    //Variables de la clase CircuitoRallyeExtra:
    protected CircuitoRally decoratedCircuitoRally; //Circuito para el decorator

    /**
     * Constructor parametrizado de la clase CircuitoRallyExtra.
     *
     * @param  circuitorally Circuito al que se añadirá la nueva funcionalidad
     */
    public CircuitoRallyExtra (CircuitoRally circuitorally)
    {
        super (circuitorally.getNombreCircuito(),circuitorally.getComplejidad (),circuitorally.getDistancia ());
        decoratedCircuitoRally=circuitorally;
    }

    /**
     * Devuelve el valor de la complejidad.
     *
     * @return double Valor de la complejidad de decoratedCircuitoRally.
     */
    @Override
    public double getValorComplejidad ()  {
        return Math.round(decoratedCircuitoRally.getValorComplejidad ()*100d)/100d;
    }

    /**
     * Devuelve el valor de la distancia.
     *
     * @return  el valor de la distancia de decoratedCircuitoRally.
     */
    @Override
    public double getValorDistancia ()  {
        return Math.round(decoratedCircuitoRally.getValorDistancia ()*100d)/100d;
    }

    /**
     * devuelve la informacion de la clase.
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString ()
    {
        // put your code here
        return decoratedCircuitoRally.toString()+
                "< extra: " + getClass().getSimpleName() +
                " -> nueva complejidad: " + getValorComplejidad() +
                " "+ getValorDistancia () + " >";
    }
}