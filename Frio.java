
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
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

    
     
    /**
     * @return devuelve la complejidad añadida del circuito Frio.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.1;
    }
    
    /**
     * @return devuelve la distancia reducida del circuito Frio.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ()*0.9;
    }      
}
