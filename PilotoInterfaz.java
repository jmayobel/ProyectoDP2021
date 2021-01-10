/**
 * PilotoInterfaz declara los métodos que se usarán en la clase PilotoAbstracto 
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.3
 */

public interface PilotoInterfaz{
    public String getNombre();
    public Coche getCoche();
    public Concentracion getConcentracion();
    public double getTiempoConcentracion();
    public boolean getDescalificado();
    public int getAbandonos();
    public abstract double getDestreza();
    public void setCoche(Coche coche);
    public void descalificar();
    public void abandonar();
    public void añadirResultados(Circuito circuito, double tiempo, int puntos);
    public double buscarResultado(Circuito buscado);
    public int getTamañoResultados();
    public int getPuntosTotales();
    public void mostrarResultados();
    public void eliminarResultado(Circuito buscado);
    public void limpiarResultados();
    public void correrCarrera(Circuito circuito);
    public String toString();
    public int hashCode();
}
