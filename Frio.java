   
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class Frio extends CircuitoRallyExtra
{
   /**
    *  @param circuitorally,el circuito al cual se le va añadir el extra.
     * Constructor de los objetos de la clase Nocturno.
     * @return devuelve un objeto de tipo Frio.
     */
    public Frio (CircuitoRally circuitorally)
    {
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
    
   @Override
    public String toString() {
               return decoratedCircuitoRally.toString()+
        "\n + extra:" + getClass().getSimpleName() +
        " -> nueva complejidad: " + getValorComplejidad() + 
        "\n"+ getValorDistancia ();
    } 
}
