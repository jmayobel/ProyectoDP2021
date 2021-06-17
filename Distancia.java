/**
 * enum Distancia que va a usar Circuitos
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Distancia {
    CORTA("CORTA", 250.0), INTERMEDIA("INTERMEDIA", 275.0), LARGA("LARGA", 300.0);


    private final String nombre; //nombre de la distancia
    private final double valor;  //valor de la distancia

    /**
     * Constructor parametrizado del enum Distancia.
     *
     * @param nombre - nombre de la distancia.
     * @param valor  - valor de la distancia.
     */
    Distancia(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * devuelve el nombre de la complejidad.
     *
     * @return nombre.
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * devuelve el valor de la complejidad.
     *
     * @return valor.
     */
    public double getValor() {

        return valor;
    }

    /**
     * devuelve la informacion del enum distancia.
     *
     * @return un string con el nombre y el valor.
     */
    @Override
    public String toString() {
        return getNombre() + " (valor original: " + getValor() + ").";
    }

}
 
