/**
 * La clase Resultados llevará una lista con la información del piloto en cada carrera,
 * entre ellas se encuentra el tiempo corrido en carrera, los puntos obtenidos,
 * y el circuito en cuestión donde se ha corrido.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class Resultados{
    //Variables de la clase Resultados:
    private Circuito circuito;  //Circuito en el que el piloto correrá la carrera
    private double tiempo;      //Tiempo que se ha mantenido el piloto en una carrera
    private int puntos;         //Puntos ganados en una carrera 
    
    //Constructores
    /**
    * Constructor estándar de la clase Resultados.
    */
    public Resultados(){
        this.circuito = null;
        this.tiempo = 0;
        this.puntos = 0;
    }
    /**
    * Constructor parametrizado de la clase Resultados.
    *
    * @param circuito Circuito en el que se realizó la carrera
    * @param tiempo Tiempo en el que el piloto ha terminado la carrera. 
    *               Si el tiempo es negativo, indica los minutos que le han faltado para terminarlo
    * @param puntos Puntos obtenidos en la carrera por el piloto
    */    
    public Resultados(Circuito circuito, double tiempo, int puntos){
        this.circuito = circuito;
        this.tiempo = tiempo;
        this.puntos = puntos;
    }
    
    //Métodos get()/ set()
    /**
     * Devuelve el circuito en el que se ha corrido.
     * 
     * @return Circuito en el que se ha corrido.
     */
    public Circuito getCircuito(){
        return this.circuito;
    }
    /**
     * Devuelve el tiempo en el que el piloto ha terminado la carrera. Si el tiempo es negativo, 
     * indica los minutos que le han faltado para terminarlo.
     * 
     * @return Tiempo de carrera
     */
    public double getTiempoRegistro(){
        return this.tiempo;
    }
    /**
     * Devuelve los puntos ganados en la carrera. 
     * 
     * @return Puntos obtenidos
     */
    public int getPuntos(){
        return this.puntos;
    }
    
    /**
     * Establece el circuito en el que se corrió la carrera.
     * 
     * @param circuito Circuito en el que se corrió    
     */
    public void setCircuito(Circuito circuito){
        this.circuito = circuito ;
    }
    /**
     * Establece el tiempo en el que el piloto acabó la carrera. Si el tiempo es negativo, 
     * indica los minutos que le han faltado para terminarlo. 
     * 
     * @param tiempo Tiempo en el que acabó la carrera   
     */
    public void setTiempoResultado(double tiempo){
        this.tiempo = tiempo;
    }
    /**
     * Establece los puntos ganados en esa carrera. 
     * 
     * @param puntos Puntos obtenidos en la carrera.   
     */
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }  
    
    //Método toString()
    @Override
    public String toString(){
       return getClass().getSimpleName() + 
        "\n Circuito: " + getCircuito() + 
        "\n Tiempo Recorrido: " + getTiempoRegistro() +
        "\n Puntos; " + getPuntos();

    }
}
