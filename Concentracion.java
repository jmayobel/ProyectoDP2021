/**
 * ENUM Concentracion que va a usar Piloto.
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */

public enum Concentracion {

    //Variables de la clase Concentracion:
    DESPISTADO("DESPISTADO", 90.0),
    NORMAL("NORMAL", 100.0),
    CONCENTRADO("CONCENTRADO", 110.0),
    ZEN("ZEN", 120.0);

    private final String nombre;    //Tipo de concentración
    private final double tiempo;    //Tiempo de concentración en minutos

    /**
     * Constructor parametrizado de la clase Concentracion.
     *
     * @param nombre Tipo de Concentracion (DESPISTADO, NORMAL, CONCENTRADO, ZEN)
     * @param tiempo Tiempo (en minutos) que durará corriendo el piloto antes de abandonar la carrera
     */
    Concentracion(String nombre, double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    /**
     * Devuelve el tipo de concentracion
     *
     * @return Tipo de Concentracion (DESPISTADO, NORMAL, CONCENTRADO, ZEN)
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el tiempo de concentracion
     *
     * @return Tiempo (en minutos) que durará corriendo el piloto antes de abandonar la carrera
     */
    public double getTiempo() {
        return this.tiempo;
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Concentración: " + getNombre() + " (" +  getTiempo() + ")";
    }
}
