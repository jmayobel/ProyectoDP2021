import java.util.Collections;

public class ComparadorParrillaCarreraEntrada extends ComparadorPiloto {

    /**
     * Comparador de Pilotos en funcion del total de puntos.
     * En caso de empate, comparara por el nombre del piloto
     *
     * @param p1 Piloto a comparar
     * @param p2 Piloto a ser comparado
     */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2) {
        if (p1.getPuntosTotales() == p2.getPuntosTotales())
            return Collections.reverseOrder(new ComparadorResultado()).compare(p1, p2);
        else if (p1.getPuntosTotales() > p2.getPuntosTotales())
            return 1;
        else
            return -1;
    }
}
