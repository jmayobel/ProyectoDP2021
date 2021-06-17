import java.util.Collections;
import java.util.Comparator;

public class ComparadorCarrerasTerminadas implements Comparator<EscuderiaInterfaz> {
    public int compare(EscuderiaInterfaz e1, EscuderiaInterfaz e2) {
        if (e1.getCarrerasTerminadasEsc() == e2.getCarrerasTerminadasEsc())
            return Collections.reverseOrder(new ComparadorNombreEscuderia()).compare(e1, e2);
        else if (e1.getCarrerasTerminadasEsc() > e2.getCarrerasTerminadasEsc())
            return 1;
        else
            return -1;
    }
}
