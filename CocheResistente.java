/**
 * Write a description of class Coche here.
 *
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public class CocheResistente extends Coche {
    private double depositoExtra;

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
        super.setCombustibleRestante(super.getValorcombustible());
    }

    /**
     * Devuelve el combustible usado por el CocheResistente
     *
     * @return combustibleRestante - tipo double
     */
    @Override
    public void UsarCombustible(double resultado) {

        if (resultado > super.combustibleRestante) {
            super.combustibleRestante = super.getCombustibleRestante() + 100;
            depositoExtra = 0;
            System.out.println("El "+ this.getNombreCoche() +" tiene que recurrir al depósito de reserva para poder correr");
            if (resultado > 0) {
                super.combustibleRestante = (super.getCombustibleRestante() - resultado);
                super.combustibleRestante = Math.round(combustibleRestante * 100d) / 100d;
            }
        } else {
                super.UsarCombustible(resultado);
            }

        }
    }
