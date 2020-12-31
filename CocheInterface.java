
public interface CocheInterface {
	public String getNombreCoche();
	public Velocidad getvelocidad();
	public Combustible getcombustible(); 
	public double CalculateVelocidad(Velocidad velocidad, int destreza);
	public double CalculateCombustible(Combustible combustible, int tiempo);
}
