import java.util.Comparator;
/**
 * Comparador de Pilotos que permite la ordenación según el total de puntos del mismo. 
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.1
 */
public class ComparadorTotalPuntos extends ComparadorPiloto
{
    /**
     * Comparador de Pilotos en función del total de puntos.
     * En caso de empate, comparará por el nombre del piloto.
     * 
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getPuntosTotales()==p2.getPuntosTotales())
            return new ComparadorDestreza().compare(p1, p2);
        else if(p1.getPuntosTotales()>p2.getPuntosTotales())
            return 1;
        else
            return -1;
    }
}
