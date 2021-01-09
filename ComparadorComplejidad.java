
/**
 * Write a description of class ComparadorComplejidad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComparadorComplejidad extends ComparadorCircuitoSet
{
  public int compare(Circuito c1, Circuito c2){
        if(c1.getValorComplejidad()==c2.getValorComplejidad())
            return new ComparadorDistancia().compare(c1, c2);
        else if(c1.getValorComplejidad()>c2.getValorComplejidad())
            return 1;
        else
            return -1;
    }    
}
