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
        combustibleRestante = super.getValorcombustible();
    }

    /**
     * Devuelve el combustible usado por el CocheResistente
     *

     * @return combustibleRestante - tipo double
     */
    @Override
    public void UsarCombustible(double resultado) {

        if (resultado > combustibleRestante) {
            combustibleRestante = combustibleExtra + 100;
            depositoExtra = 0;
            System.out.println("GASOLINA AÑADIDA");
            if (resultado>0) {
                super.setCombustibleRestante(combustibleRestante - resultado);
            } else {
                super.setCombustibleRestante(combustibleRestante + resultado);
            }

            } else {
            super.UsarCombustible(resultado);
        }

    }
}
