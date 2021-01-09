import java.util.*;
/**
 * EscuderiaInterfaz declara los métodos que se usarán en la clase EscuderiaRally.
 *
 * @author CÉSAR VÁZQUEZ Y MIGUEL MEDINA
 * @version 0.2
 */
public interface EscuderiaInterfaz{
    public ArrayList getListaPilotos ();
    public ArrayList getListaCoches ();
    public String getNombre ();
    public Comparator<PilotoInterfaz> getComparadorPilotos();       
    public Comparator<CocheInterfaz> getComparadorCoches();       
    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador);
    public void setComparadorCoches(Comparator<CocheInterfaz> comparador);
    public void addListaPilotos (PilotoInterfaz piloto);
    public void addListaCoches (CocheInterfaz coche);
    public void eliminarPiloto(PilotoAbstracto buscado);
    public void eliminarCoche(Coche buscado);
    public void eliminarListaPilotos();
    public void eliminarListaCoches();
    public int getPuntosTotalesEscuderia();
    public int hashCode();    
}
