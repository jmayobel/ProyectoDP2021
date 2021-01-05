import java.util.Comparator;

/**
 * Write a description of class ComparadorConcentracion here.
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class ComparadorConcentracion implements Comparator<PilotoInterfaz>
{
    // instance variables - replace the example below with your own
  public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getTiempoConcentracion()==p2.getTiempoConcentracion())
            return 0;
        else if(p1.getTiempoConcentracion()>p2.getTiempoConcentracion())
            return 1;
        else
            return -1;
    }
}
