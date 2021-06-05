import java.lang.Math;
/**
 * Clase Coche, que contiene su nombre,velocidad y combustible.
 * 
 * @author Juan Manuel Mayo Beltrán
 * @version (a version number or a date)
 */
public class Coche implements CocheInterfaz
{
    // instance variables - replace the example below with your own
    private String nombreCoche;             //Nombre completo del Coche
    private Velocidad velocidad;            //Velocidad (Nombre de la velocidad y tamaño) que posee el coche
    private Combustible combustible;        //Combustible total del coche
    private double combustibleRestante;        //Combustible actual del coche
   // private double tiempoCarrera;

    /**
     * Constructor del coche
     * @param nombre
     * @param velocidad
     * @param combustible
     */
    public Coche(String nombre, Velocidad velocidad, Combustible combustible){
        this.nombreCoche = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.combustibleRestante = combustible.getcombustible();
    }
    
    /**
     * Set del nombre del coche
     * @param  nombre - nombre del coche
     */
    public void setnombreCoche(String nombre){
        this.nombreCoche = nombre;
    }
    
    /**
     * Set del nombre del coche
     * @param  velocidad - Velocidad del coche
     */
    public void setvelocidad(Velocidad velocidad){
         this.velocidad = velocidad;
    }
    /**
     * Set del combustible.
     * @param  combustible - combustible del coche
     */
    public void setCombustible(Combustible combustible){
        this.combustible = combustible;
    }
    
     /**
     * Set del combustible disponible
     * @param  combustibleU - Combustible que le queda al coche
     */
    public void setCombustibleRestante(double combustibleU){
        this.combustibleRestante = combustibleU;
    } 
    /**
     * Obtiene el nombre del coche
     * @return nombre - Tipo String
     */
    public String getNombreCoche() {
        return nombreCoche;
    }
    /**
     * Obtiene el enum de la velocidad del coche
     * @return velocidad - Tipo Velocidad
     */
    public Velocidad getvelocidad() {
        return velocidad;
    }
    /**
     * Devuelve el valor de la velocidad del coche
     * @return velocidad.getVelocidad() - Tipo double
     */
    public double getValorVelocidad() {
        return velocidad.getVelocidad();
    }
     /**
     * Obtiene el enum del combustible del coche
     * @return combustible - Tipo Combustible
     */
    public Combustible getcombustible()  {
        return combustible;
    }
    /**
     * Devuelve el valor del combustible del coche
     * @return combustible.getcombustible() - Tipo double    //FIXME:CAMBIAR EL COMENTARIO.
     */
    public double getValorcombustible() {
        return combustibleRestante;
    }
    
    /**
     * Devuelve la velocidad real del coche
     * @param piloto - Tipo PilotoInterfaz (El piloto de la carrera)
     * @param circuito - Tipo Circuito (El circuito de la carrera)
     * @return VelocidadReal - Tipo Double
     */
    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        return Math.round(getValorVelocidad() * piloto.getDestreza() / circuito.getValorComplejidad());
    }

    /**
     * Retorna el tiempo que dura la carrera para el piloto en el circuito
     * @param piloto - un piloto de la carrera
     * @param circuito - Un circuito
     * @return Devuelve el tiempo de la carrera
     */
    public double getTiempo(PilotoInterfaz piloto, Circuito circuito) {
        return (circuito.getValorDistancia()/getVelocidadReal(piloto, circuito))*60;
    }
    
     /**
     * Retorna el tiempo que dura la carrera para el piloto en el circuito
     * @param piloto - un piloto de la carrera
     * @param circuito - Un circuito
     * @return Combustible - Tipo Double
     */
    public void UsarCombustible(PilotoInterfaz piloto, Circuito circuito) {
     combustibleRestante = Math.round(getCombustibleRestante() - getTiempo(piloto, circuito));
    }

    public double getCombustibleRestante(){
        return combustibleRestante;

    }

    @Override
    public boolean equals(Object obj){
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
     * devuelve la informacion de la clase.
     * @return un string con la informacion de la clase.
     */
    @Override
    public String toString ()  
    {
        // put your code here
        return
        "Nombre del coche: " + getNombreCoche() + " " +
        "Combustible: " + getValorcombustible() + 
        " "+ "Velocidad: " + getValorVelocidad ();
    }
}
