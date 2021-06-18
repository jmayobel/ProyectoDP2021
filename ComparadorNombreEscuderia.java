import java.util.Comparator;

/**
 * Comparador de nombre de Escuderias
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class ComparadorNombreEscuderia implements Comparator<EscuderiaInterfaz> {

    /**
     * Comparador de Escuderia en funcion del nombre
     *
     * @param  e1 Escuderia a comparar
     * @param  e2 Escuderia a ser comparada
     */
    public int compare(EscuderiaInterfaz e1, EscuderiaInterfaz e2) {
        return (e1.getNombre().compareTo(e2.getNombre()));
    }


}

