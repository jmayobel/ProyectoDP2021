
public class CocheResistente extends Coche {
    private double depositoExtra;
    
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        depositoExtra = 100;
    }
    
    @Override
    public double getCombustibleUsado(PilotoInterfaz piloto, Circuito circuito) {
        if(super.getTiempo(piloto, circuito) > super.getValorcombustible()){
            super.setcombustible(super.getcombustible());
        }
        
        return 0;
    }

}
