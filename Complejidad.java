/**
 * ENUM Complejidad que va a usar Circuitos.
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Complejidad {
    BAJA("BAJA", 1.0), MEDIA("MEDIA", 1.25), ALTA("ALTA", 1.5);

    //Variables de la clase Complejidad:
    private final String nombre;    //Nombre de la complejidad
    private final double valor;     //Valor de la complejidad

    /**
     * Constructor parametrizado del enum
     *
     * @param nombre Nombre de la complejidad
     * @param valor Valor de la complejidad
     */
    Complejidad(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * Devuelve el nombre de la complejidad
     *
     * @return Nombre de la complejidad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el valor de la complejidad
     *
     * @return Valor de la complejidad
     */
    public double getValor() {
        return valor;
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return getNombre() + " (valor original: " + getValor() + ").";
    }
}