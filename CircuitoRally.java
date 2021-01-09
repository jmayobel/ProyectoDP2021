/**
 *  Clase que gestiona un circuito.
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class CircuitoRally implements Circuito
{
    private String nombreCircuito; //nombre del circuito. 
    private Complejidad complejidad; //complejidad original del circuito.
    private Distancia distancia; //distancia original del circuito.
    
    /** 
     * Constructor de los objetos de la clase CircuitoRally.
     * 
     * @param nombreCircuito el nombre del circuito,complejidad complejidad del circuito, distancia ditancia del circuito.
     * 
     * @return devuelve un objeto de tipo CircuitoRally.
     */
    public CircuitoRally (String nombreCircuito,Complejidad complejidad,Distancia distancia) {
        this.nombreCircuito=nombreCircuito;                             
        this.complejidad=complejidad;                                        
        this.distancia=distancia;
        
      }    
    /** 
      * @return devuelve nombreCircuito
     */
    public String getNombreCircuito () {
         return nombreCircuito;
     }    
     /** 
      * @return devuelve complejidad
     */
    public Complejidad getComplejidad () {
         return complejidad;       
    }   
    /** 
     * @return devuelve distancia
     */
    public Distancia getDistancia () {
         return distancia;   
    }   
    /** 
     * 
     * @return devuelve el valor de la complejidad
     */
    public double getValorComplejidad ()  {
     return complejidad.getValor();
    }      
    /** 
      * @return devuelve el valor de la distancia
     */
    public double getValorDistancia () {
        return distancia.getValor();
    }       
    /** 
      * @return devuelve un string con la informacion de la clase
     */
    @Override
    public String toString() {

        return getNombreCircuito () + "\n"+
        "complejidad: " + getValorComplejidad() + "\n" +
         "distancia: " + getValorDistancia();
    }
 
     
}
