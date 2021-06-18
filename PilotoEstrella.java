/**
 * La clase PilotoEstrella calcula la destreza del piloto.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 1.0
 */
public class PilotoEstrella extends PilotoAbstracto {

    //Variables de la clase PilototEstrella:
    private double destreza;

    /**
     * Constructor parametrizado de la clase PilotoEstrella.
     *
     * @param nombre Nombre de pila del piloto
     * @param concentracion Concentración del piloto
     */
    public PilotoEstrella(String nombre, Concentracion concentracion) {
        super(nombre, concentracion);
        this.destreza = getDestreza();
    }

    /**
     * Calcula la destreza del piloto dependiendo del tipo de Piloto
     *
     * @return Destreza del piloto.
     */
    @Override
    public double getDestreza() {
        double Destreza = (getTiempoConcentracion() + 6) / 140 * 1.06 + 0.05;
        return Math.round(Destreza * 100d) / 100d;
    }
}
