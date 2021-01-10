/**
 * Comparador de Pilotos que permite la ordenación según la concentración del mismo.
 * @author CESAR VAZQUEZ LAZARO 
 * @version 0.0
 */
public class ComparadorTiempo
{
  /**
    * Comparador de Pilotos en función del tiempo de carrera.
    * En caso de empate, comparará por el nombre del piloto.
    * 
    * @param p1 Piloto a comparar
    * @param p2 Piloto a ser comparado
    */
    public int compare(PilotoInterfaz p1, PilotoInterfaz p2, Circuito circuito){
        if(p1.buscarResultado(circuito)==p2.buscarResultado(circuito))
            return new ComparadorNombrePiloto().compare(p1, p2);
        else if(p1.getTiempoConcentracion()>p2.getTiempoConcentracion())
            return 1;
        else
            return -1;
  }  
}
