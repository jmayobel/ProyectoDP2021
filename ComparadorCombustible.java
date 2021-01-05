
import java.util.Comparator;
/**
 * Write a description of class CombustibleComparador here.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class ComparadorCombustible implements Comparator<CocheInterfaz>
{
    public int compare(CocheInterfaz c1, CocheInterfaz c2){
        if(c1.getValorcombustible()==c2.getValorcombustible())
            return 0;
        else if(c1.getValorcombustible()>c2.getValorcombustible())
            return 1;
        else
            return -1;
    }
}

