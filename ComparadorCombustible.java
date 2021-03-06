/**
 * Comparador de Coches que permite la ordenacion segun el combustible del mismo.
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorCombustible extends ComparadorCoche {

    /**
     * Comparador de Coches en funcion del combustible.
     * En caso de empate, comparara por el nombre del coche.
     *
     * @param c1 Coche a comparar
     * @param c2 Coche a ser comparado
     */
    public int compare(CocheInterfaz c1, CocheInterfaz c2) {
        if (c1.getCombustibleRestante() == c2.getCombustibleRestante())
            return (c1.getNombreCoche().compareTo(c2.getNombreCoche()));
        else if (c1.getCombustibleRestante() > c2.getCombustibleRestante())
            return 1;
        else
            return -1;
    }
}
