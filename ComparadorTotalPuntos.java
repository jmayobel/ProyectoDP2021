/**
 * Comparador de Pilotos que permite la ordenación según el total de puntos del mismo.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 1.0
 */
public class ComparadorTotalPuntos extends ComparadorPiloto {
    /**
     * Comparador de Pilotos en función del total de puntos.
     * En caso de empate, comparará por destreza.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1.getPuntosTotales() == p2.getPuntosTotales())
            return new ComparadorDestreza().compare(p1, p2);
        else if (p1.getPuntosTotales() > p2.getPuntosTotales())
            return 1;
        else
            return -1;
    }
}
