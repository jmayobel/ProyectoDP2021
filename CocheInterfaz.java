/**
 * Write a description of class Coche here.
 * 
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public interface CocheInterfaz {
	public String getNombreCoche();
	public Velocidad getvelocidad();
	public double getValorVelocidad();
	public Combustible getcombustible(); 
	public double getValorcombustible();
	public double getCombustibleUsado(PilotoInterfaz piloto, Circuito circuito);
	public double getTiempo(PilotoInterfaz piloto, Circuito circuito);
	public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito);
}
