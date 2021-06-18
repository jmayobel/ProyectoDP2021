import java.util.Comparator;

/**
 * Comparador de Pilotos que permite la ordenacion segun un orden
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public abstract class ComparadorPiloto implements Comparator<PilotoInterfaz> {
    /**
     * Comparador de Pilotos en funcion de la concentracion.
     * En caso de empate, comparara por la destreza del piloto,
     * en caso de empate, comparara por el total de puntos del piloto,
     * y en caso de empate, finalmente comparara por el nombre del piloto.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public abstract int compare(PilotoInterfaz p1, PilotoInterfaz p2);
}
