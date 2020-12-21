
/**
 * Write a description of class Mojado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mojado extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Mojado
     */
    public Mojado(CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

     @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()+decoratedCircuitoRally.getValorComplejidad ()*1.15;
    }      
    
     @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.85;
    }      
    
}
