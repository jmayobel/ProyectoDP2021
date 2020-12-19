
/**
 * Enumeration class Complejidad - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
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

       

}