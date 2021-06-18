/**
 * Clase Coche, que contiene su nombre, velocidad y combustible.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class Coche implements CocheInterfaz {
    //Variables de la clase Coche:
    private String nombreCoche;             //Nombre completo del Coche
    private Velocidad velocidad;            //Velocidad (Nombre de la velocidad y tamaño) que posee el coche
    private Combustible combustible;        //Combustible total del coche
    protected double combustibleRestante;   //Combustible actual del coche

    /**
     * Constructor del coche
     *
     * @param nombre Nombre del coche
     * @param velocidad Velocidad en la que el coche puede correr
     * @param combustible Cantidad de combustible total que el coche almacena
     */
    public Coche(String nombre, Velocidad velocidad, Combustible combustible) {
        this.nombreCoche = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.combustibleRestante = Math.round(combustible.getcombustible() * 100d) / 100d;
    }

    /**
     * Establece el nombre del coche
     *
     * @param nombre Nombre del coche
     */
    public void setnombreCoche(String nombre) {
        this.nombreCoche = nombre;
    }

    /**
     * Establece la velocidad del coche
     *
     * @param velocidad Velocidad del coche
     */
    public void setvelocidad(Velocidad velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Establece el combustible del coche
     *
     * @param combustible Combustible del coche
     */
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    /**
     * Devuelve el nombre del coche
     *
     * @return nombre Nombre del coche
     */
    public String getNombreCoche() {
        return nombreCoche;
    }

    /**
     * Devuelve el enum de la velocidad del coche
     *
     * @return velocidad ENUM de la velocidad del coche
     */
    public Velocidad getvelocidad() {
        return velocidad;
    }

    /**
     * Devuelve el valor de la velocidad del coche
     *
     * @return El valor de la velocidad del coche
     */
    public double getValorVelocidad() {
        return velocidad.getVelocidad();
    }

    /**
     * Devuelve el enum del combustible del coche
     *
     * @return combustible ENUM del combustible
     */
    public Combustible getcombustible() {
        return combustible;
    }

    /**
     * Devuelve el valor del combustible del coche
     *
     * @return Combustible restante del coche
     */
    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    /**
     * Establece del combustible disponible
     *
     * @param combustibleU Combustible restante del coche
     */
    public void setCombustibleRestante(double combustibleU) {
        this.combustibleRestante = combustibleU;
    }

    /**
     * Devuelve la velocidad total del coche en un circuito y con un piloto concreto
     *
     * @param piloto Piloto que lleva ese coche
     * @param circuito Circuito en el que correra el coche
     * @return velocidadReal Velocidad total del coche en ese circuito y con ese piloto
     */
    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        double velocidadReal = Math.round(((getValorVelocidad() * piloto.getDestreza())*100d)/ circuito.getValorComplejidad()) /100d;
        System.out.println("+++Con estas condiciones es capaz de correr a " + velocidadReal + " km/hora +++");
        return velocidadReal;
    }

    /**
     * Retorna el tiempo que dura la carrera para el piloto en el circuito
     *
     * @param piloto   - un piloto de la carrera
     * @param circuito - Un circuito
     * @return Devuelve el tiempo de la carrera
     */
    public double getTiempo(PilotoInterfaz piloto, Circuito circuito) {
        double tiempo = ((circuito.getValorDistancia()) / this.getVelocidadReal(piloto, circuito)) *60 ;

        return tiempo;
    }

    /**
     * Retorna el tiempo que dura la carrera para el piloto en el circuito
     *
     * @return Combustible - Tipo Double
     */
    public void UsarCombustible(double resultado) {
        if (resultado > 0) {
            this.combustibleRestante = (getCombustibleRestante() - resultado);
            this.combustibleRestante = Math.round(combustibleRestante * 100d) / 100d;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CocheInterfaz)) {
            return false;
        }

        CocheInterfaz other = (CocheInterfaz) obj;

        return super.equals(other);
    }

    /**
     * Muestra por pantalla la información de la clase.
     *
     * @return String Concatenación con la información de la clase.
     */
    @Override
    public String toString() {
        return
                "<Nombre del coche: " + getNombreCoche() + "> " +
                        "<Tipo: " + this.getClass().getName() + "> "  +
                          "<Velocidad Teorica: " + getvelocidad().toString() + "(" + getValorVelocidad() + ")" + "> " +
                        "<Combustible Teorico: " + getcombustible().toString() + "(" + getcombustible().getcombustible() + ")" + "> " +
                        "<Combustible Restante: " + getCombustibleRestante() + ">";
    }
}
