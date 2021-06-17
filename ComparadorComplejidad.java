import java.util.Collections;

/**
 * Comparador de complejidad de circuitos.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorComplejidad extends ComparadorCircuitoSet {
    public int compare(Circuito c1, Circuito c2) {
        if (c1.getValorComplejidad() == c2.getValorComplejidad())
            return  Collections.reverseOrder(new ComparadorDistancia()).compare(c1, c2);
        else if (c1.getValorComplejidad() > c2.getValorComplejidad())
            return 1;
        else
            return -1;
    }
}
