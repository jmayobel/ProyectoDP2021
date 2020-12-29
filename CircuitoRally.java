/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public class CircuitoRally implements Circuito
{
    private String nombreCircuito; //nombre del circuito. 
    private Complejidad complejidad; //complejidad original del circuito.
    private Distancia distancia; //distancia original del circuito.
    
    public CircuitoRally (String nombreCircuito,Complejidad complejidad,Distancia distancia) {
        this.nombreCircuito=nombreCircuito;                             
        this.complejidad=complejidad;                                        //hay que cambiarlos por sets si eso
        this.distancia=distancia;
        
      }    
    public String getNombreCircuito () {
         return nombreCircuito;
     }    
    public Complejidad getComplejidad () {
         return complejidad;       
    }   
    public Distancia getDistancia () {
         return distancia;   
    }   
    public double getValorComplejidad ()  {
     return complejidad.getValor();
    }      
    public double getValorDistancia () {
        return distancia.getValor();
     }       
    @Override
    public String toString() {
        return getClass().getSimpleName() + 
        "\n complejidad: " + getValorComplejidad() + 
        "\n distancia: " + getValorDistancia();
    }
 
     
}
