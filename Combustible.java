
public enum Combustible {
	ESCASO (350.0),
	NORMAL (440.0),
	GENEROSO (460.0), 
	ELEFANTE (480.0);
	
	private double combustible;
	
	Combustible (double combustible){
		this.combustible = combustible;
	}
	
	public double getCombustible() {
		return combustible;
	}
	
}
