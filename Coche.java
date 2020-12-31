
/**
 * Write a description of class Coche here.
 * 
 * @author Juanma
 * @version (a version number or a date)
 */
public abstract class Coche implements CocheInterface
{
    // instance variables - replace the example below with your own
    private String nombreCoche;
    private Velocidad velocidad;
    private Combustible combustible;
    private double tiempoCarrera;

    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        // initialise instance variables
        nombreCoche = "";
        tiempoCarrera = 0;
       // velocidad = 0;
       // combustible = 0;
    }
    public Coche(String nombre, Velocidad velocidad, Combustible combustible, double tiempoCarrera){
       this.nombreCoche = nombre;
       this.velocidad = velocidad;
       this.combustible = combustible;
       this.tiempoCarrera = tiempoCarrera;
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
    public double tiempoCarrera()  {
    	return tiempoCarrera;
    }
    
    public double CalculateTiempo(double tiempoCarrera) {
    	return 0;
    }
    
	public double CalculateVelocidad() {
		return 0 /*velocidad*Destreza/Circuito.Complejidad();*/   ;
	}
	public double CalculateCombustible() {
		return 0 /*combustible-CalculateTiempo();*/;
	}

}
