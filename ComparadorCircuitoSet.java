import java.util.Comparator;

/**
 * Encapsulacion de comparadores
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public abstract class ComparadorCircuitoSet implements Comparator<Circuito> {
    /**
     * Comparador de Circuitos en función de la complejidad.
     * En caso de empate, comparará por la distancia,
     * y en caso de empate, finalmente comparará por el nombre del circuito.
     *
     * @param c1 Circuito a comparar
     * @param c2 Circuito a ser comparado
     */

    public abstract int compare(Circuito c1, Circuito c2);


}