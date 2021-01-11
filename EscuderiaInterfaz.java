import java.util.*;
/**
 * EscuderiaInterfaz declara los métodos que se usarán en la clase EscuderiaRally.
 *
 * @author CÉSAR VÁZQUEZ Y MIGUEL MEDINA
 * @version 0.2
 */
public interface EscuderiaInterfaz{
    public String getNombre ();
    public ArrayList getPilotosCarrera();
    public ArrayList getListaPilotos ();
    public ArrayList getListaCoches ();
    public Comparator<PilotoInterfaz> getComparadorPilotos();       
    public Comparator<CocheInterfaz> getComparadorCoches();       
    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador);
    public void setComparadorCoches(Comparator<CocheInterfaz> comparador);
    public void addPilotosCarrera(PilotoInterfaz piloto);
    public void addListaPilotos (PilotoInterfaz piloto);
    public void addListaCoches (CocheInterfaz coche);
    public void eliminarPilotosCarrera(PilotoInterfaz buscado);
    public void eliminarPiloto(PilotoInterfaz buscado);
    public void eliminarCoche(CocheInterfaz buscado);
    public void limpiarPilotosCarrera();
    public void limpiarListaPilotos();
    public void limpiarListaCoches();
    public int getPuntosTotalesEscuderia();
    public void AsignarCoche();
    public int hashCode();    
}
