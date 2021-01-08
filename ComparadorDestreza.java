import java.util.Comparator;
/**
 * Write a description of class ComparadorDestreza here.
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class ComparadorDestreza extends ComparadorPiloto
{
     public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getDestreza()==p2.getDestreza())
            return new ComparadorTotalPuntos().compare(p1, p2);
        else if(p1.getDestreza()>p2.getDestreza())
            return 1;
        else
            return -1;
    }    
}
