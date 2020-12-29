
/**
 * Write a description of class PilotoExperimentado here.
 * 
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.0
 */
public class PilotoExperimentado extends PilotoAbstracto
{    
    private double destreza; 
    /**
     * Constructor for objects of class PilotoExperimentado
     */
    public PilotoExperimentado(String nombre, Concentracion concentracion)
    {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    @Override
    public double getDestreza(){
        return Math.round(((getTiempoConcentracion() + 3) / 130) * 1.03);
    }   
}
