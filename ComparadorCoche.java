import java.util.Comparator;
/**
 * Write a description of class ComparadorCoche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ComparadorCoche implements Comparator<CocheInterfaz>
{
      public abstract int compare(CocheInterfaz c1, CocheInterfaz c2);
}
