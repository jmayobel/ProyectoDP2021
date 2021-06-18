/**
 * La clase Resultados llevara una lista con la informacion del piloto en cada carrera,
 * entre ellas se encuentra el tiempo corrido en carrera, los puntos obtenidos,
 * y el circuito en cuestion donde se ha corrido
 *
 * @author Juan Manuel Mayo Beltran, Cesar Vazquez Lazaro, Miguel Medina Cantos
 * @version (1.0)
 */
public class Resultados {

    //Variables de la clase Resultados:
    private double tiempo;      //Tiempo que se ha mantenido el piloto en una carrera
    private int puntos;         //Puntos ganados en una carrera 

    /**
     * Constructor estandar de la clase Resultados
     */
    public Resultados() {
        this.tiempo = 0;
        this.puntos = 0;
    }

    /**
     * Constructor parametrizado de la clase Resultados
     *
     * @param tiempo Tiempo en el que el piloto ha terminado la carrera.
     *               Si el tiempo es negativo, indica los minutos que le han faltado para terminarlo
     */
    public Resultados(double tiempo) {
        this.tiempo = tiempo;
        this.puntos = 0;
    }

    /**
     * Devuelve el tiempo en el que el piloto ha terminado la carrera. Si el tiempo es negativo,
     * indica los minutos que le han faltado para terminarlo
     *
     * @return Tiempo de carrera
     */
    public double getTiempoResultados() {
        return this.tiempo;
    }

    /**
     * Establece el tiempo en el que el piloto acabo la carrera. Si el tiempo es negativo,
     * indica los minutos que le han faltado para terminarlo.
     *
     * @param tiempo Tiempo en el que acabo la carrera
     */
    public void setTiempoResultados(double tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Devuelve los puntos ganados en la carrera
     *
     * @return Puntos obtenidos
     */
    public int getPuntos() {
        return this.puntos;
    }

    /**
     * Establece los puntos ganados en esa carrera
     *
     * @param puntos Puntos obtenidos en la carrera
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Muestra por pantalla la informacion de la clase
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\n Tiempo Recorrido: " + getTiempoResultados() +
                "\n Puntos; " + getPuntos();
    }
}
