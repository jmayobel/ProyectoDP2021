/**
 * PilotoInterfaz declara los métodos que se usarán en la clase PilotoAbstracto
 *
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.2
 */

public interface PilotoInterfaz {
    public String getNombre();

    public CocheInterfaz getCoche();

    public void setCoche(CocheInterfaz coche);

    public Concentracion getConcentracion();

    public double getTiempoConcentracion();

    public boolean getDescalificado();

    public int getAbandonos();

    public abstract double getDestreza();

    public void descalificar();

    public void abandonar();

    public void añadirTiempo(Circuito circuito, double tiempo);

    public void añadirPuntos(Circuito circuito, int puntos);

    public double buscarResultado(Circuito buscado);

    public int getTamañoResultados();

    public int getCarrerasTerminadas();

    public int getPuntosTotales();

    public boolean equals(Object obj);

    public double getTiempoUltimoCircuito();

    public void mostrarResultados();

    public void conducirCoche(Circuito circuito);

    public String toString();

    public int hashCode();
}