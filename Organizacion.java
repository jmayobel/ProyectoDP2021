import java.util.*;

/**
 * La clase Organizacion se encargará
 *
 * @author (Miguel)
 * @version (a version number or a date)
 */
public class Organizacion {
    // instance variables - replace the example below with your own
    private static Organizacion instance = null;
    private final int nAbandonos;
    private final int nPilotos;
    private TreeSet<Circuito> CircuitoSet;
    private ArrayList<EscuderiaInterfaz> ListadeEscuderias;
    private ArrayList<PilotoInterfaz> PilotosCarrera;
    private HashMap<PilotoInterfaz, EscuderiaInterfaz> DevolverPilotos;


    /**
     * Constructor parametrizado de Organizacion
     */
    private Organizacion(int nAbandonos, int nPilotos, TreeSet<Circuito> circuito) {
        this.nAbandonos = nAbandonos;
        this.nPilotos = nPilotos;
        CircuitoSet = circuito;
        ListadeEscuderias = new ArrayList<EscuderiaInterfaz>();
        DevolverPilotos = new HashMap<PilotoInterfaz, EscuderiaInterfaz>(); //lo necesitamos para devolverlos a su escudería.
        this.PilotosCarrera = new ArrayList<PilotoInterfaz>();

    }

    /**
     * Método del patrón Singleton que permite devolver una instancia del objeto creado.
     * Si no hay ninguna instancia, se crea.
     *
     * @param lAbandonos Límite de abandonos que puede tener un piloto antes de ser eliminado del campeonato
     * @param lPilotos   Límite de pilotos por Escudería que pueden ser enviados a una carrera
     * @param circuito   Lista de circuitos en los que se correrá durante el campeonato
     */
    public synchronized static Organizacion getInstance(int lAbandonos, int lPilotos, TreeSet<Circuito> circuito) {
        if (instance == null) {
            instance = new Organizacion(lAbandonos, lPilotos, circuito);
        }
        return instance;
    }

    /**
     * inserta una nueva escuderia en la lista de escuderias.
     *
     * @param nuevaEscuderia escuderia a insertar en la lista.
     */
    public void setEscuderia(EscuderiaInterfaz nuevaEscuderia) {
        ListadeEscuderias.add(nuevaEscuderia);
    }

    /**
     * inserta un nuevo circuito en el set.
     *
     * @param nuevoCircuito el nuevo circuito a insertar.
     */
    public void setCircuito(Circuito nuevoCircuito) {

        CircuitoSet.add(nuevoCircuito);
    }

    /**
     * borra un circuito del set.
     *
     * @param circuito -circuito a borrar.
     */
    public void deleteCircuito(Circuito circuito) {
        CircuitoSet.remove(circuito);
    }

    /**
     * busca un circuito en CircuitoSet.
     *
     * @param circuito- circuito a buscar en CircuitoSet.
     * @return el circuito buscada.
     */
    public Circuito buscarCircuito(Circuito circuito) {
        Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        Circuito aux = null;

        while (it.hasNext() && !enc) {
            Circuito buscar = it.next();

            if (buscar.equals(circuito)) {
                enc = true;
                aux = buscar;
            }
        }
        return aux;
    }

    public int getnPilotos() {
        return nPilotos;
    }

    /**
     * busca una escuderia en la lista de escuderias.
     *
     * @param escuderia- escuderia a buscar en la lista.
     * @return la escuderia buscada.
     */
    public EscuderiaInterfaz buscarEscuderia(EscuderiaInterfaz escuderia) {
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        EscuderiaInterfaz aux = null;
        while (it.hasNext() && !enc) {
            EscuderiaInterfaz buscar = it.next();
            if (buscar.equals(escuderia)) {
                enc = true;
                aux = buscar;
            }
        }

        return aux;
    }

    /**
     * deja vacio CircuitoSet.
     */
    public void DejarVacioTreeSetCircuitos() {
        Iterator<Circuito> it = this.CircuitoSet.iterator(); //Inicializamos el Iterator

        while (it.hasNext()) {
            Circuito buscar = it.next();
            it.remove();

        }

    }

    /**
     * muestra las escuderias de la lista de escuderias.
     */
    public void MostrarEscuderias() {
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();

        while (it.hasNext()) {
            EscuderiaInterfaz buscar = it.next();
            System.out.println(buscar.toString());
            buscar.MostrarPilotos();
            buscar.MostrarCoches();
        }
    }

    /**
     * Inserta los pilotos listos para correr en el HashMap de pilotosCarrera
     */
    public void GuardarPilotos() {
        Iterator<EscuderiaInterfaz> it = this.ListadeEscuderias.iterator();
        DevolverPilotos.clear();
        PilotosCarrera.clear();
        boolean desc=false;
        while (it.hasNext() && !desc)  {
            int pos = 0;
            int posAux = 0;
            EscuderiaInterfaz Esc = it.next();


            if(Esc.EscuderiaDescalificada()) {

                desc=true;

            }
            if (!desc) {
                Esc.AsignarCoche(getnPilotos());

                while (pos < getnPilotos()) {
                    PilotoInterfaz Piloto = Esc.getPilotosCarrera(posAux);
                    if (!Piloto.getDescalificado()) {
                        Esc.getListaPilotos().remove(posAux);
                        System.out.println(Piloto.getNombre());
                        DevolverPilotos.put(Piloto, Esc);
                        pos++;
                    } else posAux++;
                }
            }



            //Esc.getListaPilotos().clear();
            // Esc.getListaCoches().clear();
        }

        PilotosCarrera.addAll(DevolverPilotos.keySet());

    }

    public void DevolverEscuderia() {
        for (PilotoInterfaz piloto : PilotosCarrera) {
                EscuderiaInterfaz esc = DevolverPilotos.get(piloto);
                esc.addListaPilotos(piloto);
                esc.addListaCoches(piloto.getCoche());
        }

        for (EscuderiaInterfaz esc : ListadeEscuderias) {

            esc.OrdenarListaPilotos();
            esc.OrdenarListaCoches();

        }

    }


    /**
     * muestra los circuitos del TreeSet de circuitos.
     */
    public void MostrarCircuitos() {
        Iterator<Circuito> it = this.CircuitoSet.iterator();
        while (it.hasNext()) {
            Circuito buscar = it.next();
            System.out.println(buscar.toString());
        }
    }

    /**
     * Ordena la parrilla de salida (pilotosCarrera) por la cantidad de puntos de los pilotos
     */
    public void OrdenarParrilla(int tipo, ArrayList<PilotoInterfaz> pilotos) {

        if (tipo == 1) {
            Collections.sort(pilotos, new ComparadorParrillaCarreraEntrada());


        }
        if (tipo == 2) {
            Collections.sort(pilotos, new ComparadorTiempo());
        }

    }

    /**
     * Realiza las carreras para cada circuito del campeonato
     */
    public void campeonato() {
        Iterator<Circuito> it = this.CircuitoSet.iterator();
        int cont = 1;
        MostrarCircuitos();
        System.out.println("FINALIZADO MOSTRAR CIRCUITOS");
        MostrarEscuderias();
        System.out.println("FINALIZADO MOSTRAR ESCUDERÍAS");

        while (it.hasNext()) {
            GuardarPilotos();
            Circuito circuito = it.next();
            System.out.println("+++++++++++++++++++++++++++ "
                    + "Los pilotos de: " + circuito.getNombreCircuito() + " son: " + "+++++++++++++++++++++++++++"
            );
            PilotosCorren();
            System.out.println("+++++++++++++++++++++++++++ "
                    + "Comienza la carrera en: " + circuito.getNombreCircuito() + " (" + cont +" de "+ CircuitoSet.size() + ")" +" +++++++++++++++++++++++++++"
            );
            Carrera(circuito);
            Podio(circuito);
            DevolverEscuderia();
            cont++;
        }
        FinalCampeonato();
    }

    private void PilotosCorren() {
        System.out.println("LOS PILOTOS QUE VAN A CORRER SON: ");
        for(PilotoInterfaz piloto : PilotosCarrera){
            System.out.println(piloto.toString());
        }
    }

    /**
     * Realiza la carrera en un circuito dado para todos los pilotos que corren en él.
     */
    /**
     * Realiza la carrera en un circuito dado para todos los pilotos que corren en él.
     */

    public void Carrera (Circuito circuito){

        OrdenarParrilla(1, PilotosCarrera);

        for(PilotoInterfaz piloto: PilotosCarrera){
            //EscuderiaInterfaz esc = DevolverPilotos.get(piloto);//DESCOMENTARLO POR SI DA PROBLEMAS
            // DevolverPilotos.remove(piloto); //DESCOMENTARLO POR SI DA PROBLEMAS
            System.out.println(piloto.toString());
            CocheInterfaz coche = piloto.getCoche(); //¿CAMBIAR?
            piloto.conducirCoche(circuito);

            if (piloto.buscarResultado(circuito) > 0)   //Si el tiempo obtenido es positivo, ha acabado la carrera,
            //si no lo es, no la ha acabado
            {
                System.out.println("TIEMPO DEL PILOTO EN EL CIRCUITO: " + piloto.buscarResultado(circuito));
                System.out.println("TIEMPO DE FINALIZACIÓN: " + coche.getTiempo(piloto, circuito));
                System.out.println();

            } else {
                System.out.println("TIEMPO RESTANTE: " + (Math.round((piloto.buscarResultado(circuito)) * 100d)) / 100d);
                System.out.println("TIEMPO DE CARRERA: " + (Math.round((coche.getTiempo(piloto, circuito) - piloto.buscarResultado(circuito))) * 100d) / 100d);
                System.out.println();

                if (piloto.getAbandonos() == this.nAbandonos) {
                    piloto.descalificar();
                }
                System.out.println();

                System.out.println("COMBUSTIBLE ACTUAL = " + coche.getValorcombustible());


            }
           // DevolverPilotos.put(piloto, esc);
        }
    }


    public void FinalCampeonato() {

        for (EscuderiaInterfaz Esc : ListadeEscuderias) {
            if (Esc.EscuderiaDescalificada()) {
                System.out.println(Esc.getNombre() + "está descalificada." + "y tiene 0 puntos.");
            }
            else
            System.out.println(Esc.getNombre() + " tiene " + Esc.getPuntosTotalesEscuderia() + " puntos.");


        }

    }

    /**
     * Ordena la lista de pilotos de PilotosCarrera por tiempo y le asigna los puntos correspondientes a sus posición
     */
    public void Podio(Circuito circuito) {
        System.out.println("+++++++++++++++++ Clasificación final de la carrera en " + circuito.getNombreCircuito() + "++++++++++++++++++");
        int podio = 0;
        this.OrdenarParrilla(2, PilotosCarrera);   //ORDENA POR TIEMPO
        for (PilotoInterfaz piloto : PilotosCarrera) {
            if (piloto.buscarResultado(circuito) > 0) {
                //EscuderiaInterfaz esc = DevolverPilotos.get(piloto); //DESCOMENTARLO POR SI DA PROBLEMAS
                //DevolverPilotos.remove(piloto); //DESCOMENTARLO POR SI DA PROBLEMAS
                if (podio < 4) {
                    int puntos = 10 - podio * 2;
                    piloto.añadirPuntos(circuito, puntos);
                    System.out.print("Posicion " + (podio+1) + ": " + piloto.getNombre() + " - ");
                    System.out.print("Tiempo: " + piloto.buscarResultado(circuito) + " - ");
                    System.out.println("Puntos: " + puntos);
                    podio++;
                } else {
                    piloto.añadirPuntos(circuito, 2);
                    System.out.print("Posicion " + (podio+1) + ": " + piloto.getNombre() + " - ");
                    System.out.print("Tiempo: " + piloto.buscarResultado(circuito) + " - ");
                    System.out.println("Puntos: " + 2);
                }
                //DevolverPilotos.put(piloto, esc); //DESCOMENTARLO POR SI DA PROBLEMAS
            } else {
                System.out.print("Ha abandonado " + piloto.getNombre() + " - ");
                System.out.print("Tiempo: " + piloto.buscarResultado(circuito) + " - ");
                System.out.println("Puntos: " + 0);
            }



        }


    }
}

