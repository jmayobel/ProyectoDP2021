import java.util.Collections;
import java.util.Comparator;

/**
 * Encapsulacion de comparadores
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorEscuderia implements Comparator<EscuderiaInterfaz> {

    /**
     * Comparador de Escuderia en funcion del total de puntos de la escuderia.
     * En caso de empate, comparara por el nombre del piloto.
     *
     * @param  e1 Escuderia a comparar
     * @param  e2 Escuderia a ser comparada
     */
    public int compare(EscuderiaInterfaz e1, EscuderiaInterfaz e2) {
        if (e1.getPuntosTotalesEscuderia() == e2.getPuntosTotalesEscuderia())
            return Collections.reverseOrder(new ComparadorCarrerasTerminadas()).compare(e1, e2);
        else if (e1.getPuntosTotalesEscuderia() > e2.getPuntosTotalesEscuderia())
            return 1;
        else
            return -1;
    }


}


