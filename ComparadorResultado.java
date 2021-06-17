import java.util.Collections;

/**
 * Write a description of class ComparadorResultado here.
 *
 * @author Miguel Medina Cantos y Juan Manuel Mayo
 * @version (a version number or a date)
 */
public class ComparadorResultado extends ComparadorPiloto {
    /**
     * Comparador de Pilotos en función de la destreza.
     * En caso de empate, comparará por el total de puntos del piloto.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */


    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1. getCarrerasTerminadas() == p2.getCarrerasTerminadas())
            return Collections.reverseOrder(new ComparadorNombrePiloto()).compare(p1, p2);
        else if (p1.getCarrerasTerminadas() > p2.getCarrerasTerminadas())
            return 1;
        else
            return -1;
    }
}
