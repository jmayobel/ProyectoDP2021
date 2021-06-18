/**
 * La clase PilotoExperimentado calcula la destreza del piloto
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class PilotoExperimentado extends PilotoAbstracto {

    //Variables de la clase PilotoExperimentado:
    private double destreza;

    /**
     * Constructor parametrizado de la clase PilotoExperimentado
     *
     * @param nombre Nombre de pila del piloto
     * @param concentracion Concentracion del piloto
     */
    public PilotoExperimentado(String nombre, Concentracion concentracion) {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    /**
     * Calcula la destreza del piloto dependiendo del tipo de Piloto
     *
     * @return Destreza del piloto
     */
    @Override
    public double getDestreza() {
        double Destreza = (((getTiempoConcentracion() + 3) / 130) * 1.03);
        return Math.round(Destreza * 100d) / 100d;
    }
}