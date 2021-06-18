import java.util.Collections;
import java.util.Comparator;

/**
 * Encapsulacion de comparadores
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorCarrerasTerminadas implements Comparator<EscuderiaInterfaz> {

    /**
     * Comparador de EscuderiaInterfaz en función de las carreras terminadas por sus pilotos.
     * En caso de empate, comparara por el nombre de la escuderia,
     *
     * @param e1 Escuderia a comparar
     * @param e2 Escuderia a ser comparada
     */
    public int compare(EscuderiaInterfaz e1, EscuderiaInterfaz e2) {
        if (e1.getCarrerasTerminadasEsc() == e2.getCarrerasTerminadasEsc())
            return Collections.reverseOrder(new ComparadorNombreEscuderia()).compare(e1, e2);
        else if (e1.getCarrerasTerminadasEsc() > e2.getCarrerasTerminadasEsc())
            return 1;
        else
            return -1;
    }
}
