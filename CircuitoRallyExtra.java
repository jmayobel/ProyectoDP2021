
/**
 * CircuitoRallyExtra 
 * Clase padre del patron decorator
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public abstract class CircuitoRallyExtra extends CircuitoRally
{
    protected CircuitoRally decoratedCircuitoRally;

    /**
     * 
     *
     * @param circuitorally -un circuito
     * @return  devuelve decoratedCircuitoRally
     */
    public CircuitoRallyExtra (CircuitoRally circuitorally)
    {
        super (circuitorally.getNombreCircuito(),circuitorally.getComplejidad (),circuitorally.getDistancia ());
        decoratedCircuitoRally=circuitorally;
    }
     
     
    
    /**
     * 
     * @return devuelve el valor de la complejidad de decoratedCircuitoRally
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ();
    }      
     
    /**
     * @return  devuelve el valor de la complejidad de decoratedCircuitoRally
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ();
    }      
    
    /**
     * @return devuelve un string con la informacion de la clase.
     */
    @Override
    public String toString ()  
    {
        // put your code here
        return decoratedCircuitoRally.toString()+
        "\n + extra:" + getClass().getSimpleName() +
        " -> nueva complejidad: " + getValorComplejidad() + 
        "\n"+ getValorDistancia ();
        
    }
    
    
    
}
