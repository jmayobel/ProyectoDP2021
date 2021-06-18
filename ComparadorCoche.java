import java.util.Comparator;

/**
 * Comparador de Coches que permite la ordenación según un orden
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version 1.0
 */
public abstract class ComparadorCoche implements Comparator<CocheInterfaz> {

    /**
     * Comparador de Coches en funcion de la velocidad.
     * En caso de empate, comparara por el combustible del coche,
     * y en caso de empate, finalmente comparara por el nombre del coche
     *
     * @param c1 Coche a comparar
     * @param c2 Coche a ser comparado
     */
    public abstract int compare(CocheInterfaz c1, CocheInterfaz c2);
}
