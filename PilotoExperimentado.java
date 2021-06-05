/**
 * La clase PilotoExperimentado calcula la destreza del piloto. 
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.1
 */
public class PilotoExperimentado extends PilotoAbstracto
{    
    //Variables de la clase PilotoExperimentado:
    private double destreza;
    
    /**
     * Constructor parametrizado de la clase PilotoExperimentado.
     * 
     * @param nombre Nombre de pila del piloto
     * @param concentracion Concentración del piloto
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
