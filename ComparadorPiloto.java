import java.util.Comparator;
/**
 * Comparador de Pilotos que permite la ordenación según un orden. 
 * 
 * @author CESAR VAZQUEZ LAZARO  
 * @version 0.1
 */
public abstract class ComparadorPiloto implements Comparator<PilotoInterfaz>{
    /**
    * Comparador de Pilotos en función de la concentración.
    * En caso de empate, comparará por la destreza del piloto,
    * en caso de empate, comparará por el total de puntos del piloto, 
    * y en caso de empate, finalmente comparará por el nombre del piloto.
    *
    * @param p1 Piloto a comparar
    * @param p2 Piloto a ser comparado
    */
   public abstract int compare(PilotoInterfaz p1, PilotoInterfaz p2);
}
