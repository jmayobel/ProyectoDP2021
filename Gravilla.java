
/**
 * Circuito con extra gravilla.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Gravilla extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own

    /**
     * Constructor parametrizado de la clase Gravilla.
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     */
    public Gravilla (CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

     /**
      * devuelve la complejidad añadida del circuito multiplicada por 1.05 .
     * @return la complejidad añadida del circuito Gravilla.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()*1.05;
    } 
    /**
     * devuelve la distancia reducida del circuito multiplicada por 0.95 .
     * @return la distancia reducida del circuito Gravilla.
     */
    @Override
    public double getValorDistancia ()  {
     return  decoratedCircuitoRally.getValorDistancia ()*0.95;
    }     
     
    /**
     * devuelvela informacion de la clase.
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString() {   
         return decoratedCircuitoRally.toString() + " " +
        "extra:" + getClass().getSimpleName() + " " +
        " -> nueva complejidad: " + getValorComplejidad() + 
        " "+ " -> nueva distancia: " + getValorDistancia ();

    }
}
