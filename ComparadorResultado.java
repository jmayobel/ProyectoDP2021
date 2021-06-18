import java.util.Collections;

/**
 * Write a description of class ComparadorResultado here.
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorResultado extends ComparadorPiloto {

    /**
     * Comparador de Pilotos en funcion de la destreza.
     * En caso de empate, comparara por el total de puntos del piloto
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
