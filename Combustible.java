/**
 * ENUM Combustible que va a usar Coche
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public enum Combustible {
    ESCASO(350.0),
    NORMAL(440.0),
    GENEROSO(460.0),
    ELEFANTE(480.0);

    private double combustible;  //Cantidad de combustible disponible

    Combustible(double combustible) {
        this.combustible = combustible;
    }

    public double getcombustible() {
        return this.combustible;
    }
}