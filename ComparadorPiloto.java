import java.util.Comparator;
/**
 * Write a description of class ComparadorPiloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ComparadorPiloto implements Comparator<PilotoInterfaz>
{
      public abstract int compare(PilotoInterfaz p1, PilotoInterfaz p2);
}
