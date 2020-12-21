
/**
 * Write a description of class Gravilla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gravilla extends CircuitoRallyExtra
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Gravilla
     */
    public Gravilla (CircuitoRally circuitorally)
    {
        // initialise instance variables
        super (circuitorally);
    }

     @Override
    public double getValorComplejidad ()  {
     return decoratedCircuitoRally.getValorComplejidad ()+decoratedCircuitoRally.getValorComplejidad ()*1.05;
    } 
       @Override
    public double getValorDistancia ()  {
     return decoratedCircuitoRally.getValorDistancia () - decoratedCircuitoRally.getValorComplejidad ()*0.95;
    }     
}
