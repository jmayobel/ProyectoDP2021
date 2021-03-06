/**
 * Interfaz de la clase Coche
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public interface CocheInterfaz {
    public void setnombreCoche(String nombre);

    public void setvelocidad(Velocidad velocidad);

    public void setCombustible(Combustible combustible);

    public String getNombreCoche();

    public Velocidad getvelocidad();

    public double getTiempo(PilotoInterfaz piloto, Circuito circuito);

    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito);

    public double getCombustibleRestante();

    public void setCombustibleRestante(double combustibleU);

    public double getValorVelocidad();

    public Combustible getcombustible();

    public void UsarCombustible(double resultado);

    public boolean equals(Object obj);

}
