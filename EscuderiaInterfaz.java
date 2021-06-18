import java.util.ArrayList;
import java.util.Comparator;

/**
 * EscuderiaInterfaz declara los metodos que se usaran en la clase EscuderiaRally.
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public interface EscuderiaInterfaz {
    public String getNombre();

    public PilotoInterfaz getPilotosCarrera(int pos);

    public ArrayList getListaPilotos();

    public ArrayList getListaCoches();

    public int getCarrerasTerminadasEsc();

    public Comparator<PilotoInterfaz> getComparadorPilotos();

    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador);

    public Comparator<CocheInterfaz> getComparadorCoches();

    public void setComparadorCoches(Comparator<CocheInterfaz> comparador);

    public void addListaPilotos(PilotoInterfaz piloto);

    public void addListaCoches(CocheInterfaz coche);

    public void MostrarCoches();

    public void MostrarPilotos();

    public boolean EscuderiaDescalificada();

    public int getPuntosTotalesEscuderia();

    public void AsignarCoche(int nPilotos);

    public int hashCode();

    public void OrdenarListaPilotos();

    public void OrdenarListaCoches ();

    public boolean equals(Object obj);
}
