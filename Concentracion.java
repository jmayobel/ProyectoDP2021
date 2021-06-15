/**
 * Enumeration class Concentracion - La clase "Concentración" define el tiempo (en minutos)
 * que un piloto se mantiene en una carrera
 * hasta que pierde la concentración y abandona esa carrera.
 *
 * @author CESAR VAZQUEZ LAZARO
 * @version 0.2
 */
public enum Concentracion {
    //Variables del ENUM Concentracion:   
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

    //Métodos get()

    /**
     * Devuelve el tipo de concentración.
     *
     * @return Tipo de Concentracion (DESPISTADO, NORMAL, CONCENTRADO, ZEN)
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el tiempo de concentración.
     *
     * @return Tiempo (en minutos) que durará corriendo el piloto antes de abandonar la carrera
     */
    public double getTiempo() {
        return this.tiempo;
    }

    //toString()
    @Override
    public String toString() {
        return getNombre() + " (Concentración original: " + getTiempo() + ").";
    }
}
