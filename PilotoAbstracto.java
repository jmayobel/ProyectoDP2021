import java.util.*;

/**
 * La clase Piloto representa a aquellos que competirán con un coche en los circuitos de la competición.
 * La diferencia entre cada Piloto viene marcada por la concentración del mismo,
 * característica que marcará el rendimiento del Piloto y el Coche en el Circuito.
 *
 * @author Juan Manuel Mayo Beltran, César Vázquez Lazaro, Miguel Medina Cantos
 * @version 1.0
 */
public abstract class PilotoAbstracto implements PilotoInterfaz {
    //Variables de la clase Piloto:    
    private String nombre;                                  //Nombre completo del Piloto
    private CocheInterfaz coche;                            //Coche con el que correrá (Asignado por la Escudería)
    private Concentracion concentracion;                    //Minutos que aguanta el piloto de carrera antes de abandonar 
    private LinkedHashMap<String, Resultados> resultados;   //Registro con el tiempo y puntos conseguidos en cada carrera
    private boolean descalificado;                          //"false" si NO ha sido descalificado, "true" en caso contrario
    private int nAbandonos;                                 //Número de abandonos que el piloto ha tenido durante la competición

    /**
     * Constructor parametrizado de la clase Piloto.
     *
     * @param nombre        Nombre de pila del piloto.
     * @param concentracion Tipo de Concentración (DESPISTADO, NORMAL, CONCENTRADO, ZEN) del piloto.
     *                      Será el tiempo en minutos que el piloto mantiene la concentración
     *                      antes de abandonar la carrera.
     */
    public PilotoAbstracto(String nombre, Concentracion concentracion) { //Añadir el coche y el registro
        this.nombre = nombre;
       // this.coche = null;
        this.concentracion = concentracion;
        this.resultados = new LinkedHashMap<String, Resultados>(); // la clave será el nombre del circuito
        this.descalificado = false;
        this.nAbandonos = 0;
    }

    //Métodos get()/set()
    /**
     * Devuelve el nombre del piloto.
     *
     * @return Nombre del piloto.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el coche que conducirá el piloto.
     *
     * @return Coche que conduce el piloto.
     */
    public CocheInterfaz getCoche() {
        return this.coche;
    }

    /**
     * Establece el coche con el que correrá el piloto.
     *
     * @param coche El coche que usará el piloto.
     */
    public void setCoche(CocheInterfaz coche) {
        this.coche = coche;
    }

    /**
     * Devuelve el Tipo de Concentración.
     *
     * @return ENUM Concentracion(String nombre, double tiempo).
     */
    public Concentracion getConcentracion() {
        return this.concentracion;
    }

    /**
     * Devuelve el tiempo de concentración del piloto.
     *
     * @return Tiempo de concentración (en minutos) que aguantará el piloto antes de abandonar la carrera.
     */
    public double getTiempoConcentracion() {     //USAD ESTE SI LO QUE NECESITAIS ES EL NUMERO
        return this.concentracion.getTiempo();
    }

    /**
     * Devuelve el registro completo con los resultados del piloto en cada carrera.
     *
     * @return Lista con los resultados de cada carrera.
     */
    public HashMap<String, Resultados> getResultados() {
        return this.resultados;
    }

    /**
     * Devuelve si el piloto ha sido descalificado de la competición.
     *
     * @return boolean "true" en caso de que el piloto esté descalificado, "false" en caso contrario.
     */
    public boolean getDescalificado() {
        return this.descalificado;
    }

    /**
     * Devuelve la cantidad de veces que el piloto ha abandonado la carrera.
     *
     * @return Número de veces que el piloto ha abandonado.
     */
    public int getAbandonos() {
        return this.nAbandonos;
    }

    /**
     * Método que usan los hijos para calcular la destreza del piloto dependiendo del tipo de Piloto.
     *
     * @return Destreza del piloto.
     */
    public abstract double getDestreza();

    /**
     * Devuelve el tamaño de la lista del registro del piloto.
     *
     * @return int Tamaño del registro.
     */
    public int getTamañoResultados() {
        return this.resultados.size();
    }

    /**
     * Descalifica al piloto, negándole a seguir participando en la competición.
     */
    public void descalificar() { //También llamado setDescalificado()

        System.out.println(this.getNombre() + " HA SIDO DESCALIFICADO");
        this.descalificado = true;
    }

    /**
     * Añade un abandono al piloto en cuestión.
     */
    public void abandonar() {
        this.nAbandonos++;
    }

    //Métodos HashMap

    /**
     * Añade nueva información al registro de resultados.
     *
     * @param circuito Circuito en el que el piloto ha corrido.
     * @param tiempo   Tiempo en el que el piloto ha terminado la carrera.
     *                 Si el tiempo es negativo, indica los minutos que le han faltado para terminarlo.
     */
    public void añadirTiempo(Circuito circuito, double tiempo) {
        this.resultados.put(circuito.getNombreCircuito(), new Resultados(tiempo));
    }

    /**
     * Añade los puntos dados dado un circuito concreto.
     *
     * @param circuito Circuito en el que el piloto ha corrido.
     * @param puntos Puntos que el piloto ha ganado en esa carrera.
     */
    public void añadirPuntos(Circuito circuito, int puntos) {

        Resultados resultado = resultados.get(circuito.getNombreCircuito());
        int puntosAct = resultado.getPuntos() + puntos;
        resultados.remove(circuito.getNombreCircuito());
        resultado.setPuntos(puntosAct);
        resultados.put(circuito.getNombreCircuito(), resultado);

    }

    /**
     * Busca el tiempo que se hizo dado un circuito en específico.
     *
     * @param buscado Circuito del que se desea obtener el tiempo.
     */
    public double buscarResultado(Circuito buscado) { //getTiempoResultado()
        double tiempo = 0;

        tiempo = resultados.get(buscado.getNombreCircuito()).getTiempoResultados();

        return tiempo;
    }

    /**
     * Devuelve la cantidad de carreras que el piloto ha conseguido terminar.
     *
     * @return int Numero de carreras terminadas.
     */
    @Override
    public int getCarrerasTerminadas() {
        int cont = 0;
        Map<String, Resultados> res = resultados;
        for (Map.Entry<String, Resultados> entry : res.entrySet())
        {
            if(entry.getValue().getTiempoResultados() > 0){
                cont++;
            }
        }
        return cont;
    }

    /**
     * Devuelve el total de puntos que ha conseguido el piloto en toda la competición.
     *
     * @return int Puntos totales del piloto.
     */
    public int getPuntosTotales() {
        Iterator<String> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while (it.hasNext()) {
            String key = it.next();
            Resultados valor = this.resultados.get(key);
            puntostotales += valor.getPuntos();
        }

        return puntostotales;
    }

    /**
     * Devuelve los puntos obtenidos en la última carrera corrida por el piloto.
     *
     * @return double Tiempo de la última carrera corrida.
     */
    public double getTiempoUltimoCircuito() {
        Iterator<String> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        double tiempo = 0;
        String key = null;
        while (it.hasNext()) {
            key = it.next();
        }
        Resultados valor = this.resultados.get(key);
        tiempo = valor.getTiempoResultados();
        return tiempo;
    }

    /**
     * Imprime por pantalla los resultados del piloto en toda la competición.
     */
    public void mostrarResultados() {
        Iterator<String> it = this.resultados.keySet().iterator(); //Inicializamos el Iterator
        while (it.hasNext()) {
            String key = it.next();
            Resultados res= resultados.get(key);
            System.out.println("Carrera: " +"("+ key +")"+  " - Puntos: " + res.getPuntos() + " - Tiempo: " + res.getTiempoResultados());
        }
    }

    //Otros métodos
    /**
     * Desarrollo de la carrera, en él se calculará si el piloto consigue acabarla o no.
     *
     * @param  circuito Circuito en el que se correrá la carrera.
     */

    public void conducirCoche(Circuito circuito) {
        double tiempousado, resultado;
        CocheInterfaz coche = getCoche();
        double tiempoCarrera = Math.round(coche.getTiempo(this, circuito)*100d)/100d;

        if (this.getTiempoConcentracion() < tiempoCarrera) {

            resultado = getTiempoConcentracion() - tiempoCarrera; //EL TIEMPO QUE LE HA FALTADO ANTES DE TERMINAR LA CARRERA
            resultado = Math.round((resultado*100d))/100d;
            tiempousado = tiempoCarrera + resultado; //TIEMPO QUE HA HECHO ANTES DE QUEDAR DESCALIFICADO
            tiempousado = Math.round(tiempousado*100d)/100d;
            this.añadirTiempo(circuito, resultado);
            coche.UsarCombustible(tiempousado);
            System.out.println("!!!!!! MOTIVO DE ABANDONO: " + this.getNombre() + " perdió la concentración a " + -resultado + " minutos de acabar la carrera. !!!!!!");
            System.out.println("!!!!!! Llevaba en la carrera " + tiempousado + " minutos en el momento del despiste. !!!!!!");
            abandonar();
        }
        else {
            if (coche.getCombustibleRestante() < tiempoCarrera) {
                resultado = coche.getCombustibleRestante() - tiempoCarrera; //EL TIEMPO QUE LE HA FALTADO ANTES DE TERMINAR LA CARRERA
                resultado= Math.round((resultado*100d))/100d;
                tiempousado = tiempoCarrera + resultado; //TIEMPO QUE HA HECHO ANTES DE QUEDAR DESCALIFICADO
                tiempousado = Math.round(tiempousado*100d)/100d;
                coche.UsarCombustible(tiempousado);
                if (coche.getCombustibleRestante() > 0) {
                    this.añadirTiempo(circuito, resultado);
                } else {
                    this.añadirTiempo(circuito, resultado);
                    System.out.println("!!!!!! MOTIVO DE ABANDONO: El "+ coche.getNombreCoche() +" se quedó sin combustible a falta de "+ -resultado +"  minutos para terminar !!!!!!");
                    System.out.println("¡¡¡En el momento de quedarse sin combustible llevaba en carrera " + tiempousado + " minutos !!!");
                    abandonar();
                }

            } else {
                 resultado = tiempoCarrera; //EL TIEMPO QUE HA NECESITADO PARA TERMINAR LA CARRERA
                resultado = Math.round((resultado*100d))/100d;

                this.añadirTiempo(circuito, resultado);
                coche.UsarCombustible(resultado);
            }
        }
        System.out.println("++++ El combustible que le queda al " + coche.getNombreCoche() + " es de " + coche.getCombustibleRestante() + " ++++");
    }

    /**
     * Muestra por pantalla la información de la clase.
     *
     * @return Concatenacion con la informacion de la clase
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<Piloto: " + getNombre() + ">");
        builder.append(' ');
        builder.append("<Tipo: " + this.getClass().getName() + ">");
        builder.append(' ');
        builder.append("<"+this.concentracion.toString()+">");
        builder.append(' ');
        builder.append("<Destreza: "  + this.getDestreza()+">");
        builder.append(' ');
        builder.append("<PUNTOS TOTALES: "+getPuntosTotales()+">");
        builder.append(' ');
        builder.append("<¿Descalificado?: ");
        if (getDescalificado() == false) {
            builder.append("NO>");
        } else {
            builder.append("SÍ>");
        }
        return builder.toString();
    }

    /**
     * Devuelve si el objeto pasado por parametro es el mismo con el que comparamos
     *
     * @return boolean "True" si el objeto pasado es el mismo que el que comparamos,
     *                 "False" en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PilotoInterfaz)) {
            return false;
        }

        PilotoInterfaz other = (PilotoInterfaz) obj;

        return super.equals(other) && this.getNombre().equals(other.getNombre());
    }

    /**
     * Devuelve el codigo hash del objeto
     *
     * @return int Codigo hashCode del objeto
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 7 * result + getNombre().hashCode();
        result = 17 * result + getConcentracion().hashCode();

        return result;
    }
}
