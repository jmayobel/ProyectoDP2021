   
/**
 * 
 * Circuito con extra frio.
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Frio extends CircuitoRallyExtra
{
   /**
    * Constructor parametrizado de la clase Frio.
    * @param circuitorally,el circuito al cual se le va añadir el extra.
    * @return devuelve un objeto de tipo Frio.
    */
    public Frio (CircuitoRally circuitorally)
    {
        super (circuitorally);
    }

    
   /**
    * devuelve la complejidad añadida del circuito multiplicada por 1.1.
     * @return devuelve la complejidad añadida del circuito Frio.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.1;
    }
   
   /**
    * devuelve la distancia reducida del circuito multiplicada por 0.9.
     * @return devuelve la distancia reducida del circuito Frio.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ()*0.9;
    }      
    
    /**
     * devuelvela informacion de la clase.
     * @return devuelve un string con la informacion de la clase.
     */
    @Override
    public String toString() {
          return decoratedCircuitoRally.toString() + "\n" +
         "extra:" + getClass().getSimpleName() + "\n" +
        " -> nueva complejidad: " + getValorComplejidad() + 
        "\n"+ " -> nueva distancia: " + getValorDistancia ();
        
    } 
}
