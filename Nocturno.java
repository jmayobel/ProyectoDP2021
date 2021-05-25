
/**
 * Circuito con extra nocturno.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Nocturno extends CircuitoRallyExtra
{

    /** 
     * Constructor parametrizado de la clase Nocturno.
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     * 
     */
    public Nocturno(Circuito circuitorally)
    {
        super (circuitorally);
    }

    /**
     * devuelve la complejidad añadida del circuito multiplicada por 1.2 .
     * @return la complejidad añadida del circuito Nocturno.
     */
    @Override
    public double getValorComplejidad ()  {
        return decoratedCircuitoRally.getValorComplejidad ()*1.2;
    }

    /**
     * devuelve la distancia reducida del circuito multiplicada por 0.8 . 
     * @return  la distancia reducida del circuito Nocturno.
     */
    @Override
    public double getValorDistancia ()  {
        return  decoratedCircuitoRally.getValorDistancia ()*0.8;
    }      

    /**
     * devuelvela informacion de la clase . 
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
