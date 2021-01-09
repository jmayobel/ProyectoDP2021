/**
 * La clase PilotoEstrella calcula la destreza del piloto. 
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.1
 */
public class PilotoEstrella extends PilotoAbstracto
{    
    //Variables de la clase PilototEstrella:
    private double destreza;  

    /**
     * Constructor parametrizado de la clase PilotoEstrella.
     * 
     * @param nombre Nombre de pila del piloto
     * @param concentracion Concentración del piloto
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
