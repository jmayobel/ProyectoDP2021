/**
 * Clase Coche, que contiene su nombre, velocidad y combustible.
 *
 * @author Juan Manuel Mayo Beltrán
 * @version (1.0)
 */
public class Coche implements CocheInterfaz {
    //Variables de la clase Coche:
    private String nombreCoche;             //Nombre completo del Coche
    private Velocidad velocidad;            //Velocidad (Nombre de la velocidad y tamaño) que posee el coche
    private Combustible combustible;        //Combustible total del coche
    private double combustibleRestante;        //Combustible actual del coche
    // private double tiempoCarrera;

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
     * @param  nombre - Nombre del coche
     */
    public void setnombreCoche(String nombre) {
        this.nombreCoche = nombre;
    }

    /**
     * Set del nombre del coche
     *
     * @param velocidad - Velocidad del coche
     */
    public void setvelocidad(Velocidad velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Set del combustible.
     *
     * @param combustible - combustible del coche
     */
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene el nombre del coche
     *
     * @return nombre - Tipo String
     */
    public String getNombreCoche() {
        return nombreCoche;
    }

    /**
     * Obtiene el enum de la velocidad del coche
     *
     * @return velocidad - Tipo Velocidad
     */
    public Velocidad getvelocidad() {
        return velocidad;
    }

    /**
     * Devuelve el valor de la velocidad del coche
     *
     * @return velocidad.getVelocidad() - Tipo double
     */
    public double getValorVelocidad() {
        return velocidad.getVelocidad();
    }

    /**
     * Obtiene el enum del combustible del coche
     *
     * @return combustible - Tipo Combustible
     */
    public Combustible getcombustible() {
        return combustible;
    }

    /**
     * Devuelve el valor del combustible del coche
     *
     * @return combustible.getcombustible() - Tipo double    //FIXME:CAMBIAR EL COMENTARIO.
     */
    public double getValorcombustible() {
        return combustibleRestante;
    }

    /**
     * Devuelve la velocidad real del coche
     *
     * @param piloto   - Tipo PilotoInterfaz (El piloto de la carrera)
     * @param circuito - Tipo Circuito (El circuito de la carrera)
     * @return VelocidadReal - Tipo Double
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
    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    /**
     * Set del combustible disponible
     *
     * @param combustibleU - Combustible que le queda al coche
     */
    public void setCombustibleRestante(double combustibleU) {
        this.combustibleRestante = combustibleU;
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
        // put your code here
        return
                "<Nombre del coche: " + getNombreCoche() + "> " +
                        "<Tipo: " + this.getClass().getName() + "> " +
                        "<Combustible: " + getValorcombustible() +
                        "> " + "<Velocidad: " + getValorVelocidad() + ">";
    }
}
