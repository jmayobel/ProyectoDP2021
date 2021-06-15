/**
 * Write a description of class ComparadorTiempo here.
 *
 * @author Miguel Medina Cantos, Juan Manuel Mayo, Cesar Vazquez
 * @version (a version number or a date)
 */
public class ComparadorTiempo extends ComparadorPiloto {
    /**
     * Comparador de Pilotos en función del tiempo.
     * En caso de empate, comparará por el nombre del piloto.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1.getTiempoTotal() == p2.getTiempoTotal())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if (p1.getTiempoTotal() > p2.getTiempoTotal())
            return 1;
        else
            return -1;
    }
}