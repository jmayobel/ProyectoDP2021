/**
 * ENUM Distancia que va a usar Circuitos
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Distancia {
    CORTA("CORTA", 250.0), INTERMEDIA("INTERMEDIA", 275.0), LARGA("LARGA", 300.0);

    //Variables de la clase Distancia:
    private final String nombre; //Nombre de la distancia
    private final double valor;  //Valor de la distancia

    /**
     * Constructor parametrizado del enum Distancia
     *
     * @param nombre Nombre de la distancia
     * @param valor Valor de la distancia.
     */
    Distancia(String nombre, double valor) {
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
 
