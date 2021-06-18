import java.util.Collections;

/**
 * Comparador de complejidad de circuitos.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorComplejidad extends ComparadorCircuitoSet {

    /**
     * Comparador de Circuitos en función de la complejidad.
     * En caso de empate, comparará por la distancia.
     *
     * @param c1 Circuito a comparar
     * @param c2 Circuito a ser comparado
     */
    public int compare(Circuito c1, Circuito c2) {
        if (c1.getValorComplejidad() == c2.getValorComplejidad())
            return  Collections.reverseOrder(new ComparadorDistancia()).compare(c1, c2);
        else if (c1.getValorComplejidad() > c2.getValorComplejidad())
            return 1;
        else
            return -1;
    }
}
