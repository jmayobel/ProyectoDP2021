
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
        //initialise instance variables
        nombreCoche = "";
        //velocidad = 0;
        //combustible = 0;
    }

    public Coche(String nombre, Velocidad velocidad, Combustible combustible, double tiempoCarrera){
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
    public double getValorVelocidad() {
        return velocidad.getVelocidad();
    }
    public Combustible getcombustible()  {
        return combustible;
    }

    public double getValorcombustible()  {
        return combustible.getcombustible();
    }

    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        return getValorVelocidad() * piloto.getDestreza() / circuito.getValorComplejidad();
    }

    public double getTiempo(PilotoInterfaz piloto, Circuito circuito) {
        return (circuito.getValorDistancia()/getVelocidadReal(piloto, circuito))*60;
    }
    public double getCombustible(PilotoInterfaz piloto, Circuito circuito) {
        return getValorcombustible() - getTiempo(piloto, circuito);
    }
}
