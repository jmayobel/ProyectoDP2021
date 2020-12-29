
/**
 * Write a description of class RegistroPiloto here.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class RegistroPiloto{
    private double tiempo;      //Tiempo que se ha mantenido el piloto en una carrera
    private int puntos;         //Puntos ganados en una carrera
    private int totalpuntos;    //Puntuación total del piloto en la competición    
    
    
    /**
     * Constructor for objects of class Registro
     */
    public RegistroPiloto(){
        this.tiempo = 0;
        this.puntos = 0;
        this.totalpuntos = 0;
    }
    
    //Métodos get()/ set()
    public double getTiempoRegistro(){
        return this.tiempo;
    }
    public int getPuntos(){
        return this.puntos;
    }
    public int getTotalPuntos(){
        return this.totalpuntos;
    }
    
    public void setTiempoRegistro(double tiempo){
        this.tiempo = tiempo;
    }
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    public void setTotalPuntos(int totalpuntos){
        this.totalpuntos = totalpuntos;
    }
}
