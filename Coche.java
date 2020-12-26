
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
    private float velocidad;
    private float combustible;

    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        // initialise instance variables
        nombreCoche = "";
        velocidad = 0;
        combustible = 0;
    }
    public Coche(String nombre, int velocidad, int combustible){
       this.nombreCoche = nombre;
       this.velocidad = velocidad;
       this.combustible = combustible;
    }
    public String getNombreCoche() {
    	return nombreCoche;
    }
    
    public float getvelocidad() {
    	return velocidad;
    }
    
    public float getcombustible()  {
    	return combustible;
    }

}
