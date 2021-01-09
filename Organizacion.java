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
    private HashMap <PilotoInterfaz, EscuderiaInterfaz> pilotosCarrera;

    /**
     * Constructor for objects of class Organizacion
     */
    private Organizacion()
    {
        nAbandonos = 2;
        nPilotos = 20;
        CircuitoSet = new TreeSet <Circuito>();
        EscuderiaSet = new TreeSet <EscuderiaInterfaz>(); 
        pilotosCarrera = new HashMap<PilotoInterfaz, EscuderiaInterfaz>();
    }
   
    //Patrón Singleton
    public synchronized static
    Organizacion getInstance() 
    {
        if (instance==null) {
           instance= new Organizacion();           
        } 
        return instance;
    }
    
    //Métodos HashMap
    public void añadirPilotoCarrera(PilotoInterfaz piloto, EscuderiaInterfaz escuderia){
        this.pilotosCarrera.put(piloto, escuderia);
    }
    
    //Este método elimina el piloto y lo mete en su respectiva escuderia
    public void eliminarPilotoCarrera(PilotoInterfaz piloto){
        Iterator<PilotoInterfaz> it = this.pilotosCarrera.keySet().iterator();
        boolean enc = false;
        while (it.hasNext() && !enc){
            PilotoInterfaz key = it.next();
            EscuderiaInterfaz valor = pilotosCarrera.get(key);
            if(key.equals(piloto)){
                enc = true;
                valor.addListaPilotos(key);             //Añade el piloto a ListaPilotos de su escudería
                valor.addListaCoches(key.getCoche());   //Añade el coche a ListaCoches de su escudería
                this.pilotosCarrera.remove(key);
            }
        }
    }
    
    public void limpiarPilotoCarrera(){
        Iterator<PilotoInterfaz> it = this.pilotosCarrera.keySet().iterator();
        while (it.hasNext()){
            PilotoInterfaz key = it.next();
            eliminarPilotoCarrera(key);
        }
    }
    
    
}