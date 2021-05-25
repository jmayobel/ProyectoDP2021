/**
 *  Clase que gestiona un circuito.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public class CircuitoRally implements Circuito
{
    private String nombreCircuito; //nombre del circuito. 
    private Complejidad complejidad; //complejidad original del circuito.
    private Distancia distancia; //distancia original del circuito.
    
    /**
     * Constructor parametrizado de la clase CircuitoRally.
     * 
     * @param nombreCircuito - el nombre del circuito.
     * @param complejidad - complejidad del circuito.
     * @param distancia -distancia del circuito.
     * 
     */
    public CircuitoRally (String nombreCircuito,Complejidad complejidad,Distancia distancia) {
        this.nombreCircuito=nombreCircuito;                             
        this.complejidad=complejidad;                                        
        this.distancia=distancia;
        
      }    
    /** 
     *  devuelve el nombre del circuito.
      * @return  nombreCircuito.
     */
    public String getNombreCircuito () {
         return nombreCircuito;
     }    
     /** 
      * devuelve la complejidad del circuito.
      * @return complejidad.
     */
    public Complejidad getComplejidad () {
         return complejidad;       
    }   
    /** 
     * devuelve la distancia.
     * @return  distancia.
     */
    public Distancia getDistancia () {
         return distancia;   
    }   
    /** 
     * devuelve el valor de la complejidad.
     * 
     * @return  el valor de la complejidad.
     */
    public double getValorComplejidad ()  {
     return complejidad.getValor();
    }      
    /** devuelve el valor de la distancia.
     * 
      * @return devuelve el valor de la distancia.
     */
    public double getValorDistancia () {
        return distancia.getValor();
    }       
    /** 
     * devuelve  la informacion de una clase.
      * @return  un string con la informacion de la clase.
     */
    @Override
    public String toString() {
        return getNombreCircuito () + "\n"+
        "complejidad: " + getValorComplejidad() + "\n" +
         "distancia: " + getValorDistancia();
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circuito)) {
            return false;
        }

        Circuito other = (Circuito) obj;

        return super.equals(other);






    }
}
