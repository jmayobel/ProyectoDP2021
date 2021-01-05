
import java.util.Comparator;
/**
 * Write a description of class TotalPuntosComparator here.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class TotalPuntosComparador implements Comparator<PilotoInterfaz>
{
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getPuntosTotales()==p2.getPuntosTotales())
            return 0;
        else if(p1.getPuntosTotales()>p2.getPuntosTotales())
            return 1;
        else
            return -1;
    }
}
