/**
 * Interfaz de CircuitoRally
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public interface Circuito {

    public String getNombreCircuito();

    public Complejidad getComplejidad();

    public Distancia getDistancia();

    public double getValorComplejidad();

    public double getValorDistancia();

    public String toString();

    public boolean equals(Object obj);

}
