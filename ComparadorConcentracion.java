/**
 * Comparador de Pilotos que permite la ordenación según la concentración del mismo.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 0.1
 */
public class ComparadorConcentracion extends ComparadorPiloto {
    /**
     * Comparador de Pilotos en función de la concentración.
     * En caso de empate, comparará por la destreza del piloto.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1.getTiempoConcentracion() == p2.getTiempoConcentracion())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if (p1.getTiempoConcentracion() > p2.getTiempoConcentracion())
            return 1;
        else
            return -1;
    }
}
