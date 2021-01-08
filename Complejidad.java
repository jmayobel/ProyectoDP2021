
/**
 * 
 *
 * @author (Miguel)
 * @version (1.0)
 */
public enum Complejidad
{      BAJA ("baja",1.0), MEDIA ("media",1.25), ALTA ("alta",1.5);
     
     
    private final String nombre;
    private final double valor;
    
    /**
     * Constructor de la clase 
     * @param nombre de la complejidad, valor valor de la complejidad. 
     * @return devuelve un objeto de tipo Complejidad.
     */
    Complejidad  (String nombre, double valor) {
     this.nombre=nombre;
     this.valor=valor;
    }     
    /**
     * 
     * @return devuelve el nombre de la complejidad.
     * 
     */
    public String getNombre () {
        return nombre;
    }
    /**
     * 
     * @return devuelve el valor de la complejidad.
     */
    public double getValor () {
        
        return valor;
    }  
    
    /**
     * @return devuelve la información de la clase.
     * 
     */
    @Override
    public String toString(){
        return getNombre() + " (valor original: " + getValor() + ").";
    }
       

}