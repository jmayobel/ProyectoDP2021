
/**
 * RegistroPiloto llevará una lista con la información del piloto en cada carrera,
 * entre ellas se encuentra el tiempo corrido en carrera, los puntos obtenidos,
 * y el circuito en cuestión donde se ha corrido.
 * 
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class RegistroPiloto{
    private Circuito circuito;  //Circuito en el que el piloto correrá la carrera
    private double tiempo;      //Tiempo que se ha mantenido el piloto en una carrera
    private int puntos;         //Puntos ganados en una carrera 
    
    //Constructor por defecto
    public RegistroPiloto(){
        this.circuito = null;
        this.tiempo = 0;
        this.puntos = 0;
    }
    
    //Constructor parametrizado
    public RegistroPiloto(Circuito circuito, double tiempo, int puntos){
        this.circuito = circuito;
        this.tiempo = tiempo;
        this.puntos = puntos;
    }
    
    //Métodos get()/ set()
    public Circuito getCircuito(){
        return this.circuito;
    }
    public double getTiempoRegistro(){
        return this.tiempo;
    }
    public int getPuntos(){
        return this.puntos;
    }
       
    public void setCircuito(Circuito circuito){
        this.circuito = circuito ;
    }
    public void setTiempoRegistro(double tiempo){
        this.tiempo = tiempo;
    }
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }  
    
    //Método toString()
    @Override
    public String toString(){
       return getClass().getSimpleName() + 
        "\n Circuito: " + getCircuito() + 
        "\n Tiempo Recorrido: " + getTiempoRegistro() +
        "\n Puntos; " + getPuntos();

    }
}
