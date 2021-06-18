/**
 * Comparador de Coches que permite la ordenacion segun la velocidad del mismo
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorVelocidad extends ComparadorCoche {
    /**
     * Comparador de Coches en funcion de la velocidad.
     * En caso de empate, comparara por el combustible del coche
     *
     * @param c1 Coche a comparar
     * @param c2 Coche a ser comparado
     */
    public int compare(CocheInterfaz c1, CocheInterfaz c2) {
        if (c1.getValorVelocidad() == c2.getValorVelocidad())
            return new ComparadorCombustible().compare(c1, c2);
        else if (c1.getValorVelocidad() > c2.getValorVelocidad())
            return 1;
        else
            return -1;
    }
}
