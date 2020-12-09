
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int velocidad;
    private int combustible;

    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        // initialise instance variables
        nombre = "";
        velocidad = 0;
        combustible = 0;
    }
    public Coche(String nombre, int velocidad, int combustible){
       this.nombre = nombre;
       this.velocidad = velocidad;
       this.combustible = combustible;
    }

}
