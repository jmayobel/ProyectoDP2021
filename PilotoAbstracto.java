import java.util.HashMap;
/**
 * La clase Piloto representa a aquellos que competirán con un coche en los circuitos de la competición.
 * La diferencia entre cada Piloto viene marcada por la concentración del mismo, 
 * característica que marcará el rendimiento del Piloto y el Coche en el Circuito.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.1
 */
public abstract class PilotoAbstracto implements PilotoInterfaz{
    //Variables de la clase Piloto:
    
    private String nombre; //Nombre completo del Piloto
    private Coche coche; //Coche con el que correrá (Asignado por la Escudería)
    private Concentracion concentracion; //Minutos que aguanta el piloto de carrera antes de abandonar 
    private HashMap<Circuito, RegistroPiloto> registro; //Registro con el tiempo y puntos conseguidos en cada carrera
    private boolean descalificado; //"false" si NO ha sido descalificado, "true" en caso contrario

    //Constructor parametrizado
    public PilotoAbstracto(String nombre, Concentracion concentracion){ //Añadir el coche y el registro
        this.nombre = nombre;
        this.coche = null;
        this.concentracion = concentracion;
        this.registro = new HashMap<Circuito, RegistroPiloto>();
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
    public double getTiempoConcentracion(){
        return this.concentracion.getTiempo();
    }
    public HashMap<Circuito, RegistroPiloto> getRegistro(){
        return this.registro;
    }
    public boolean getDescalificado(){
        return this.descalificado;
    }
    public abstract double getDestreza();
    
    public void setCoche(Coche coche){
      this.coche = coche;
    }
    //Otros métodos
    public void descalificar(){
        this.descalificado = true;
    }
    
    //toString()
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("PILOTO: " + getNombre());
        builder.append('\n');
        //builder.append("Coche: " + getCoche());
        //builder.append('\n');
        builder.append(this.concentracion.toString());
        builder.append('\n');
        //builder.append(Muestra el registro);
        //builder.append('\n');
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
