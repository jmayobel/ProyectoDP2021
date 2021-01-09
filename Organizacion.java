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
    private ArrayList <EscuderiaInterfaz> ListadeEscuderias;
    private HashMap <PilotoInterfaz,EscuderiaInterfaz> PilotosCarrera;   

    /**
     * Constructor for objects of class Organizacion
     */
    private  Organizacion()
    {
        nAbandonos=2;
        nPilotos=20;
        CircuitoSet= new TreeSet <Circuito> (new ComparadorComplejidad ());
        ListadeEscuderias=new ArrayList <EscuderiaInterfaz> () ; 
        PilotosCarrera = new HashMap <PilotoInterfaz, EscuderiaInterfaz> ();
    }

    public synchronized void setEscuderia (EscuderiaInterfaz nuevaEscuderia) {

        ListadeEscuderias.add(nuevaEscuderia);
    }    
    public synchronized void deleteEscuderia (EscuderiaInterfaz escuderia) {
             
        ListadeEscuderias.remove(escuderia);

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
        Circuito aux=null;

        while(it.hasNext() && !enc){
            Circuito buscar = it.next();

            if(buscar.equals(circuito)){
                enc = true;
                aux=buscar;
            }     
        }

        return aux;
    }    

    public synchronized EscuderiaInterfaz buscarEscuderia (EscuderiaInterfaz escuderia) {
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        EscuderiaInterfaz aux=null;
        while(it.hasNext() && !enc){
            EscuderiaInterfaz buscar = it.next();
            if(buscar.equals(escuderia)){
                enc = true;
                aux=buscar;
            }     
        }

        return aux; 
    }    

    public synchronized void DejarVacioTreeSetCircuitos () {
        Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator
        

        while(it.hasNext()){
            Circuito buscar = it.next();
            it.remove();
        
        }        
        
        
        
    }    
        public synchronized void DejarVacioListadeEscuderias() {
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            EscuderiaInterfaz buscar = it.next();
            it.remove();
        }

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
