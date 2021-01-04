/**
 * PilotoInterfaz declara los métodos que se usarán en la clase PilotoAbstracto 
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.1
 */

public interface PilotoInterfaz{
    public String getNombre();
    public Concentracion getConcentracion();
    public double getTiempoConcentracion();
    public boolean getDescalificado();
    public abstract double getDestreza();
    public void setCoche(Coche coche);
    public void descalificar();
    public void añadirInfoRegistro(Circuito circuito, double tiempo, int puntos);
    public int getTamañoRegistro();
    public int getPuntosTotales();
    public void mostrarRegistro();
    public void eliminarInfoRegistro(Circuito buscado);
    public String toString();
}
