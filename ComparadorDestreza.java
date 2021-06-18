/**
 * Comparador de Pilotos que permite la ordenacion segun la destreza del mismo
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorDestreza extends ComparadorPiloto {

    /**
     * Comparador de Pilotos en funcion de la destreza.
     * En caso de empate, comparara por el total de puntos del piloto
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
