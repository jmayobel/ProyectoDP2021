
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
     * Constructor de los objetos de la clase Gravilla.
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * @return devuelve un objeto de tipo Gravilla.
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
     
    /**
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
