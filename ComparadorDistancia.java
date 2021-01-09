
/**
 * Comparador de distancia de circuitos.
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class ComparadorDistancia extends ComparadorCircuitoSet
{
   public int compare(Circuito c1, Circuito c2){
        if(c1.getValorDistancia()==c2.getValorDistancia())
            return (c1.getNombreCircuito().compareTo(c2.getNombreCircuito()));
        else if(c1.getValorDistancia()>c2.getValorDistancia())
            return 1;
        else
            return -1;
    }    
}
