/**
 * PilotoInterfaz declara los métodos que se usarán en la clase PilotoAbstracto 
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.2
 */

public interface PilotoInterfaz{
    public String getNombre();
    public void mostrarResultadosCarrera(Circuito circuito);
    public CocheInterfaz getCoche();
    public Concentracion getConcentracion();
    public double getTiempoConcentracion();
    public boolean getDescalificado();
    public int getAbandonos();
    public abstract double getDestreza();
    public void setCoche(CocheInterfaz coche);
    public void descalificar();
    public void abandonar();
    public void añadirTiempo(Circuito circuito, double tiempo);
    public void añadirPuntos(Circuito circuito, int puntos);
    public double buscarResultado(Circuito buscado);
    public int getTamañoResultados();
    public int getPuntosTotales();
    public int getTiempoTotal();
  //  public String mostrarResultados();
    public void eliminarResultado(Circuito buscado);
    public void limpiarResultados();
    public void correrCarrera(Circuito circuito);
    public String toString();
    public int hashCode();
}