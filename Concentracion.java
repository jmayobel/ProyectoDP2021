/**
 * Enumeration class Concentracion - La clase "Concentración" define el tiempo (en minutos)
 *                                   que un piloto se mantiene en una carrera
 *                                   hasta que pierde la concentración y abandona esa carrera. 
 * 
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.2
 */
public enum Concentracion{
    //Los posibles tipos de concentración del piloto (Con su tiempo de concentración en minutos)
    DESPISTADO("DESPISTADO", 90.0),
    NORMAL("NORMAL", 100.0),
    CONCENTRADO("CONCENTRADO", 110.0),
    ZEN("ZEN", 120.0); 
  
    private final String nombre;    //Tipo de concentración
    private final double tiempo;    //Tiempo de concentración en minutos
    
    //Constructor parametrizado
    Concentracion(String nombre, double tiempo){
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    //Métodos get()
    public String getNombre(){
       return this.nombre; 
    }    
    public double getTiempo(){
        return this.tiempo;
    }
    
    //toString()
    @Override
    public String toString(){
        return getNombre() + " (Concentración original: " + getTiempo() + ").";
    }
}
