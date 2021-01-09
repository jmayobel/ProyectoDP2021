import java.util.*;
/**
 * La clase EscuderiaRally representa los equipos que competirán en el campeonato.
 *
 * @author MIGUEL MEDINA Y CÉSAR VÁZQUEZ
 * @version 0.1
 */
public class EscuderiaRally implements EscuderiaInterfaz
{

    //Variables de la clase EscuderiaRally:
    private String nomEscuderia;                            //Nombre de la escudería
    private ArrayList <PilotoInterfaz> ListaPilotos;        //Lista de los pilotos de la escudería        
    private ArrayList <CocheInterfaz> ListaCoches;          //Lista de los coches de la escudería
    private Comparator<PilotoInterfaz> compPilotos;         //Comparador que ordenará la lista de pilotos
    private Comparator<CocheInterfaz> compCoches;           //Comparador que ordenará la lista de coches

       
    /**
     * Constructor parametrizado de la clase EscuderiaRally.
     *
     * @param nomEscuderia Nombre de la escudería
     * @param compPilotos Comparador que ordenará la lista de pilotos
     * @param compCoches Comparador que ordenará la lista de coches
     */
    public EscuderiaRally(String nomEscuderia, Comparator<PilotoInterfaz> compPilotos, Comparator<CocheInterfaz> compCoches){
        this.nomEscuderia = nomEscuderia;
        this.ListaPilotos = new ArrayList <PilotoInterfaz> ();
        this.ListaCoches = new ArrayList <CocheInterfaz> ();
        this.compPilotos = compPilotos;
        this.compCoches = compCoches;
    }

    //Métodos get()/set()
    /**
     * Devuelve el nombre de la escudería
     * 
     * @return Nombre de la escudería    
     */
    public String getNombre(){        
        return this.nomEscuderia;        
    }
    /**
     * Devuelve la lista de pilotos
     * 
     * @return Lista de Pilotos   
     */
    public ArrayList getListaPilotos(){ 
        return this.ListaPilotos;     
    }    
    /**
     * Devuelve la lista de coches
     * 
     * @return Lista de Coches    
     */
    public ArrayList getListaCoches(){       
        return this.ListaCoches;    
    }
    /**
     * Devuelve el comparador usado para la lista de pilotos
     * 
     * @return Comparador de la lista de pilotos    
     */
    public Comparator<PilotoInterfaz> getComparadorPilotos(){        
        return this.compPilotos;        
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
     * Establece el comparador usado para la lista de pilotos
     * 
     * @param comparador Comparador de la lista de pilotos    
     */
    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador){
        this.compPilotos = comparador;
    }
    /**
     * Establece el comparador usado para la lista de coches
     * 
     * @param comparador Comparador de la lista de coches    
     */
    public void setComparadorCoches(Comparator<CocheInterfaz> comparador){
        this.compCoches = comparador;
    }
    /**
     * Añade un piloto a la lista de pilotos
     * 
     * @param piloto Piloto a insertar   
     */
    public void addListaPilotos(PilotoInterfaz piloto){          
        this.ListaPilotos.add(piloto);        
    }
    /**
     * Añade un coche a la lista de coches
     * 
     * @param coche Coche a insertar   
     */
    public void addListaCoches(CocheInterfaz coche){        
        this.ListaCoches.add(coche);    
    }
    /**
     * Elimina un piloto de la lista de pilotos
     * 
     * @param buscado Piloto a eliminar   
     */    
    public void eliminarPiloto(PilotoInterfaz buscado){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext() && !enc){
            PilotoInterfaz buscar = it.next();
            if(buscar.getNombre().equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    /**
     * Elimina un coche de la lista de coches
     * 
     * @param buscado Coche a eliminar   
     */
    public void eliminarCoche(CocheInterfaz buscado){
        Iterator<CocheInterfaz> it = this.ListaCoches.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext() && !enc){
            CocheInterfaz buscar = it.next();
            if(buscar.getNombreCoche().equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    /**
     * Vacía la lista de pilotos
     */
    public void limpiarListaPilotos(){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            PilotoInterfaz eliminar = it.next();
            it.remove();     
        }
    }
    /**
     * Vacía la lista de coches
     */
    public void limpiarListaCoches(){
        Iterator<CocheInterfaz> it = this.ListaCoches.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            CocheInterfaz eliminar = it.next();
            it.remove();     
        }
    }
    /**
     * Devuelve la cantidad de puntos que obtiene la escudería, calculando
     * el total de puntos de cada piloto y sumándolos.
     * 
     * @return Total de puntos de la escudería
     */
    public int getPuntosTotalesEscuderia(){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while(it.hasNext()){
            PilotoInterfaz buscar = it.next();
            puntostotales += buscar.getPuntosTotales();   
        }
        return puntostotales;   
    }

     @Override
    public String toString(){
        return getNombre();
    }
    
    //hashCode()
    @Override
    public int hashCode(){  //No estoy seguro de que así
        int result = 17;
        result = 7 * result + getNombre().hashCode();
        result = 13 * result + getListaPilotos().hashCode();
        result = 17 * result + getListaCoches().hashCode();
        result = 19 * result + getComparadorPilotos().hashCode();
        result = 23 * result + getComparadorCoches().hashCode();

        return result;
    }
}
