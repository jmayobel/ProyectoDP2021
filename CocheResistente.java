/**
 * CocheResistente contiene un tanque con combustible extra
 * que permite al coche aumentar su combustible en caso de que no sea capaz de alcanzar el final.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class CocheResistente extends Coche {

    //Variables de la clase CocheResistente:
    private double depositoExtra;   //Cantidad de combustible extra del coche

    /**
     * Constructor parametrizado para CocheResistente.
     *
     * @param  nombre Nombre del coche.
     * @param  velocidad Velocidad que puede alcanzar el coche.
     * @param  combustible Cantidad de combustible del coche.
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        depositoExtra = 100;
        super.setCombustibleRestante(super.getValorcombustible());
    }

    /**
     * Devuelve el combustible usado por el CocheResistente.
     *
     * @param resultado Cantidad de combustible usado..
     *
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
