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

    /**
     * Constructor parametrizado de CocheResistente
     *
     * @param nombre      - tipo String
     * @param velocidad   - tipo velocidad
     * @param combustible - tipo Combustible
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        depositoExtra = 100;
        combustibleExtra = super.getValorcombustible();
    }

    /**
     * Devuelve el combustible usado por el CocheResistente
     *
     * @param piloto   - tipo String
     * @param circuito - tipo Circuito
     * @return combustibleRestante - tipo double
     */
    @Override
    public void UsarCombustible(PilotoInterfaz piloto, Circuito circuito) {

        if (super.getTiempo(piloto, circuito) > combustibleRestante) {
            combustibleExtra = combustibleExtra + 100;
            depositoExtra = 0;
            super.setCombustibleRestante(combustibleExtra - getTiempo(piloto, circuito));
        } else {
            super.UsarCombustible(piloto, circuito);
        }

    }
}
