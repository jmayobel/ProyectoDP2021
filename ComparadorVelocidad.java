import java.util.Comparator;
/**
 * Write a description of class ComparadorVelocidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorVelocidad implements Comparator<CocheInterfaz>
{
    public int compare(CocheInterfaz c1, CocheInterfaz c2){
        if(c1.getValorVelocidad()==c2.getValorVelocidad())
            return 0;
        else if(c1.getValorVelocidad()>c2.getValorVelocidad())
            return 1;
        else
            return -1;
    } 
        
    }
