/**
 * Comparador de Coches que permite la ordenación según la velocidad del mismo.
 *
 * @author MIGUEL MEDINA Y JUANMA MAYO
 * @version 0.1
 */
public class ComparadorVelocidad extends ComparadorCoche {
    /**
     * Comparador de Coches en función de la velocidad.
     * En caso de empate, comparará por el combustible del coche.
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
