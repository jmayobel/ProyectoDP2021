import java.util.ArrayList;
import java.util.Comparator;

/**
 * EscuderiaInterfaz declara los métodos que se usarán en la clase EscuderiaRally.
 *
 * @author CÉSAR VÁZQUEZ Y MIGUEL MEDINA
 * @version 0.2
 */
public interface EscuderiaInterfaz {
    public String getNombre();

    public PilotoInterfaz getPilotosCarrera(int pos);

    public ArrayList getListaPilotos();

    public ArrayList getListaCoches();

    public Comparator<PilotoInterfaz> getComparadorPilotos();

    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador);

    public Comparator<CocheInterfaz> getComparadorCoches();

    public void setComparadorCoches(Comparator<CocheInterfaz> comparador);

    public void addListaPilotos(PilotoInterfaz piloto);

    public void addListaCoches(CocheInterfaz coche);

    public void eliminarPiloto(PilotoInterfaz buscado);

    public void eliminarCoche(CocheInterfaz buscado);

    public void limpiarPilotosCarrera();

    public void limpiarListaCoches();

    public void MostrarCoches();

    public void MostrarPilotos();

    public boolean EscuderiaDescalificada();

    public int getPuntosTotalesEscuderia();

    public void AsignarCoche(int nPilotos);

    public int hashCode();

    public void OrdenarListaPilotos();

    public boolean equals(Object obj);

    public int TamanoListaPilotos();
}
