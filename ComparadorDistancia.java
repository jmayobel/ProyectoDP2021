/**
 * Comparador de distancia de circuitos
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorDistancia extends ComparadorCircuitoSet {

    /**
     * Comparador de Circuitos en funcion de la distancia.
     * En caso de empate, comparara por nombre
     *
     * @param c1 Piloto a comparar
     * @param c2 Piloto a ser comparado
     */
    public int compare(Circuito c1, Circuito c2) {
        if (c1.getValorDistancia() == c2.getValorDistancia())
            return (c1.getNombreCircuito().compareTo(c2.getNombreCircuito()));
        else if (c1.getValorDistancia() > c2.getValorDistancia())
            return 1;
        else
            return -1;
    }
}
