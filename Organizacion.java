import java.util.*;
/**
 * Write a description of class Organizacion here.
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class Organizacion
{
    // instance variables - replace the example below with your own
    private static Organizacion instance;
    private final int nAbandonos;
    private final int nPilotos;
    private TreeSet <Circuito> CircuitoSet;
    private TreeSet <EscuderiaInterfaz> EscuderiaSet;
    private HashMap <PilotoInterfaz,EscuderiaInterfaz> PilotosCarrera;   

    /**
     * Constructor for objects of class Organizacion
     */
    private  Organizacion()
    {
        nAbandonos=2;
        nPilotos=20;
        CircuitoSet= new TreeSet <Circuito> ();
        EscuderiaSet=new TreeSet <EscuderiaInterfaz> (); 
        PilotosCarrera = new HashMap <PilotoInterfaz, EscuderiaInterfaz> ();
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
