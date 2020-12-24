
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public enum Distancia
{
     CORTA ("corta",250.0), INTERMEDIA ("intermedia",275.0), LARGA ("larga",300.0);
     
     
    private final String nombre;
    private final double valor;
    
    Distancia  (String nombre, double valor) {
     this.nombre=nombre;
     this.valor=valor;
    }     
    public String getNombre () {
        
        return nombre;
    }
      public double getValor () {
        
        return valor;
    } 
    
}
 
