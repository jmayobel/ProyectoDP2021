
/**
 * CircuitoRallyExtra 
 * Clase padre del patron decorator
 *
 * @author (Miguel)
 * @version (1.0)
 */
public abstract class CircuitoRallyExtra extends CircuitoRally
{
    protected CircuitoRally decoratedCircuitoRally;

    /**
     * 
     *
     * @param  un circuito
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
    
     @Override
    public String toString ()  
    {
        return decoratedCircuitoRally.toString() + "\n" +
         "extra:" + getClass().getSimpleName() + "\n" +
        " -> nueva complejidad: " + "\n" + getValorComplejidad() + 
        "\n"+ getValorDistancia ();
        
    }
    
    
    
}
