import java.util.*;
/**
 * Encapsulacion de comparadores
 *
 * @author Miguel Medina Cantos
 * @version (a version number or a date)
 */
public abstract class ComparadorCircuitoSet implements Comparator<Circuito>  
{
    public abstract int compare(Circuito c1, Circuito c2);
    

}