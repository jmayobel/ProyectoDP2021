
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class Mojado extends CircuitoRallyExtra
{
    /**
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * Constructor de los objetos de la clase Mojado.
     * 
     * @return devuelve un objeto de tipo Mojado.
     */
    public Mojado(CircuitoRally circuitorally)
    {
        super (circuitorally);
    }

     
    /**
     * @return devuelve la complejidad añadida del circuito Mojado.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.15;
    }      
    
     
    /**
     * @return devuelve la distancia reducida del circuito Mojado.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ()*0.85;
    }      
    
    
    @Override
    public String toString() {
      return decoratedCircuitoRally.toString() + "\n" +
         "extra:" + getClass().getSimpleName() + "\n" +
        " -> nueva complejidad: " + "\n" + getValorComplejidad() + 
        "\n"+ getValorDistancia ();
        
    }
    
}
