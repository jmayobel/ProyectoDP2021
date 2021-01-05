import java.util.*;

/**
 * Write a description of class ComparadorNombre here.
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class ComparadorNombre implements Comparator<PilotoInterfaz>
{ 
    public int compare (PilotoInterfaz p1,PilotoInterfaz p2){
       return p1.getNombre().compareTo(p2.getNombre()); 

    } 

}
