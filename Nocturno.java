
/**
 * Write a description of class Nocturno here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()+decoratedCircuitoRally.getValorComplejidad ()*1.2;
    }
    
     @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.8;
    }      
    
    
}
