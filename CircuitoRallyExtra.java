
/**
 * Abstract class CircuitoRallyExtra - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class CircuitoRallyExtra extends CircuitoRally
{
    // instance variables - replace the example below with your own
    protected CircuitoRally decoratedCircuitoRally;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  a circuit
     * @return the new decorated circuit 
     */
    public CircuitoRallyExtra (CircuitoRally circuitorally)
    {
        super (circuitorally.getNombreCircuito(),circuitorally.getComplejidad (),circuitorally.getDistancia ());
        decoratedCircuitoRally=circuitorally;
    }
     
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ();
    }      
     
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ();
    }      
    
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
