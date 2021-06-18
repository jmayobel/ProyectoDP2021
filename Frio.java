/**
 * Circuito con extra frio
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class Frio extends CircuitoRallyExtra {

    /**
     * Constructor parametrizado de la clase Frio.
     *
     * @param circuitorally Circuito al cual se le va anadir el extra.
     */
    public Frio (CircuitoRally circuitorally)
    {
        super (circuitorally);
    }

    /**
     * Devuelve la complejidad anadida del circuito multiplicada por 1.1
     *
     * @return Complejidad anadida del circuito Frio.
     */
    @Override
    public double getValorComplejidad ()  {
        return decoratedCircuitoRally.getValorComplejidad ()*1.1;
    }

    /**
     * Devuelve la distancia reducida del circuito multiplicada por 0.9
     *
     * @return Distancia reducida del circuito Frio.
     */
    @Override
    public double getValorDistancia ()  {
        return decoratedCircuitoRally.getValorDistancia ()*0.9;
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return decoratedCircuitoRally.toString() + " " +
                "extra: " + getClass().getSimpleName() + " " +
                " -> nueva complejidad: " + Math.round(getValorComplejidad()*100d)/100d +
                " "+ " -> nueva distancia: " + Math.round(getValorDistancia ()*100d)/100d;
    }
}