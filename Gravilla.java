
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class Gravilla extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own

    /**
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * Constructor de los objetos de la clase Gravilla.
     */
    public Gravilla (CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

     /**
     * @return devuelve la complejidad añadida del circuito Gravilla.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.05;
    } 
      /**
     * @return devuelve la distancia reducida del circuito Gravilla.
     */
    @Override
    public double getValorDistancia ()  {
     return  decoratedCircuitoRally.getValorDistancia ()*0.95;
    }     
}