import java.util.*;    

/**
 * Write a description of class PseudocodigoDatosCampeonatoPremioDesierto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatosCampeonatoPremioDesierto
{
    public DatosCampeonatoPremioDesierto(){        
    System.out.println("*********************************************************************************************************");
    System.out.println("****ESTA SIMULACIÓN CONCLUYE ANTES DE FINALIZAR EL CAMPEONATO CON TODOS LOS PILOTOS DESCALIFICADOS****");        
    System.out.println("*********************************************************************************************************\n");
        
    initData();
    }
    
     private void initData()
    {
        //organizador debe ser una instancia única con la siguiente configuración:
        //LimiteAbandonos=1, LimitePilotos=3, 
        // Circuitos ordenados de forma descendente de acuerdo a su distancia
   
        TreeSet CircuitoSet = new TreeSet <Circuito> (new ComparadorComplejidad());
        Organizacion organizacion = Organizacion.getInstance(1,3,CircuitoSet);
        
        //creamos y añadimos los circuitos del campeonato:
        //Crear circuito portugal con nombre:”Portugal" - complejidad:MEDIA - distancia:INTERMEDIA);
        CircuitoRally por = new CircuitoRally("Portugal",Complejidad.MEDIA,Distancia.INTERMEDIA);
        //además, acciones necesarias para que portugal sea un circuito con:
        //Gravilla y Nocturno
        Gravilla grapor= new Gravilla (por);
        Nocturno nocpor= new Nocturno (grapor);
        //añadir circuito portugal a circuitos de la organización
        organizacion.setCircuito(nocpor);

        //Crear circuito cerdena con nombre:”Cerdeña" - complejidad:ALTA - distancia:CORTA);
        CircuitoRally cer= new CircuitoRally ("Cerdeña",Complejidad.ALTA,Distancia.CORTA);
        //además, acciones necesarias para que cerdena sea un circuito con:
        //Gravilla y Mojado
        Gravilla gracer= new Gravilla (cer);
        Mojado mojcer= new Mojado (gracer);
        //añadir circuito cerdena a circuitos de la organización
        organizacion.setCircuito(mojcer);
   
        //Crear circuito australia con nombre:”Australia" - complejidad:BAJA - distancia:LARGA);
        CircuitoRally aus = new CircuitoRally("Australia",Complejidad.BAJA,Distancia.LARGA);
        //además, acciones necesarias para que australia sea un circuito con:
        //Gravilla
        Gravilla graaus= new Gravilla (aus);
        //añadir circuito australia a circuitos de la organización
        organizacion.setCircuito(graaus);

        //Crear circuito corcega con nombre:”Córcega" - complejidad:MEDIA - distancia:INTERMEDIA);
        CircuitoRally cor = new CircuitoRally("Córcega", Complejidad.MEDIA, Distancia.INTERMEDIA);
        //además, acciones necesarias para que corcega sea un circuito con:
        //Nocturno y Gravilla
        Nocturno norcor = new Nocturno(cor);
        Gravilla gracor = new Gravilla(norcor);
        //añadir circuito corcega a circuitos de la organización        
        organizacion.setCircuito(gracor);

        //Crear circuito finlandia con nombre:”Finlandia" - complejidad:ALTA - distancia:CORTA);
        CircuitoRally fin = new CircuitoRally("Finlandia", Complejidad.ALTA, Distancia.CORTA);
        //además, acciones necesarias para que finlandia sea un circuito con:
        //Nocturno, Frío y Mojado
        Nocturno norfin = new Nocturno(fin);
        Frio frfin = new Frio (norfin);
        Mojado mojfin= new Mojado (frfin);
        //añadir circuito finlandia a circuitos de la organización
        organizacion.setCircuito(mojfin);

        //Crear circuito alemania con nombre:”Alemania" - complejidad:MEDIA - distancia:INTERMEDIA);
        CircuitoRally ale = new CircuitoRally("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        //además, acciones necesarias para que alemania sea un circuito con:
        //Mojado
        Mojado mojale= new Mojado (ale);
        //añadir circuito alemania a circuitos de la organización
        organizacion.setCircuito(mojale);

        //creamos e inscribimos a las escuderías que participarán en el campeonato:    
        //Crear escuderia peugeot con nombre:"Peugeot"
        //ordenaciónPilotos: descendente por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: ascendente por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaRally peugeot = new EscuderiaRally("Peugeot",Collections.reverseOrder(new ComparadorTotalPuntos()),new ComparadorCombustible());
        //peugeot se inscribe en campeonato
        organizacion.setEscuderia(peugeot);

        //escudería citroen 
        //Crear escuderia citroen con nombre:"Citroen"      
        //ordenaciónPilotos: ascendente por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: ascendente por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaRally citroen = new EscuderiaRally ("Citroen",Collections.reverseOrder(new ComparadorTotalPuntos()),
        Collections.reverseOrder(new ComparadorCombustible()));
        //citroen se inscribe en campeonato
        organizacion.setEscuderia(citroen);

        //escudería seat       
        //Crear escuderia seat con nombre:"Seat"
        //ordenaciónPilotos: descendente por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: ascendente por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaRally seat = new EscuderiaRally ("Seat",Collections.reverseOrder(new ComparadorTotalPuntos()),new ComparadorCombustible());
        //seat se inscribe en campeonato
        organizacion.setEscuderia(seat);
        

        //coches y pilotos de seat
        //añadir a seat un CocheResistente(nombre:"Seat Tarraco" - velocidad:TORTUGA - combustible:GENEROSO);
        CocheResistente tarraco = new CocheResistente ("Seat Tarraco",Velocidad.TORTUGA,Combustible.GENEROSO);
        seat.addListaCoches(tarraco);
        //añadir a seat un CocheRapido(nombre:"Seat Ateca" - velocidad:GUEPARDO - combustible:GENEROSO);
        CocheRapido ateca = new CocheRapido ("Seat Ateca",Velocidad.GUEPARDO,Combustible.GENEROSO);
        seat.addListaCoches(ateca);
        //añadir a seat un Coche(nombre:"Seat Arona" - velocidad:RAPIDA - combustible:ESCASO);
        Coche arona = new Coche ("Seat Arona",Velocidad.RAPIDA,Combustible.ESCASO);
        seat.addListaCoches(arona);
        //añadir a seat un PilotoExperimentado(nombre:"Ogier" - concentración: NORMAL));
        PilotoExperimentado ogier = new PilotoExperimentado ("Oiger",Concentracion.NORMAL);
        seat.addListaPilotos(ogier);
        //añadir a seat un PilotoEstrella(nombre:"McRae" - concentración: CONCENTRADO));
        PilotoEstrella mcrae = new PilotoEstrella  ("McRae",Concentracion.CONCENTRADO);
        seat.addListaPilotos(mcrae);
        //añadir a seat un PilotoNovato(nombre:"Blomquist" - concentración: DESPISTADO));
        PilotoNovato blomquist = new PilotoNovato("Blomquist",Concentracion.DESPISTADO);
         seat.addListaPilotos(blomquist);
          //coches y pilotos de peugeot
        //añadir a peugeot un CocheResistente(nombre:"Peugeot 5008" - velocidad:LENTA - combustible:GENEROSO);
        CocheResistente cincomilocho = new CocheResistente ("Peugeot 5008",Velocidad.LENTA,Combustible.GENEROSO);
        peugeot.addListaCoches(cincomilocho);       
        //añadir a peugeot un CocheRapido(nombre:"Peugeot 3008" - velocidad:GUEPARDO - combustible:NORMAL);
        CocheRapido tresmilocho = new CocheRapido ("Peugeot 3008",Velocidad.GUEPARDO,Combustible.GENEROSO);
        peugeot.addListaCoches(tresmilocho);       
        //añadir a peugeot un Coche(nombre:"Peugeot 2008" - velocidad:NORMAL - combustible:ESCASO);
        Coche dosmilocho = new Coche("Peugeot 2008",Velocidad.NORMAL,Combustible.ESCASO);
        peugeot.addListaCoches(dosmilocho);       
        //añadir a peugeot un PilotoExperimentado(nombre:"Kankunnen" - concentración: CONCENTRADO));
        PilotoExperimentado kakunnen = new PilotoExperimentado ("Kankunnen", Concentracion.CONCENTRADO);
        peugeot.addListaPilotos(kakunnen);
        //añadir a peugeot un PilotoEstrella(nombre:"Sainz" - concentración: ZEN ));
        PilotoEstrella sainz = new PilotoEstrella ("Sainz", Concentracion.ZEN);
        peugeot.addListaPilotos(sainz);
        //añadir a peugeot un PilotoNovato(nombre:"Sordo" - concentración: DESPISTADO));
        PilotoNovato sordo = new PilotoNovato ("Sordo", Concentracion.DESPISTADO);
        peugeot.addListaPilotos(sordo);    
        

    }

}

