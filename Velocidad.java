/**
 * ENUM Velocidad Teorica que va a tener Coche
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Velocidad {
    TORTUGA(200.0),
    LENTA(210.0),
    NORMAL(220.0),
    RAPIDA(230.0),
    GUEPARDO(240.0);

    //Variables de la clase Velocidad:
    private double velocidad;

    /**
     * Constructor de la clase Velocidad
     */
    Velocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
