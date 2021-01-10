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
    private ArrayList <PilotoInterfaz> PilotosCarrera;   

    /**
     * Constructor parametrizado de Organizacion
     */
    private  Organizacion()
    {
        nAbandonos=2;
        nPilotos=20;
        CircuitoSet= new TreeSet <Circuito> (new ComparadorComplejidad ());
        ListadeEscuderias=new ArrayList <EscuderiaInterfaz> () ; 
        PilotosCarrera = new ArrayList <PilotoInterfaz> ();
    }

    /**
     * inserta una nueva escuderia en la lista de escuderias.
     * 
     * @param nuevaEscuderia -escuderia a insertar en la lista.
     * 
     */
    public synchronized void setEscuderia (EscuderiaInterfaz nuevaEscuderia) {

        ListadeEscuderias.add(nuevaEscuderia);
    }    

    /**
     * borra una escuderia de la lista.
     * @param escuderia - escuderia a borra en la lista.
     */
    public synchronized void deleteEscuderia (EscuderiaInterfaz escuderia) {

        ListadeEscuderias.remove(escuderia);

    }    

    /**
     * inserta un nuevo circuito en el set.
     * @param nuevoCircuito el nuevo circuito a insertar.
     */
    public synchronized void setCircuito (Circuito nuevoCircuito) {

        CircuitoSet.add(nuevoCircuito);
    }    

    /**
     * borra un circuito del set.
     * @param circuito -circuito a borrar.
     */
    public synchronized void deleteCircuito (Circuito circuito) {
        CircuitoSet.remove(circuito);
    }  

    /**
     * busca un circuito en CircuitoSet.
     * @param circuito- circuito a buscar en CircuitoSet.
     * @return el circuito buscada.
     */public synchronized Circuito buscarCircuito (Circuito circuito) {
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

    /**
     * busca una escuderia en la lista de escuderias.
     * @param escuderia- escuderia a buscar en la lista.
     * @return la escuderia buscada.
     */
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

    /**
    *  deja vacio CircuitoSet.
    */
    public synchronized void DejarVacioTreeSetCircuitos () {
        Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator

        while(it.hasNext()){
            Circuito buscar = it.next();
            it.remove();

        }        

        
    }    

    /**
     *  deja vacia la lista de escuderias.
     */
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

    /**
     * muestra las escuderias de la lista de escuderias.
     */
    public synchronized void MostrarEscuderias(){
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();

        while(it.hasNext()){
            EscuderiaInterfaz buscar = it.next();
            System.out.println (buscar.toString());
        }
    }
    
    public synchronized void GuardarPilotos(){
     Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();
     while(it.hasNext()){
         EscuderiaInterfaz Esc = it.next();
         PilotosCarrera.addAll(Esc.getPilotosCarrera());
        } 
    }
   
    /**
     * muestra los circuitos del TreeSet de circuitos.
     */
    public synchronized void MostrarCircuitos(){
        Iterator<Circuito> it = this.CircuitoSet.iterator();
        while(it.hasNext()){
            Circuito buscar = it.next();
            System.out.println (buscar.toString());
        }

    }
    
    public synchronized void OrdenarParrilla(){
       Collections.sort(PilotosCarrera,new ComparadorTotalPuntos()); 
    }
   
    public synchronized void Carrera (Circuito circuito){
        
        
        
    }
}
