import java.util.*;
/**
 * Write a description of interface Escuderia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface EscuderiaInterfaz
{
    public ArrayList getListaPilotos ();
    public ArrayList getListaCoches ();
    public String getNombre ();
    public void addListaPilotos (PilotoInterfaz piloto);
    public void addListaCoches (CocheInterfaz coche);
    
    
}
