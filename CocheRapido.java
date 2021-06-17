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
        double velocidadNormal = super.getVelocidadReal(piloto, circuito);
        double velocidadNitro;
        if (this.getNitro() >= velocidadNormal * 0.2) {
            velocidadNitro = Math.round((velocidadNormal + (velocidadNormal * 0.2))*100d)/100d;
            double NitroUsado = Math.round(velocidadNormal * 0.2*100d)/100d;
            this.setNitro(this.getNitro() - velocidadNormal * 0.2);
            System.out.println("+++ El " +this.getNombreCoche()+  " usa " + NitroUsado + " de nitro para alcanzar " + velocidadNitro +" y el nitro restante es "+ this.getNitro()+ " +++");
        } else {
            velocidadNitro = Math.round(velocidadNormal + this.getNitro())*100d/100d;
            System.out.println("+++ El " +this.getNombreCoche()+  " usa " + this.getNitro() + " de nitro para alcanzar " + velocidadNitro +" y agota el nitro. +++");
            this.setNitro(0);
        }
        return velocidadNitro;
    }
    @Override
    public double getTiempo(PilotoInterfaz piloto, Circuito circuito) {
        return ((circuito.getValorDistancia()) / this.getVelocidadReal(piloto, circuito)) *60;
    }

}