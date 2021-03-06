/**
 * Comparador de Pilotos que permite la ordenacion segun el nombre del mismo
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version 0.0
 */
public class ComparadorNombrePiloto extends ComparadorPiloto {

    /**
     * Comparador de Pilotos en funcion del nombre
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        return (p1.getNombre().compareTo(p2.getNombre()));
    }
}