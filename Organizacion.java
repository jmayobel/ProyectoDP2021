import java.util.*;
import java.lang.Math;
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
    private HashMap <PilotoInterfaz,EscuderiaInterfaz> DevolverEscuderiaPilotos;
    private ArrayList <PilotoInterfaz> PilotosDescalificados;


    /**
     * Constructor parametrizado de Organizacion
     */
    private Organizacion(int nAbandonos, int nPilotos, TreeSet<Circuito> circuito)
    {
        this.nAbandonos=nAbandonos;
        this.nPilotos=nPilotos;
        CircuitoSet = circuito;
        ListadeEscuderias= new ArrayList <EscuderiaInterfaz> () ; 
        DevolverEscuderiaPilotos = new HashMap <PilotoInterfaz,EscuderiaInterfaz> (); //lo necesitamos para devolverlos a su escudería.
        this.PilotosCarrera= new ArrayList<PilotoInterfaz>();
        this.PilotosDescalificados = new ArrayList<PilotoInterfaz>();

    }

    /**
     * inserta una nueva escuderia en la lista de escuderias.
     * 
     * @param nuevaEscuderia escuderia a insertar en la lista.
     * 
     */
    public  void setEscuderia (EscuderiaInterfaz nuevaEscuderia) {
        ListadeEscuderias.add(nuevaEscuderia);
    }    

    /**
     * borra una escuderia de la lista.
     * @param escuderia - escuderia a borra en la lista.
     */
    public  void deleteEscuderia (EscuderiaInterfaz escuderia) {

        ListadeEscuderias.remove(escuderia);

    }    

    /**
     * inserta un nuevo circuito en el set.
     * @param nuevoCircuito el nuevo circuito a insertar.
     */
    public  void setCircuito (Circuito nuevoCircuito) {

        CircuitoSet.add(nuevoCircuito);
    }    

    /**
     * borra un circuito del set.
     * @param circuito -circuito a borrar.
     */
    public  void deleteCircuito (Circuito circuito) {
        CircuitoSet.remove(circuito);
    }  

    /**
     * busca un circuito en CircuitoSet.
     * @param circuito- circuito a buscar en CircuitoSet.
     * @return el circuito buscada.
     */public  Circuito buscarCircuito (Circuito circuito) {
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


    public int getnPilotos() {
        return nPilotos;
    }

    /**
     * busca una escuderia en la lista de escuderias.
     * @param escuderia- escuderia a buscar en la lista.
     * @return la escuderia buscada.
     */
    public  EscuderiaInterfaz buscarEscuderia (EscuderiaInterfaz escuderia) {
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
    public  void DejarVacioTreeSetCircuitos () {
        Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator

        while(it.hasNext()){
            Circuito buscar = it.next();
            it.remove();

        }        

    }    

    /**
     *  deja vacia la lista de escuderias.
     */
    public  void DejarVacioListadeEscuderias() {
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
    public  void MostrarEscuderias(){
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();

        while(it.hasNext()){
            EscuderiaInterfaz buscar = it.next();
            System.out.println (buscar.toString());
            buscar.MostrarPilotos();
            buscar.MostrarCoches();
        }
    }

    /**
     *  Inserta los pilotos listos para correr en el HashMap de pilotosCarrera
     */
    public  void GuardarPilotos(){
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();
        int pos=0;
        while(it.hasNext() && pos<getnPilotos()){
            EscuderiaInterfaz Esc = it.next();
            Esc.AsignarCoche(getnPilotos());
            int tam= Esc.TamanoListaPilotos();
            while (pos<getnPilotos()){
                PilotoInterfaz Piloto = Esc.getPilotosCarrera(0);
                //PilotosCarrera.add(Piloto);
                DevolverEscuderiaPilotos.put (Piloto,Esc);//  PilotosCarrera.put (Esc.getPiloto[i],Piloto.getEscuderia());
                pos++;
                Esc.eliminarPiloto(Piloto);

                Esc.eliminarCoche(Piloto.getCoche());

            }

        }
        PilotosCarrera.addAll(DevolverEscuderiaPilotos.keySet());
    }

    public void DevolverEscuderia(HashMap <PilotoInterfaz,EscuderiaInterfaz> Pilotos){
        Iterator<PilotoInterfaz> it = Pilotos.keySet().iterator();
        while(it.hasNext()){
            PilotoInterfaz pi= it.next();
           Iterator<EscuderiaInterfaz> ti= this.ListadeEscuderias.iterator();
          while (ti.hasNext()) {
              EscuderiaInterfaz esc = ti.next();
              System.out.println(pi.hashCode());
              System.out.println(Pilotos.containsKey(pi));
              System.out.println("el de la lista" + PilotosCarrera.get(0).hashCode());

              if (pi.equals(PilotosCarrera.get(0))) {
                  System.out.println("SOY IGUAL");
              }
              EscuderiaInterfaz esc2= Pilotos.get(pi);
              if (esc.equals(esc2)) {
                  esc.addListaPilotos(pi);
                  esc.addListaCoches(pi.getCoche());
              }
          }
        }
    }

    /**
     * muestra los circuitos del TreeSet de circuitos.
     */
    public  void MostrarCircuitos(){
        Iterator<Circuito> it = this.CircuitoSet.iterator();
        while(it.hasNext()){
            Circuito buscar = it.next();
            System.out.println (buscar.toString());
        }
    }

    /**
     * Ordena la parrilla de salida (pilotosCarrera) por la cantidad de puntos de los pilotos
     */
    public  void OrdenarParrilla(int tipo, ArrayList<PilotoInterfaz> pilotos){

        if(tipo == 1){
            Collections.sort(pilotos, new ComparadorTotalPuntos());
        }
        if(tipo == 2){
            Collections.sort(pilotos, new ComparadorTiempo());
        }
        
    }

    /**
     * Realiza las carreras para cada circuito del campeonato
     */
    public  void campeonato(){
        int Carrerasact = 1;
        Iterator<Circuito> it = this.CircuitoSet.iterator();
        MostrarCircuitos();
        System.out.println("FINALIZADO MOSTRAR CIRCUITOS");
        MostrarEscuderias();
        System.out.println("FINALIZADO MOSTRAR ESCUDERÍAS");
        GuardarPilotos(); //Guarda en pilotoCarreras los coches para correr
        while(it.hasNext()){
            Circuito circuito = it.next();
            System.out.println("----------------------CARRERA " + Carrerasact + " DE " + CircuitoSet.size()+"-------------------------------");
            Carrera(circuito);
            Carrerasact++;
            Podio(circuito);
        }
        FinalCampeonato();
    }

    /**
     * Realiza la carrera en un circuito dado para todos los pilotos que corren en él.
     */
    /**
     * Realiza la carrera en un circuito dado para todos los pilotos que corren en él.
     */
    public  void Carrera(Circuito circuito) {
        OrdenarParrilla(1, PilotosCarrera); //Ordena los pilotos
        Iterator<PilotoInterfaz> it = this.PilotosCarrera.iterator();  //recorrer el arraylist.
        while (it.hasNext()) {
            PilotoInterfaz piloto = it.next();
            if (!piloto.getDescalificado()) {
                System.out.println(piloto.toString()); //Muestra el piloto que correra
                CocheInterfaz coche = piloto.getCoche();
                double velocidad = coche.getVelocidadReal(piloto, circuito);
                System.out.println("VELOCIDAD REAL: " + velocidad);
                piloto.correrCarrera(circuito);

                if (piloto.buscarResultado(circuito) > 0)   //Si el tiempo obtenido es positivo, ha acabado la carrera,
                //si no lo es, no la ha acabado
                {
                    piloto.buscarResultado(circuito);
                } else {
                    if (piloto.getTiempoConcentracion() < coche.getTiempo(piloto, circuito)) {
                        System.out.println("MOTIVO DE ABANDONO: Pérdida de concentración.");
                    }
                    if (coche.getCombustibleUsado(piloto, circuito) < coche.getTiempo(piloto, circuito)) {
                        System.out.println("MOTIVO DE ABANDONO: Falta de combustible.");
                    }
                    System.out.println("TIEMPO RESTANTE: " + Math.abs(piloto.buscarResultado(circuito)));
                    System.out.println("TIEMPO DE CARRERA: " + (coche.getTiempo(piloto, circuito) - piloto.buscarResultado(circuito)));
                    if (piloto.getAbandonos() >= this.nAbandonos) {
                        piloto.descalificar();
/*
                        PilotosDescalificados.add(piloto);
                        PilotosCarrera.remove(piloto);
*/
                    }
                    System.out.println("COMBUSTIBLE ACTUAL = " + coche.getValorcombustible());

                }
            }


        }
    }




    public  void FinalCampeonato(){
        DevolverEscuderia(DevolverEscuderiaPilotos);
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();
        while(it.hasNext()){
            EscuderiaInterfaz Esc = it.next();



            ArrayList ListaPilotos = Esc.getListaPilotos();


            System.out.println(Esc.getNombre() + " tiene " + Esc.getPuntosTotalesEscuderia() + " puntos.");
        }
    }

    /**
     * Ordena la lista de pilotos de PilotosCarrera por tiempo y le asigna los puntos correspondientes a sus posición
     */
    public  void Podio (Circuito circuito){
        int podio = 0;
        this.OrdenarParrilla(2,PilotosCarrera);   //ORDENA POR TIEMPO
        Iterator <PilotoInterfaz> it = PilotosCarrera.iterator();
        while(it.hasNext()){
            PilotoInterfaz piloto = it.next();
            if(piloto.buscarResultado(circuito) > 0){
                System.out.println(DevolverEscuderiaPilotos.containsKey(piloto));
                    EscuderiaInterfaz esc= DevolverEscuderiaPilotos.get(piloto);




                if(podio < 4){

                    piloto.añadirPuntos(circuito,10-podio*2);
                    PilotoInterfaz pilotoInterfaz = piloto;
                    System.out.println(pilotoInterfaz.getPuntosTotales());
                    podio++;
                    DevolverEscuderiaPilotos.replace(piloto,esc);
                }
                else{
                    piloto.añadirPuntos(circuito, 2);
                    DevolverEscuderiaPilotos.replace(piloto,esc);
                }
            }
        }
    }
}
