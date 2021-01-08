
/**
 * Write a description of class Organizacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Organizacion
{
    // instance variables - replace the example below with your own
    private static Organizacion instance;

    /**
     * Constructor for objects of class Organizacion
     */
    private  Organizacion()
    {
        // initialise instance variables
    }


    
    
    
    public synchronized static
    Organizacion getInstance () 
    {
        if (instance==null) {
           instance= new Organizacion();
           
        } 
       return instance;
    }
}
