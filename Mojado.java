
/**
 * 
 * Circuito con extra mojado.
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Mojado extends CircuitoRallyExtra
{
    /**
     * Constructor parametrizado de la clase Mojado.
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     */
    public Mojado(Circuito circuitorally)
    {
        super (circuitorally);
    }

     
    /**
     * devuelve la complejidad añadida del circuito multiplicada por 1.15  .
     * @return  la complejidad añadida del circuito Mojado.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.15;
    }      
    
     
    /**
     * devuelve la distancia reducida del circuito multiplicada por 0.85 .
     * @return  la distancia reducida del circuito Mojado.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ()*0.85;
    }      
    
    
     /**
      * 
      * devuelvela informacion de la clase.
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString() {

      return decoratedCircuitoRally.toString() + " " +
        "extra: " + getClass().getSimpleName() + " " +
        " -> nueva complejidad: " + getValorComplejidad() + 
        " "+ " -> nueva distancia: " + getValorDistancia ();

        

    }
    
}
