
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche
{
    // instance variables - replace the example below with your own
    private String nombreCoche;
    private Velocidad velocidad;
    private Combustible combustible;

    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        // initialise instance variables
        nombreCoche = "";
       // velocidad = 0;
       // combustible = 0;
    }
    public Coche(String nombre, Velocidad velocidad, Combustible combustible){
       this.nombreCoche = nombre;
       this.velocidad = velocidad;
       this.combustible = combustible;
    }
    public String getNombreCoche() {
    	return nombreCoche;
    }
    
    public Velocidad getvelocidad() {
    	return velocidad;
    }
    
    public Combustible getcombustible()  {
    	return combustible;
    }

}
