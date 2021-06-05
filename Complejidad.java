
/**
 * enum Complejidad que va a usar Circuitos.
 *
 * @author Miguel Medina Cantos
 * @version (1.0)
 */
public enum Complejidad 
{      BAJA ("BAJA",1.0), MEDIA ("MEDIA",1.25), ALTA ("ALTA",1.5);
     
     
    private final String nombre; //nombre de la complejidad.
    private final double valor; // valor de la complejidad.
    
    /**
     * Constructor parametrizado del enum. 
     * @param nombre -nombre de la complejidad.
     * @param valor  -valor de la complejidad. 
     */
    Complejidad  (String nombre, double valor) {
     this.nombre=nombre;
     this.valor=valor;
    }     
    /**
     * devuelve el nombre el nombre de la complejidad.
     * @return nombre.
     * 
     */
    public String getNombre () {
        return nombre;
    }
    /**
     * devuelve el valor de la complejidad.
     * @return valor.
     */
    public double getValor () {
        
        return valor;
    }  
    
    /**
     * devuelve la informacion de la clase.
     * @return un string con la información de la clase.
     * 
     */
    @Override
    public String toString(){
        return getNombre() + " (valor original: " + getValor() + ").";
    }
       

}