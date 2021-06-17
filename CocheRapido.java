/**
 * Write a description of class Coche here.
 *
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public class CocheRapido extends Coche {

    private double nitro;

    /**
     * Constructor parametrizado para CocheRapido
     *
     * @param nombre      - tipo String
     * @param velocidad   - tipo Velocidad
     * @param combustible - tipo Combustible
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        this.nitro = 80;
    }

    /**
     * Devuelve el nitro del coche
     *
     * @return Devuelve nitro - Tipo double
     */
    public double getNitro() {
        return nitro;
    }
    public void setNitro(double nitro) { this.nitro = nitro;}

    /**
     * Devuelve la velocidad real de CocheRapido y Actualiza el nitro
     *
     * @return Devuelve velocidadNitro - Tipo double
     */
    @Override
    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        double velocidadNitro;
        if (this.getNitro() >= super.getVelocidadReal(piloto, circuito) * 0.2) {
            velocidadNitro = super.getVelocidadReal(piloto, circuito) + (super.getVelocidadReal(piloto, circuito) * 0.2);
            this.setNitro(this.getNitro() - super.getVelocidadReal(piloto, circuito) * 0.2);
        } else {
            velocidadNitro = super.getVelocidadReal(piloto, circuito) + this.getNitro();
            this.setNitro(0);
        }
        return velocidadNitro;
    }
    @Override
    public double getTiempo(PilotoInterfaz piloto, Circuito circuito) {
        return ((circuito.getValorDistancia()) / this.getVelocidadReal(piloto, circuito)) *60;
    }

}