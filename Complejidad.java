
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
    
    Complejidad  (String nombre, double valor) {
     this.nombre=nombre;
     this.valor=valor;
    }     
    public String getNombre () {
        return nombre;
    }
      public double getValor () {
        
        return valor;
    }  
     @Override
    public String toString(){
        return getNombre() + " (valor original: " + getValor() + ").";
    }
       

}