
/**
 * PilotoInterfaz declara los métodos que se usarán en la clase PilotoAbstracto 
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */

public interface PilotoInterfaz{
    public String getNombre();
    public Concentracion getConcentracion();
    public double getTiempoConcentracion();
    public boolean getDescalificado();
    public abstract double getDestreza();
    public void setCoche(Coche coche);
    public void descalificar();    
}
