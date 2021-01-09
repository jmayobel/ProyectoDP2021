
/**
 * Write a description of class ComparadorDestraza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComparadorDistancia extends ComparadorCircuitoSet
{
    // instance variables - replace the example below with your own

   public int compare(Circuito c1, Circuito c2){
        if(c1.getValorDistancia()==c2.getValorDistancia())
            return (c1.getNombreCircuito().compareTo(c2.getNombreCircuito()));
        else if(c1.getValorDistancia()>c2.getValorDistancia())
            return 1;
        else
            return -1;
    }    
}
