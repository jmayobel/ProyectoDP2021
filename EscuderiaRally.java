import java.util.*;
/**
 * Write a description of class EscuderiaRally here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EscuderiaRally implements Escuderia
{
    private String nomEscuderia;
    private ArrayList <PilotoInterfaz> ListaPilotos;
    private ArrayList <CocheInterfaz> ListaCoches;

    
    /**
     * Constructor for objects of class EscuderiaRally
     */
    public EscuderiaRally()
    {
        nomEscuderia="";
        ListaPilotos= new ArrayList <PilotoInterfaz> ();
        ListaCoches= new ArrayList <CocheInterfaz> ();
    }

    public ArrayList getListaPilotos () {
        
     return ListaPilotos;
        
    }    
    
    public ArrayList getListaCoches () {
        
      return ListaCoches;
    
    }     
    
    public String    getNombre () {
        
        return nomEscuderia;
        
        
    }      
    
    public void addListaPilotos (PilotoInterfaz piloto) {
          
               ListaPilotos.add(piloto);      
        
    }    
        
        
    public void addListaCoches (CocheInterfaz coche) {
        
                ListaCoches.add(coche);
    
    }
        

  
}
