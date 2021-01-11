import java.util.*;
/**
 * La clase Organizacion se encargará 
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
    private  Organizacion(int nAbandonos, int nPilotos, TreeSet<Circuito> circuito)
    {
        this.nAbandonos=nAbandonos;
        this.nPilotos=nPilotos;
        CircuitoSet = circuito;
        ListadeEscuderias= new ArrayList <EscuderiaInterfaz> () ; 
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
    
          
    /**
     *  Método del patrón Singleton que permite devolver una instancia del objeto creado.
     *  Si no hay ninguna instancia, se crea.
     *  
     *  @param lAbandonos Límite de abandonos que puede tener un piloto antes de ser eliminado del campeonato
     *  @param lPilotos Límite de pilotos por Escudería que pueden ser enviados a una carrera
     *  @param circuito Lista de circuitos en los que se correrá durante el campeonato
     */
    public synchronized static
    Organizacion getInstance (int lAbandonos, int lPilotos, TreeSet<Circuito> circuito) 
    {
        if (instance==null) {
            instance = new Organizacion(lAbandonos, lPilotos, circuito);
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
    
    /**
     *  Inserta los pilotos listos para correr en la lista de pilotosCarrera
     */
    public synchronized void GuardarPilotos(){
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();
        while(it.hasNext()){
            EscuderiaInterfaz Esc = it.next();
            Esc.AsignarCoche();
   
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

    /**
     * Ordena la parrilla de salida (pilotosCarrera) por la cantidad de puntos de los pilotos
     */
    public synchronized void OrdenarParrilla(){
        Collections.sort(PilotosCarrera,new ComparadorTotalPuntos()); 
    }

    /**
     * Realiza las carreras para cada circuito del campeonato
     */
    public synchronized void campeonato(){
       Iterator<Circuito> it = this.CircuitoSet.iterator();
       System.out.println("FINALIZADO MOSTRAR CIRCUITOS");
       MostrarEscuderias();
       System.out.println("FINALIZADO MOSTRAR ESCUDERÍAS");
       
       while(it.hasNext()){
           Circuito circuito = it.next();
           Carrera(circuito);
           Podio(circuito);
       }    
    }
    
     /**
     * Realiza la carrera en un circuito dado para todos los pilotos que corren en él.
     */
    public synchronized void Carrera(Circuito circuito){
       GuardarPilotos(); //Guarda en pilotoCarreras los coches para correr
       OrdenarParrilla(); //Ordena los pilotos
       Iterator<PilotoInterfaz> it = this.PilotosCarrera.iterator();
       while (it.hasNext()) {
          PilotoInterfaz piloto= it.next();
          System.out.println(piloto.toString()); //Muestra el piloto que correra
          CocheInterfaz coche=piloto.getCoche();
          coche.toString(); //Muestra el coche que correra
          double velocidad=coche.getVelocidadReal(piloto,circuito);
          System.out.println("VELOCIDAD REAL: " + velocidad); 
          piloto.correrCarrera(circuito);
          if(piloto.buscarResultado(circuito) > 0)   //Si el tiempo obtenido es positivo, ha acabado la carrera,
                                                     //si no lo es, no la ha acabado
          {
             piloto.buscarResultado(circuito);  
          }    
          else{
            if(piloto.getTiempoConcentracion() < coche.getTiempo(piloto, circuito)){
                System.out.println("MOTIVO DE ABANDONO: Pérdida de concentración."); 
            }
            if(coche.getCombustibleUsado(piloto, circuito) < coche.getTiempo(piloto, circuito)){
                System.out.println("MOTIVO DE ABANDONO: Falta de combustible."); 
            }
            System.out.println(Math.abs(piloto.buscarResultado(circuito)));                 
            System.out.println(coche.getTiempo(piloto, circuito) - piloto.buscarResultado(circuito));
            if(piloto.getAbandonos() >= this.nAbandonos){
                piloto.descalificar();
            }
            System.out.println(coche.getValorcombustible());
          }
       }
      }

     /**
     * Ordena la lista de pilotos de PilotosCarrera por tiempo y le asigna los puntos correspondientes a sus posición
     */
    public synchronized void Podio (Circuito circuito){
        int podio = 0;
        //Collections.sort(...,...)
        Iterator <PilotoInterfaz> it = this.PilotosCarrera.iterator();
        while(it.hasNext()){
            PilotoInterfaz piloto = it.next();
            if(piloto.buscarResultado(circuito) > 0){
                if(podio < 4){
                    piloto.añadirPuntos(circuito,10-podio*2);
                    podio++;
                }
                else{
                    piloto.añadirPuntos(circuito, 2);
                }
            }
        }
    }
}
