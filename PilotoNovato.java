/**
<<<<<<< HEAD
 * La clase PilotoNovato calcula la destreza del piloto. 
=======
 * La clase PilotoNovato calcula la destreza del piloto.
>>>>>>> 6026d10d39905b494dc4805ab62cc7d1bfe67ccb
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.1
 */
public class PilotoNovato extends PilotoAbstracto
{    
    //Variables de la clase PilotoNovato:
    private double destreza; 

    /**
     * Constructor parametrizado de la clase PilotoNovato.
     * 
     * @param nombre Nombre de pila del piloto
     * @param concentracion Concentración del piloto
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
