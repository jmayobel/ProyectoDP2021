
/**
 * Write a description of class ComparadorNombrePiloto here.
 * 
 * @author Miguel Medina Cantos
 * @version (a version number or a date)
 */
public class ComparadorNombrePiloto extends ComparadorPiloto
{
    public int compare (PilotoInterfaz p1,PilotoInterfaz p2) {
        
        return (p1.getNombre().compareTo(p2.getNombre()));
        
    }      
}
