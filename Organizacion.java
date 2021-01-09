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
    private ArrayList <PilotoInterfaz> ListaPilotos;

    /**
     * Constructor for objects of class Organizacion
     */
    private  Organizacion()
    {
        nAbandonos=2;
        nPilotos=20;
        CircuitoSet= new TreeSet <Circuito> ();
        EscuderiaSet=new TreeSet <EscuderiaInterfaz> (); 
        ListaPilotos=new ArrayList <PilotoInterfaz> ();
    }

    public synchronized void setEsuderia (EscuderiaInterfaz nuevaEscuderia) {
        
             
        EscuderiaSet.add(nuevaEscuderia);
        
    }    
    
    public synchronized void deleteEscuderia (EscuderiaInterfaz escuderia) {
        
             
        EscuderiaSet.remove(escuderia);
        
    }    
       public synchronized void setCircuito (Circuito nuevoCircuito) {
        
             
        CircuitoSet.add(nuevoCircuito);
        
    }    
    public synchronized void deleteCircuito (Circuito circuito) {
        
         CircuitoSet.remove(circuito);
        
    }  
    public synchronized Circuito buscarCircuito (Circuito circuito) {
       Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator
       boolean enc = false;
       Circuito buscar = it.next();

        while(it.hasNext() && !enc){
            if(buscar.equals(circuito)){
                enc = true;
                return buscar; 
            }     
        }
        
        
     
        
      return null;
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
