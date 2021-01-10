import java.util.Iterator;
import java.util.HashMap;
/**
 * La clase Piloto representa a aquellos que competirán con un coche en los circuitos de la competición.
 * La diferencia entre cada Piloto viene marcada por la concentración del mismo, 
 * característica que marcará el rendimiento del Piloto y el Coche en el Circuito.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.5
 */
public abstract class PilotoAbstracto implements PilotoInterfaz{
    //Variables de la clase Piloto:    
    private String nombre;                                  //Nombre completo del Piloto
    private Coche coche;                                    //Coche con el que correrá (Asignado por la Escudería)
    private Concentracion concentracion;                    //Minutos que aguanta el piloto de carrera antes de abandonar 
    private HashMap<Circuito,Resultados> resultados;        //Registro con el tiempo y puntos conseguidos en cada carrera
    private boolean descalificado;                          //"false" si NO ha sido descalificado, "true" en caso contrario
    private int nAbandonos;                                 //Número de abandonos que el piloto ha tenido durante la competición
    
    /**
     * Constructor parametrizado de la clase Piloto.
     *
     * @param nombre Nombre de pila del piloto
     * @param concentracion Tipo de Concentración (DESPISTADO, NORMAL, CONCENTRADO, ZEN) del piloto. 
     *                      Será el tiempo en minutos que el piloto mantiene la concentración 
     *                      antes de abandonar la carrera
     *     
     */
    public PilotoAbstracto(String nombre, Concentracion concentracion){ //Añadir el coche y el registro
        this.nombre = nombre;
        this.coche = null;
        this.concentracion = concentracion;
        this.resultados = new HashMap<Circuito,Resultados>();
        this.descalificado = false;
        this.nAbandonos = 0;
    }
    
    //Métodos get()/set()
    /**
     * Devuelve el nombre del piloto.
     * 
     * @return Nombre del piloto    
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Devuelve el coche que conducirá el piloto.
     * 
     * @return Coche que conduce el piloto    
     */
    public Coche getCoche(){
        return this.coche;
    }
    /**
     * Devuelve el Tipo de Concentración.
     * 
     * @return ENUM Concentracion(String nombre, double tiempo)   
     */
    public Concentracion getConcentracion(){
        return this.concentracion;
    }
    /**
     * Devuelve el tiempo de concentración del piloto.
     * 
     * @return Tiempo (en minutos) que aguantará el piloto antes de abandonar la carrera     
     */
    public double getTiempoConcentracion(){     //USAD ESTE SI LO QUE NECESITAIS ES EL NUMERO
        return this.concentracion.getTiempo();
    }
    /**
     * Devuelve el registro completo con los resultados del piloto en cada carrera.
     * 
     * @return Lista con los resultados de cada carrera     
     */
    public HashMap<Circuito,Resultados> getResultados(){
        return this.resultados;
    }
    /**
     * Devuelve si el piloto ha sido descalificado de la competición.
     * 
     * @return boolean "true" en caso de que el piloto esté descalificado, "false" en caso contrario.   
     */
    public boolean getDescalificado(){
        return this.descalificado;
    }
    /**
     * Devuelve la cantidad de veces que el piloto ha abandonado la carrera.
     * 
     * @return Número de veces que el piloto ha abandonado 
     */
    public int getAbandonos(){
        return this.nAbandonos;
    }
    /**
     * Método que usan los hijos para calcular la destreza del piloto dependiendo del tipo de Piloto. 
     * 
     * @return Destreza del piloto     
     */
    public abstract double getDestreza();
    
    /**
     * Establece el coche con el que correrá el piloto.
     * 
     * @param coche El coche que usará el piloto     
     */
    public void setCoche(Coche coche){
      this.coche = coche;
    }
    /**
     * Descalifica al piloto, negándole a seguir participando en la competición.  
     */
    public void descalificar(){ //También llamado setDescalificado()
        this.descalificado = true;
    }
    /**
     * Añade un abandono al piloto en cuestión.
     */
    public void abandonar(){
        this.nAbandonos++;
    }
        
    //Métodos HashMap
    /**
     * Añade nueva información al registro de resultados.
     * 
     * @param circuito Circuito en el que el piloto ha corrido
     * @param tiempo Tiempo en el que el piloto ha terminado la carrera. 
     *               Si el tiempo es negativo, indica los minutos que le han faltado para terminarlo.
     * @param puntos Puntuación que ha obtenido el piloto en esa carrera.            
     */
    public void añadirTiempo(Circuito circuito, double tiempo){
        this.resultados.put(circuito, new Resultados(tiempo));
    }
    /**
     * Busca el tiempo que se hizo dado un circuito en específico.
     * 
     * @param buscado Circuito del que se desea obtener el tiempo     
     */
    public double buscarResultado(Circuito buscado){
        Iterator<Circuito> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        double tiempo = 0;
        while(it.hasNext()){
            Circuito key = it.next();
            Resultados valor = this.resultados.get(key);
            tiempo = valor.getTiempoResultados();              
        }
        return tiempo;
    }
    /**
     * Elimina la información del registro dado un circuito en específico.
     * 
     * @param buscado Circuito del que se desea borrar la información     
     */
    public void eliminarResultado(Circuito buscado){
        Iterator<Circuito> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext()){
            Circuito buscar = it.next();
            if(buscar.equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    /**
     * Devuelve el tamaño de la lista del registro del piloto.
     * 
     * @return Tamaño del registro    
     */
    public int getTamañoResultados(){
        return this.resultados.size();
    }
    /**
     * Devuelve el total de puntos que ha conseguido el piloto en toda la competición.
     * 
     * @return Puntos totales del piloto   
     */
    public int getPuntosTotales(){
        Iterator<Circuito> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while(it.hasNext()){
            Circuito key = it.next();
            Resultados valor = this.resultados.get(key);
            puntostotales += valor.getPuntos();   
        }
        return puntostotales;
    }
    /**
     * Imprime por pantalla los resultados del piloto en toda la competición.     
     */
    public void mostrarResultados(){
        Iterator<Circuito> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator        
        while(it.hasNext()){
            Circuito key = it.next();
            Resultados valor = this.resultados.get(key);
            System.out.println(key);    //SEGURO QUE ES ASI??
        }
        System.out.println("PUNTOS TOTALES: " + getPuntosTotales());
    }    
    /**
     * Vacía el registro de resultados.
     */
    public void limpiarResultados(){
        this.resultados.clear();
    }
    
    //Otros métodos
    /**
     * Desarrollo de la carrera, en él se calculará si el piloto consigue acabarla o no.
     * 
     * @param circuito Circuito en el que se correrá la carrera
     */
    public void correrCarrera(Circuito circuito){
        Coche coche = getCoche();
        if(getTiempoConcentracion() < coche.getTiempo(this, circuito)){ 
            double resultado = getTiempoConcentracion() - coche.getTiempo(this, circuito);
            añadirTiempo(circuito, resultado);
            double combustibleactual = coche.getValorcombustible() - getTiempoConcentracion();
            coche.setCombustibleUsado(combustibleactual);
            abandonar();
        }
        if(coche.getCombustibleUsado(this, circuito) < coche.getTiempo(this, circuito)){ 
            double resultado = coche.getValorcombustible() - coche.getTiempo(this, circuito); //NO SEGURO
            añadirTiempo(circuito, resultado);
            double combustibleactual = coche.getTiempo(this, circuito) + resultado;  //Tiempo que dura la carrera + 
                                                                                     //(- tiempo que le faltó al piloto
                                                                                     //para acabar)
            coche.setCombustibleUsado(combustibleactual);
            abandonar();                       
        }
        else{
            double resultado = coche.getTiempo(this, circuito);
            añadirTiempo(circuito, resultado);
            double combustibleactual = coche.getValorcombustible() - resultado;
            coche.setCombustibleUsado(combustibleactual);
        }
    }
    
    //toString()    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("PILOTO: " + getNombre());
        builder.append('\n');
        builder.append("Coche: " + getCoche());
        builder.append('\n');
        builder.append(this.concentracion.toString());  //NO MUY SEGURO DE ESTO
        builder.append('\n');
        builder.append("RESULTADOS: ");  //NO MUY SEGURO DE ESTO
        builder.append('\n');
        mostrarResultados();
        builder.append('\n');
        builder.append("¿Descalificado?: ");
        if(getDescalificado() == false){
            builder.append("NO");
        }
        else{
            builder.append("SÍ");
        }
        builder.append('\n');
        return builder.toString();
    }
    
    //hashCode()
    @Override
    public int hashCode(){
        int result = 17;
        result = 7 * result + getNombre().hashCode();
        result = 13 * result + getCoche().hashCode();
        result = 17 * result + getConcentracion().hashCode();
        result = 19 * result + getResultados().hashCode();

        return result;
    }
}
