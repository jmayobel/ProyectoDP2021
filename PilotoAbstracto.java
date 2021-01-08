import java.util.Iterator;
import java.util.ArrayList;
/**
 * La clase Piloto representa a aquellos que competirán con un coche en los circuitos de la competición.
 * La diferencia entre cada Piloto viene marcada por la concentración del mismo, 
 * característica que marcará el rendimiento del Piloto y el Coche en el Circuito.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.2
 */
public abstract class PilotoAbstracto implements PilotoInterfaz{
    //Variables de la clase Piloto:
    
    private String nombre;                                  //Nombre completo del Piloto
    private Coche coche;                                    //Coche con el que correrá (Asignado por la Escudería)
    private Concentracion concentracion;                    //Minutos que aguanta el piloto de carrera antes de abandonar 
    private ArrayList<Resultados> resultados;             //Registro con el tiempo y puntos conseguidos en cada carrera
    private boolean descalificado;                          //"false" si NO ha sido descalificado, "true" en caso contrario

    //Constructor parametrizado
    public PilotoAbstracto(String nombre, Concentracion concentracion){ //Añadir el coche y el registro
        this.nombre = nombre;
        this.coche = null;
        this.concentracion = concentracion;
        this.resultados = new ArrayList<Resultados>();
        this.descalificado = false;
    }
    
    //Métodos get()
    public String getNombre(){
        return this.nombre;
    }
    public Coche getCoche(){
        return this.coche;
    }    
    public Concentracion getConcentracion(){
        return this.concentracion;
    }
    public double getTiempoConcentracion(){     //USAD ESTE SI LO QUE NECESITAIS ES EL NUMERO
        return this.concentracion.getTiempo();
    }
    public ArrayList<Resultados> getResultados(){
        return this.resultados;
    }
    public boolean getDescalificado(){
        return this.descalificado;
    }
    public abstract double getDestreza();
    
    public void setCoche(Coche coche){
      this.coche = coche;
    }
    public void descalificar(){ //Tambien llamado setDescalificado()
        this.descalificado = true;
    }
        
    //Métodos ArrayList
    public void añadirResultados(Circuito circuito, double tiempo, int puntos){
        this.resultados.add(new Resultados(circuito, tiempo, puntos));
    }
    public int getTamañoResultados(){
        return this.resultados.size();
    }
    public int getPuntosTotales(){
        Iterator<Resultados> it = this.resultados.iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while(it.hasNext()){
            Resultados buscar = it.next();
            puntostotales += buscar.getPuntos();   
        }
        return puntostotales;
    }
    public void mostrarResultados(){
        Iterator<Resultados> it = this.resultados.iterator(); //Inicializamos el Iterator        
        while(it.hasNext()){
            Resultados buscar = it.next();
            System.out.println(buscar);
        }
        System.out.println("PUNTOS TOTALES: " + getPuntosTotales());
    }    
    public void eliminarResultado(Circuito buscado){
        Iterator<Resultados> it = this.resultados.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext() && !enc){
            Resultados buscar = it.next();
            if(buscar.getCircuito().equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    public void limpiarResultados(){
        Iterator<Resultados> it = this.resultados.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            Resultados eliminar = it.next();
            it.remove();     
        }
    }
    
   
    //toString()
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("PILOTO: " + getNombre());
        builder.append('\n');
        builder.append("Coche: " + getCoche());
        builder.append('\n');
        builder.append(this.concentracion.toString());
        builder.append('\n');
        builder.append("¿Descalificado?: ");
        if(getDescalificado() == false){
            builder.append("NO");
        }
        else{
            builder.append("SÍ");
        }
        builder.append('\n');
        return builder.toString();
    }
}
