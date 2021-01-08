import java.util.*;
/**
 * Write a description of class EscuderiaRally here.
 *
 * @author MIGUEL MEDINA Y CÉSAR VÁZQUEZ
 * @version 0.1
 */
public class EscuderiaRally implements EscuderiaInterfaz
{
    private String nomEscuderia;
    private ArrayList <PilotoInterfaz> ListaPilotos;
    private ArrayList <CocheInterfaz> ListaCoches;
    private Comparator<PilotoInterfaz> compPilotos;
    private Comparator<CocheInterfaz> compCoches;
       
    /**
     * Constructor for objects of class EscuderiaRally
     */
    public EscuderiaRally(String nomEscuderia, Comparator<PilotoInterfaz> compPilotos, Comparator<CocheInterfaz> compCoches){
        this.nomEscuderia=nomEscuderia;
        this.ListaPilotos = new ArrayList <PilotoInterfaz> ();
        this.ListaCoches = new ArrayList <CocheInterfaz> ();
        this.compPilotos = compPilotos;
        this.compCoches = compCoches;
    }

    public ArrayList getListaPilotos(){ 
        return this.ListaPilotos;     
    }    
    
    public ArrayList getListaCoches(){       
        return this.ListaCoches;    
    }     
    
    public String getNombre(){        
        return this.nomEscuderia;        
    } 
    
    public Comparator<PilotoInterfaz> getComparadorPilotos(){        
        return  this.compPilotos;        
    }         
    public Comparator<CocheInterfaz> getComparadorCoches () {        
        return  this.compCoches;        
    }
    
    public void setComparadorPilotos(Comparator<PilotoInterfaz> comparador){
        this.compPilotos = comparador;
    }    
    public void setComparadorCoches(Comparator<CocheInterfaz> comparador){
        this.compCoches = comparador;
    }
    
    public void addListaPilotos(PilotoInterfaz piloto){          
        this.ListaPilotos.add(piloto);        
    }    
    public void addListaCoches(CocheInterfaz coche){        
        this.ListaCoches.add(coche);    
    }
        
    public void eliminarPiloto(PilotoAbstracto buscado){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext() && !enc){
            PilotoInterfaz buscar = it.next();
            if(buscar.getNombre().equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    public void eliminarCoche(Coche buscado){
        Iterator<CocheInterfaz> it = this.ListaCoches.iterator(); //Inicializamos el Iterator
        boolean enc = false;
        while(it.hasNext() && !enc){
            CocheInterfaz buscar = it.next();
            if(buscar.getNombreCoche().equals(buscado)){
                enc = true;
                it.remove();
            }     
        }
    }
    
    public void eliminarListaPilotos(){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            PilotoInterfaz eliminar = it.next();
            it.remove();     
        }
    }
    public void eliminarListaCoches(){
        Iterator<CocheInterfaz> it = this.ListaCoches.iterator(); //Inicializamos el Iterator
        while(it.hasNext()){
            CocheInterfaz eliminar = it.next();
            it.remove();     
        }
    }
    public int getPuntosTotalesEscuderia(){
        Iterator<PilotoInterfaz> it = this.ListaPilotos.iterator(); //Inicializamos el Iterator
        int puntostotales = 0;
        while(it.hasNext()){
            PilotoInterfaz buscar = it.next();
            puntostotales += buscar.getPuntosTotales();   
        }
        return puntostotales;   
    }
}
