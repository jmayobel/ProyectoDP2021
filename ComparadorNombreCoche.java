import java.util.*;
/**
 * comparador del nombre del coche.
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class ComparadorNombreCoche implements Comparator<CocheInterfaz>
{
    
    public int compare (CocheInterfaz c1,CocheInterfaz c2){
        
       return c1.getNombreCoche().compareTo(c2.getNombreCoche()); 

    } 
    
    
    
    
    
    

    
}
