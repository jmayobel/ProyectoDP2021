import java.util.Comparator;
/**
 * Write a description of class ComparadorTotalPuntos here.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class ComparadorTotalPuntos extends ComparadorPiloto
{
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getPuntosTotales()==p2.getPuntosTotales())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if(p1.getPuntosTotales()>p2.getPuntosTotales())
            return 1;
        else
            return -1;
    }
}
