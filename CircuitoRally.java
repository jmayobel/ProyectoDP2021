/**
 * Clase que gestiona un circuito en el que correran los pilotos
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class CircuitoRally implements Circuito {

    //Variables de la clase CircuitoRally:
    private String nombreCircuito;      //Nombre del circuito
    private Complejidad complejidad;    //Complejidad original del circuito
    private Distancia distancia;        //Distancia original del circuito

    /**
     * Constructor parametrizado de la clase CircuitoRally
     *
     * @param  nombreCircuito Nombre del circuito
     * @param  complejidad Complejidad del circuito
     * @param  distancia Distancia del circuito
     */
    public CircuitoRally(String nombreCircuito, Complejidad complejidad, Distancia distancia) {
        this.nombreCircuito = nombreCircuito;
        this.complejidad = complejidad;
        this.distancia = distancia;
    }

    /**
     * Devuelve el nombre del circuito
     *
     * @return Nombre del circuito
     */
    public String getNombreCircuito() {
        return nombreCircuito;
    }

    /**
     * Devuelve la complejidad del circuito
     *
     * @return Dificultad del circuito
     */
    public Complejidad getComplejidad() {
        return complejidad;
    }

    /**
     * Devuelve la distancia
     *
     * @return Distancia del circuito del punto inicial al final
     */
    public Distancia getDistancia() {
        return distancia;
    }

    /**
     * Devuelve el valor de la complejidad
     *
     * @return Valor de la complejidad
     */
    public double getValorComplejidad() {
        return complejidad.getValor();
    }

    /**
     * Devuelve el valor de la distancia
     *
     * @return Valor de la distancia
     */
    public double getValorDistancia() {
        return distancia.getValor();
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenación de la informacion de la clase
     */
    @Override
    public String toString() {
        return "<" + getNombreCircuito() + "> " +
                "<complejidad: " + getValorComplejidad() + " " +
                "distancia: " + getValorDistancia() + ">";
    }

    /**
     * Devuelve si el objeto pasado por parametro es el mismo con el que comparamos
     *
     * @return "true" si el objeto pasado es el mismo que el que comparamos,
     *         "false" en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circuito)) {
            return false;
        }

        Circuito other = (Circuito) obj;

        return super.equals(other);
    }
}
