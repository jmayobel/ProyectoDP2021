import java.util.Comparator;

/**
 * Write a description of class ComparadorConcentracion here.
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class ComparadorConcentracion extends ComparadorPiloto
{
  public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getTiempoConcentracion()==p2.getTiempoConcentracion())
            return new ComparadorDestreza().compare(p1, p2);
        else if(p1.getTiempoConcentracion()>p2.getTiempoConcentracion())
            return 1;
        else
            return -1;
    }
}
