
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class Nocturno extends CircuitoRallyExtra
{

    /**
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * Constructor de los objetos de la clase Nocturno
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
     return decoratedCircuitoRally.getValorComplejidad ()*1.2;
    }
    
    /**
     * @return devuelve la distancia reducida del circuito Nocturno.
     */
    @Override
    public double getValorDistancia ()  {
     return  decoratedCircuitoRally.getValorDistancia ()*0.8;
    }      
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + 
        "\n nueva complejidad: " + getValorComplejidad() + 
        "\n nueva distancia: " + getValorDistancia();
    }
 
}
