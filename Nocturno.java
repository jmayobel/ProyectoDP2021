
/**
 * Circuito con extra nocturno.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Nocturno extends CircuitoRallyExtra
{

    /** 
     * Constructor de los objetos de la clase Nocturno.
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * @return devuelve un objeto de tipo Nocturno.
     * 
     */
    public Nocturno(CircuitoRally circuitorally)
    {
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
