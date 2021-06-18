/**
 * La clase PilotoNovato calcula la destreza del piloto.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 1.0
 */
public class PilotoNovato extends PilotoAbstracto {
    //Variables de la clase PilotoNovato:
    private double destreza;

    /**
     * Constructor parametrizado de la clase PilotoNovato.
     *
     * @param nombre        Nombre de pila del piloto
     * @param concentracion Concentración del piloto
     */
    public PilotoNovato(String nombre, Concentracion concentracion) {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    @Override
    public double getDestreza() {
        double Destreza = (((getTiempoConcentracion() * 0.97) / 120) - 0.03);
        return Math.round(Destreza * 100d) / 100d;
    }
}
