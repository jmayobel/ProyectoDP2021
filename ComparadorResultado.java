
/**
 * Write a description of class ComparadorResultado here.
 * 
 * @author Miguel Medina Cantos y Juan Manuel Mayo
 * @version (a version number or a date)
 */
public class ComparadorResultado extends ComparadorPiloto
{
    /**
     * Comparador de Pilotos en función de la destreza.
     * En caso de empate, comparará por el total de puntos del piloto.
     * 
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2){
        if(p1.getTamañoResultados()==p2.getTamañoResultados())
            return (p1.getNombre().compareTo(p2.getNombre()));
        else if(p1.getTamañoResultados()>p2.getTamañoResultados())
            return 1;
        else
            return -1;
    }       
}
