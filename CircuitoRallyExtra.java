
/**
 * CircuitoRallyExtra 
 * Clase padre del patron decorator
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public abstract class CircuitoRallyExtra extends CircuitoRally
{
    protected CircuitoRally decoratedCircuitoRally; //circuito para el decorator

    /**
     * Constructor parametrizado de la clase CircuitoRallyExtra.
     *
     * @param circuitorally -un circuito.
     */
    public CircuitoRallyExtra (Circuito circuitorally)
    {
        super (circuitorally.getNombreCircuito(),circuitorally.getComplejidad (),circuitorally.getDistancia ());
        decoratedCircuitoRally= (CircuitoRally) circuitorally;
    }
     
     
    
    /**
     * devuelve el valor de la complejidad.
     * @return  el valor de la complejidad de decoratedCircuitoRally.
     */
    @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ();
    }      
     
    /**
     * devuelve el valor de la distancia.
     * @return  el valor de la distancia de decoratedCircuitoRally.
     */
    @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia ();
    }      
    
    /**
     * devuelve la informacion de la clase.
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString ()  
    {
        // put your code here
        return decoratedCircuitoRally.toString()+
        " + extra: " + getClass().getSimpleName() +
        " -> nueva complejidad: " + getValorComplejidad() + 
        " "+ getValorDistancia ();
    }
    
    
    
}
