
/**
 * Write a description of class PilotoNovato here.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class PilotoNovato extends PilotoAbstracto
{    
    private double destreza; 

    /**
     * Constructor for objects of class PilotoNovato
     */
    public PilotoNovato(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    @Override
    public double getDestreza(){
        return (((getTiempoConcentracion() * 0.97) / 120) - 0.03);
    }   
}
