/**
 * Circuito con extra nocturno
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class Nocturno extends CircuitoRallyExtra{

    /**
     * Constructor parametrizado de la clase Nocturno
     *
     * @param circuitorally Circuito al cual se le va anadir el extra
     */
    public Nocturno(CircuitoRally circuitorally)
    {
        super (circuitorally);
    }

    /**
     * Devuelve la complejidad anadida del circuito multiplicada por 1.2
     *
     * @return Complejidad anadida del circuito Nocturno
     */
    @Override
    public double getValorComplejidad ()  {
        return decoratedCircuitoRally.getValorComplejidad ()*1.2;
    }

    /**
     * Devuelve la distancia reducida del circuito multiplicada por 0.8
     *
     * @return Distancia reducida del circuito Nocturno
     */
    @Override
    public double getValorDistancia ()  {
        return  decoratedCircuitoRally.getValorDistancia ()*0.8;
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