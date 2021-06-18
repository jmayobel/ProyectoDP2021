/**
 * ENUM Combustible que va a usar Coche
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Combustible {
    ESCASO(350.0),
    NORMAL(440.0),
    GENEROSO(460.0),
    ELEFANTE(480.0);

    //Variables de la clase Combustible:
    private double combustible;  //Cantidad de combustible inicial

    /**
     * Constructor parametrizado para Combustible
     *
     * @param combustible Cantidad de combustible inicial
     */
    Combustible(double combustible) {
        this.combustible = combustible;
    }

    /**
     * Devuelve la cantidad inicial de combustible
     *
     * @return combustible Cantidad inicial de combustible
     */
    public double getcombustible() {
        return this.combustible;
    }
}