import java.util.*;

/**
 * La clase EscuderiaRally representa los equipos que competiran en el campeonato
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class EscuderiaRally implements EscuderiaInterfaz {

    //Variables de la clase EscuderiaRally:
    private String nomEscuderia;                            //Nombre de la escudería
    private ArrayList<PilotoInterfaz> ListaPilotos;         //Lista de los pilotos de la escudería
    private ArrayList<CocheInterfaz> ListaCoches;           //Lista de los coches de la escudería
    private Comparator<PilotoInterfaz> compPilotos;         //Comparador que ordenará la lista de pilotos
    private Comparator<CocheInterfaz> compCoches;           //Comparador que ordenará la lista de coches

    /**
     * Constructor parametrizado de la clase EscuderiaRally
     *
     * @param nomEscuderia Nombre de la escuderia
     * @param compPilotos Comparador que ordenara la lista de pilotos
     * @param compCoches Comparador que ordenara la lista de coches
     */
    public EscuderiaRally(String nomEscuderia, Comparator<PilotoInterfaz> compPilotos, Comparator<CocheInterfaz> compCoches) {
        this.nomEscuderia = nomEscuderia;
        this.ListaPilotos = new ArrayList<PilotoInterfaz>();
        this.ListaCoches = new ArrayList<CocheInterfaz>();

        this.compPilotos = compPilotos;
        this.compCoches = compCoches;
    }

    /**
     * Devuelve el nombre de la escuderia
     *
     * @return Nombre de la escuderia
     */
    public String getNombre() {
        return this.nomEscuderia;
    }

    /**
     * Devuelve la lista de pilotos preparados para la carrera
     *
     * @return Lista de Pilotos que están listos para correr la carrera
     */
    public PilotoInterfaz getPilotosCarrera(int pos) {
        return this.ListaPilotos.get(pos);
    }

    /**
     * Devuelve la lista de pilotos
     *
     * @return Lista de Pilotos de la escuderia
     */
    public ArrayList getListaPilotos() {
        return this.ListaPilotos;
    }

    /**
     * Devuelve la lista de coches
     *
     * @return Lista de Coches de la escuderia
     */
    public ArrayList getListaCoches() {
        return this.ListaCoches;
    }

    /**
     * Devuelve el numero de carreras terminadas de la Escuderia
     *
     * @return Numero de carreras terminadas (con tiempo positivo) de todos los pilotos de la escuderia
     */
    public int getCarrerasTerminadasEsc(){
        int cont = 0;
        for(PilotoInterfaz pil : ListaPilotos){
            cont += pil.getCarrerasTerminadas();
        }
        return cont;
    }

    /**
     * Devuelve el comparador usado para la lista de pilotos
     *
     * @return Comparador de la lista de pilotos
     */
    public Comparator<PilotoInterfaz> getComparadorPilotos() {
        return this.compPilotos;
    }

    /**
     * Establece el comparador usado para la lista de pilotos
     *
     * @param comparador Comparador de la lista de pilotos
     */
    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador) {
        this.compPilotos = comparador;
        Collections.sort(getListaPilotos(), compPilotos);
    }

    /**
     * Devuelve el comparador usado para la lista de coches
     *
     * @return Comparador de la lista de coches
     */
    public Comparator<CocheInterfaz> getComparadorCoches() {
        return this.compCoches;
    }

    /**
     * Establece el comparador usado para la lista de coches
     *
     * @param comparador Comparador de la lista de coches
     */
    public void setComparadorCoches(Comparator<CocheInterfaz> comparador) {
        this.compCoches = comparador;
        Collections.sort(getListaCoches(), compCoches);
    }

    /**
     * Ordena la lista de coches
     */
    public void OrdenarListaCoches () {
        Collections.sort(getListaCoches(),getComparadorCoches());
    }

    /**
     * Ordena la lista de pilotos
     */
    public void OrdenarListaPilotos() {
        Collections.sort(getListaPilotos(), getComparadorPilotos());

    }

    /**
     * Anade un piloto a la lista de pilotos
     *
     * @param piloto Piloto a insertar
     */
    public void addListaPilotos(PilotoInterfaz piloto) {
        this.ListaPilotos.add(piloto);
    }

    /**
     * Anade un coche a la lista de coches
     *
     * @param coche Coche a insertar
     */
    public void addListaCoches(CocheInterfaz coche) {
        this.ListaCoches.add(coche);
    }


    /**
     * Muestra la lista de coches
     */
    public void MostrarCoches() {
        Iterator<CocheInterfaz> it = this.ListaCoches.iterator(); //Inicializamos el Iterator
        while (it.hasNext()) {
            CocheInterfaz coche = it.next();
            System.out.println(coche.toString());
        }
    }

    /**
     * Muestra la lista de pilotos
     */
    public void MostrarPilotos() {
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        while (it.hasNext()) {
            PilotoInterfaz piloto = it.next();
            System.out.println(piloto.toString());
        }
    }

    /**
     * Comprueba que la escuderia este descalificada
     *
     * @return "true" si la escuderia esta descalificada, "false" en caso contrario
     */
    public boolean EscuderiaDescalificada() {
        boolean desc = true;
        for (PilotoInterfaz piloto : ListaPilotos) {
            if (!piloto.getDescalificado()) {
                desc = false;
            }
        }
        return desc;
    }

    /**
     * Devuelve la cantidad de puntos que obtiene la escuderia, calculando
     * el total de puntos de cada piloto y sumandolos
     *
     * @return Total de puntos de la escudería
     */
    public int getPuntosTotalesEscuderia() {
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while (it.hasNext() && !this.EscuderiaDescalificada()) {
            PilotoInterfaz buscar = it.next();
            if (!buscar.getDescalificado())
                puntostotales += buscar.getPuntosTotales();
        }
        return puntostotales;
    }

    /**
     * Asigna los coches con combustible a los pilotos que no estén descalificados de la escudería
     *
     * @param nPilotos Numero de pilotos que recibiran un coche
     */
    public void AsignarCoche(int nPilotos) {
    Iterator<PilotoInterfaz> it = getListaPilotos().iterator();
    int cont=0;
    boolean enc= false;
    while (it.hasNext() && cont<nPilotos ) {
        PilotoInterfaz pi = it.next();
        Iterator<CocheInterfaz> ti = getListaCoches().iterator();
        enc = false;
        while (ti.hasNext() && !enc) {
            CocheInterfaz coche = ti.next();
            if (!pi.getDescalificado() && coche.getCombustibleRestante() > 0) {
                pi.setCoche(coche);
                enc = true;
                ti.remove();
                cont++;
            }
        } }
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return "%%%%%%%%%% " + getNombre() + " %%%%%%%%%%";
    }

    /**
     * Devuelve el codigo hash del objeto
     *
     * @return Codigo hashCode del objeto
     */
    @Override
    public int hashCode() {  //No estoy seguro de que sea así
        int result = 17;
        result = 7 * result + getNombre().hashCode();
        result = 13 * result + getListaPilotos().hashCode();
        result = 17 * result + getListaCoches().hashCode();
        result = 19 * result + getComparadorPilotos().hashCode();
        result = 23 * result + getComparadorCoches().hashCode();

        return result;
    }

    /**
     * Devuelve si el objeto pasado por parametro es el mismo con el que comparamos
     *
     * @return "true" si el objeto pasado es el mismo que el que comparamos,
     *                 "false" en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EscuderiaInterfaz)) {
            return false;
        }

        EscuderiaInterfaz other = (EscuderiaInterfaz) obj;

        return super.equals(other);
    }
}
