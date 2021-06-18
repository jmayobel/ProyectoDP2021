/**
 * CocheRapido contiene un tanque con nitro que permite al coche aumentar su velocidad real
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class CocheRapido extends Coche {

    //Variables de la clase CocheRapido:
    private double nitro;

    /**
     * Constructor parametrizado para CocheRapido
     *
     * @param nombre Nombre del coche
     * @param velocidad Velocidad que puede alcanzar el coche
     * @param combustible Cantidad de combustible del coche
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        this.nitro = 80;
    }

    /**
     * Devuelve el nitro del coche
     *
     * @return Cantidad de nitro disponible
     */
    public double getNitro() {
        return nitro;
    }

    public void setNitro(double nitro) {
        this.nitro = nitro;
    }

    /**
     * Devuelve la velocidad real de CocheRapido y actualiza el nitro
     *
     * @param piloto Piloto que conducira el coche
     * @param circuito Circuito en el que se usara el nitro
     * @return Velocidad que obtendra tras usar el nitro
     */
    @Override
    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        double velocidadNormal = super.getVelocidadReal(piloto, circuito);
        double velocidadNitro;
        if (this.getNitro() >= velocidadNormal * 0.2) {
            velocidadNitro = Math.round((velocidadNormal + (velocidadNormal * 0.2)) * 100d) / 100d;
            double NitroUsado = Math.round(velocidadNormal * 0.2 * 100d) / 100d;
            this.setNitro(this.getNitro() - velocidadNormal * 0.2);
            System.out.println("+++ El " + this.getNombreCoche() + " usa " + NitroUsado + " de nitro para alcanzar " + velocidadNitro + " y el nitro restante es " + this.getNitro() + " +++");
        } else if (this.getNitro() > 0) {
            velocidadNitro = Math.round(velocidadNormal + this.getNitro()) * 100d / 100d;
            System.out.println("+++ El " + this.getNombreCoche() + " usa " + this.getNitro() + " de nitro para alcanzar " + velocidadNitro + " y agota el nitro. +++");
            this.setNitro(0);
        } else {
            velocidadNitro = velocidadNormal;
        }
        return velocidadNitro;
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return super.toString() + " <nitro: " + this.nitro + ">";
    }
}