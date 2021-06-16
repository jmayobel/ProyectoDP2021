;

/**
 * Write a description of class Coche here.
 *
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public interface CocheInterfaz {
    public void setnombreCoche(String nombre);

    public void setvelocidad(Velocidad velocidad);

    public void setCombustible(Combustible combustible);

    public String getNombreCoche();

    public Velocidad getvelocidad();

    public boolean equals(Object obj);

    public double getValorVelocidad();

    public Combustible getcombustible();

    public double getValorcombustible();

    public void UsarCombustible(double resultado);

    public double getTiempo(PilotoInterfaz piloto, Circuito circuito);

    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito);

    public double getCombustibleRestante();

    public void setCombustibleRestante(double combustibleU);
}
