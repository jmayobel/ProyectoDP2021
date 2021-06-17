import java.util.Comparator;

public class ComparadorNombreEscuderia implements Comparator<EscuderiaInterfaz> {

    public int compare(EscuderiaInterfaz e1, EscuderiaInterfaz e2) {
        return (e1.getNombre().compareTo(e2.getNombre()));
    }


}

