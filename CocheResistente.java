/**
 * Write a description of class Coche here.
 * 
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public class CocheResistente extends Coche {
    private double depositoExtra;
    private double combustibleExtra;
    private double combustibleRestante;
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        depositoExtra = 100;
        combustibleExtra = super.getValorcombustible();
        combustibleRestante = 0;        
    }
    @Override
    public double getCombustibleUsado(PilotoInterfaz piloto, Circuito circuito) {
       
        if(super.getTiempo(piloto, circuito) > combustibleRestante){
            combustibleExtra = combustibleExtra + 100;
            depositoExtra = 0;
            combustibleRestante = combustibleExtra - getTiempo(piloto, circuito);
        }
        else{
            combustibleRestante = super.getCombustibleUsado(piloto, circuito);
        }
        return combustibleRestante;
    }

}
