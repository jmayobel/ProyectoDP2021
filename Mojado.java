
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
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

     
    /**
     * @return devuelve la complejidad añadida del circuito Mojado.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad () + decoratedCircuitoRally.getValorComplejidad ()*1.15;
    }      
    
     
    /**
     * @return devuelve la distancia reducida del circuito Mojado.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.85;
    }      
    
}
