
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class Nocturno extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Nocturno
     */
    public Nocturno(CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

    /**
     * @return devuelve la complejidad añadida del circuito Nocturno.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad () + decoratedCircuitoRally.getValorComplejidad ()*1.2;
    }
    
     /**
     * @return devuelve la distancia reducida del circuito Nocturno.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.8;
    }      
    
    
}
