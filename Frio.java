
/**
 * Write a description of class Frio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frio extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own
   /**
     * Constructor for objects of class Nocturno
     */
    public Frio (CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()+decoratedCircuitoRally.getValorComplejidad ()*1.1;
    }
    
     @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.9;
    }      
}
