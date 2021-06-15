/**
 * Circuito con extra frio.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class Frio extends CircuitoRallyExtra {
    /**
     * Constructor parametrizado de la clase Frio.
     *
     * @param circuitorally,el circuito al cual se le va añadir el extra.
     */
    public Frio(Circuito circuitorally) {
        super(circuitorally);
    }


    /**
     * devuelve la complejidad añadida del circuito multiplicada por 1.1 .
     *
     * @return la complejidad añadida del circuito Frio.
     */
    @Override
    public double getValorComplejidad() {
        return decoratedCircuitoRally.getValorComplejidad() * 1.1;
    }

    /**
     * devuelve la distancia reducida del circuito multiplicada por 0.9 .
     *
     * @return la distancia reducida del circuito Frio.
     */
    @Override
    public double getValorDistancia() {
        return decoratedCircuitoRally.getValorDistancia() * 0.9;
    }

    /**
     * devuelvela informacion de la clase.
     *
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString() {
        return decoratedCircuitoRally.toString() + " " +
                "extra: " + getClass().getSimpleName() + " " +
                " -> nueva complejidad: " + getValorComplejidad() +
                " " + " -> nueva distancia: " + getValorDistancia();


    }
}
