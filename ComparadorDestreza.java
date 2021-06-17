/**
 * Comparador de Pilotos que permite la ordenación según la destreza del mismo.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 0.1
 */
public class ComparadorDestreza extends ComparadorPiloto {
    /**
     * Comparador de Pilotos en función de la destreza.
     * En caso de empate, comparará por el total de puntos del piloto.
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1.getDestreza() == p2.getDestreza())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if (p1.getDestreza() > p2.getDestreza())
            return 1;
        else
            return -1;
    }
}
