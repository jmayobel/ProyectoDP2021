/**
 * Clase comparadora que compara el tiempo obtenido en el último circuito por dos pilotos distintos.
 *
 * @author Miguel Medina Cantos, Juan Manuel Mayo, Cesar Vazquez
 * @version (1.0)
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
        if (p1.getTiempoUltimoCircuito() == p2.getTiempoUltimoCircuito())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if (p1.getTiempoUltimoCircuito() > p2.getTiempoUltimoCircuito())
            return 1;
        else
            return -1;
    }
}