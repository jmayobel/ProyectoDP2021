import java.util.Collections;
import java.util.Comparator;

public class ComparadorEscuderia implements Comparator<EscuderiaInterfaz> {

    /**
     * Comparador de Escudería en función del total de puntos de la escudería.
     * En caso de empate, comparará por el nombre del piloto.
     *
     * @param  e1 Escuderia a comparar
     * @param  e2 Escuderia a ser comparado
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


