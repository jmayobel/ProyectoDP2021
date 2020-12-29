
/**
 * Write a description of class PilotoEstrella here.
 * 
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.0
 */
public class PilotoEstrella extends PilotoAbstracto
{    
    private double destreza;  

    /**
     * Constructor for objects of class PilotoEstrella
     */
    public PilotoEstrella(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    @Override
    public double getDestreza(){
        return Math.round((((getTiempoConcentracion() + 6) / 140) * 1.06) + 0.05);
    }   
}
