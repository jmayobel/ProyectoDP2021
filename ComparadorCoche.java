import java.util.Comparator;

/**
 * Comparador de Coches que permite la ordenación según un orden.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 0.1
 */
public abstract class ComparadorCoche implements Comparator<CocheInterfaz> {
    /**
     * Comparador de Coches en función de la velocidad.
     * En caso de empate, comparará por el combustible del coche,
     * y en caso de empate, finalmente comparará por el nombre del coche.
     *
     * @param c1 Coche a comparar
     * @param c2 Coche a ser comparado
     */
    public abstract int compare(CocheInterfaz c1, CocheInterfaz c2);
}
