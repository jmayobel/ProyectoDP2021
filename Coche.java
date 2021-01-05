
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

    public Coche(String nombre, Velocidad velocidad, Combustible combustible){
        this.nombreCoche = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }
    
    public void setnombreCoche(String nombre){
        this.nombreCoche = nombre;
    }
    
    public void setvelocidad(Velocidad velocidad){
         this.velocidad = velocidad;
    }
    public void setcombustible(Combustible combustible){
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
    public double getCombustibleUsado(PilotoInterfaz piloto, Circuito circuito) {
        return getValorcombustible() - getTiempo(piloto, circuito);
    }
}
