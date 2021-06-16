import java.util.Collections;
import java.util.TreeSet;

/**
 * Clase que inicializa la simulación con datos con los que
 * el campeonato termina de forma normal
 *
 * @author profesores DP
 * @version 20/21
 */

public class DatosCampeonatoCompleto {
    public DatosCampeonatoCompleto() {
        System.out.println("*********************************************************************************************************");
        System.out.println("*****************ESTA SIMULACIÓN CONCLUYE NORMALMENTE COMPLETÁNDOSE TODAS LAS CARRERAS*******************");
        System.out.println("*********************************************************************************************************\n");

        initData();
    }

    private void initData() {
        //organizador debe ser una instancia única con la siguiente configuración:
        //LimiteAbandonos=3, LimitePilotos=2,
        // Circuitos ordenados de forma descendente de acuerdo a su distancia
        TreeSet CircuitoSet = new TreeSet<Circuito>(Collections.reverseOrder(new ComparadorDistancia()));
        Organizacion organizacion = Organizacion.getInstance(3, 2, CircuitoSet);

        //creamos y añadimos los circuitos del campeonato:
        //Crear circuito portugal con nombre:”Portugal" - complejidad:MEDIA - distancia:INTERMEDIA);
        Circuito por = new CircuitoRally("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        //además, acciones necesarias para que portugal sea un circuito con:
        //Gravilla y Nocturno
        Circuito grapor = new Gravilla(por);
        Circuito nocpor = new Nocturno(grapor);
        //añadir circuito portugal a circuitos de la organización
        organizacion.setCircuito(nocpor);

        //Crear circuito cerdena con nombre:”Cerdeña" - complejidad:ALTA - distancia:CORTA);
        Circuito cer = new CircuitoRally("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        //además, acciones necesarias para que cerdena sea un circuito con:
        //Gravilla y Mojado
        Circuito gracer = new Gravilla(cer);
        Circuito mojcer = new Mojado(gracer);
        //añadir circuito cerdena a circuitos de la organización
        organizacion.setCircuito(mojcer);

        //Crear circuito australia con nombre:”Australia" - complejidad:BAJA - distancia:LARGA);
        Circuito aus = new CircuitoRally("Australia", Complejidad.BAJA, Distancia.LARGA);
        //además, acciones necesarias para que australia sea un circuito con:
        //Gravilla
        Circuito graaus = new Gravilla(aus);
        //añadir circuito australia a circuitos de la organización
        organizacion.setCircuito(graaus);

        //Crear circuito corcega con nombre:”Córcega" - complejidad:MEDIA - distancia:INTERMEDIA);
        Circuito cor = new CircuitoRally("Córcega", Complejidad.MEDIA, Distancia.INTERMEDIA);
        //además, acciones necesarias para que corcega sea un circuito con:
        //Nocturno y Gravilla
        Circuito norcor = new Nocturno(cor);
        Circuito gracor = new Gravilla(norcor);
        //añadir circuito corcega a circuitos de la organización        
        organizacion.setCircuito(gracor);

        //Crear circuito finlandia con nombre:”Finlandia" - complejidad:ALTA - distancia:CORTA);
        Circuito fin = new CircuitoRally("Finlandia", Complejidad.ALTA, Distancia.CORTA);
        //además, acciones necesarias para que finlandia sea un circuito con:
        //Nocturno, Frío y Mojado
        Circuito norfin = new Nocturno(fin);
        Circuito frfin = new Frio(norfin);
        Circuito mojfin = new Mojado(frfin);
        //añadir circuito finlandia a circuitos de la organización
        organizacion.setCircuito(mojfin);

        //Crear circuito alemania con nombre:”Alemania" - complejidad:MEDIA - distancia:INTERMEDIA);
        Circuito ale = new CircuitoRally("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        //además, acciones necesarias para que alemania sea un circuito con:
        //Mojado
        Circuito mojale = new Mojado(ale);
        //añadir circuito alemania a circuitos de la organización
        organizacion.setCircuito(mojale);

        //Crear circuito chile con nombre:”Chile" - complejidad:ALTA - distancia:CORTA);
        Circuito chi = new CircuitoRally("Chile", Complejidad.ALTA, Distancia.CORTA);
        //además, acciones necesarias para que chile sea un circuito con:
        //Gravilla
        Circuito grachi = new Gravilla(chi);
        //añadir circuito chile a circuitos de la organización
        organizacion.setCircuito(grachi);

        //creamos e inscribimos a las escuderías que participarán en el campeonato:    
        //Crear escuderia peugeot con nombre:"Peugeot"
        //ordenaciónPilotos: ASCENDENTE por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: ASCENDENTE por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaInterfaz peugeot = new EscuderiaRally("Peugeot", new ComparadorTotalPuntos(), new ComparadorCombustible());
        //peugeot se inscribe en campeonato
        organizacion.setEscuderia(peugeot);

        //escudería citroen
        //Crear escuderia citroen con nombre:"Citroen"
        //ordenaciónPilotos: DESCENDENTE por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: DESCENDENTE por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaInterfaz citroen = new EscuderiaRally("Citroen", Collections.reverseOrder(new ComparadorTotalPuntos()),
                Collections.reverseOrder(new ComparadorCombustible()));
        //citroen se inscribe en campeonato
        organizacion.setEscuderia(citroen);

        //escudería seat
        //Crear escuderia seat con nombre:"Seat"
        //ordenaciónPilotos: ASCENDENTE por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
        //ordenaciónCoches: ASCENDENTE por Combustible restante del Coche , en caso de empate por nombre);
        EscuderiaInterfaz seat = new EscuderiaRally("Seat", new ComparadorTotalPuntos(), new ComparadorCombustible());
        //seat se inscribe en campeonato
        organizacion.setEscuderia(seat);

        //creamos los pilotos y los coches de cada escudería 
        //coches y pilotos de citroen
        //añadir a citroen un CocheResistente(nombre:"Citröen C5" - velocidad:RAPIDA - combustible:ELEFANTE);
        CocheInterfaz coche = new CocheResistente("Citroen C5", Velocidad.RAPIDA, Combustible.ELEFANTE);
        citroen.addListaCoches(coche);
        //añadir a citroen un CocheRapido(nombre:"Citröen C4" - velocidad:RAPIDA - combustible:ESCASO);
        CocheInterfaz c4 = new CocheRapido("Citröen C4", Velocidad.RAPIDA, Combustible.ESCASO);
        citroen.addListaCoches(c4);
        //añadir a citroen un Coche(nombre:"Citröen C3" - velocidad:RAPIDA - combustible:ESCASO);
        CocheInterfaz c3 = new CocheRapido("Citröen C3", Velocidad.RAPIDA, Combustible.ESCASO);
        citroen.addListaCoches(c3);
        //añadir a citroen un PilotoExperimentado(nombre:"Loeb" - concentración: NORMAL));
        PilotoInterfaz loeb = new PilotoExperimentado("Loeb", Concentracion.NORMAL);
        citroen.addListaPilotos(loeb);
        //añadir a citroen un PilotoEstrella(nombre:"Makinen" - concentración: ZEN));
        PilotoInterfaz makinen = new PilotoEstrella("Makinen", Concentracion.ZEN);
        citroen.addListaPilotos(makinen);
        //añadir a citroen un PilotoNovato(nombre:"Auriol" - concentración: NORMAL));
        PilotoInterfaz auriol = new PilotoNovato("Auriol", Concentracion.NORMAL);
        citroen.addListaPilotos(auriol);

        //coches y pilotos de seat
        //añadir a seat un CocheResistente(nombre:"Seat Tarraco" - velocidad:TORTUGA - combustible:GENEROSO);
        CocheInterfaz tarraco = new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO);
        seat.addListaCoches(tarraco);
        //añadir a seat un CocheRapido(nombre:"Seat Ateca" - velocidad:GUEPARDO - combustible:GENEROSO);
        CocheInterfaz ateca = new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO);
        seat.addListaCoches(ateca);
        //añadir a seat un Coche(nombre:"Seat Arona" - velocidad:RAPIDA - combustible:ESCASO);
        CocheInterfaz arona = new Coche("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO);
        seat.addListaCoches(arona);
        //añadir a seat un PilotoExperimentado(nombre:"Ogier" - concentración: NORMAL));
        PilotoInterfaz ogier = new PilotoExperimentado("Oiger", Concentracion.NORMAL);
        seat.addListaPilotos(ogier);
        //añadir a seat un PilotoEstrella(nombre:"McRae" - concentración: CONCENTRADO));
        PilotoInterfaz mcrae = new PilotoEstrella("McRae", Concentracion.CONCENTRADO);
        seat.addListaPilotos(mcrae);
        //añadir a seat un PilotoNovato(nombre:"Blomquist" - concentración: DESPISTADO));
        PilotoInterfaz blomquist = new PilotoNovato("Blomquist", Concentracion.DESPISTADO);
        seat.addListaPilotos(blomquist);


        //coches y pilotos de peugeot
        //añadir a peugeot un CocheResistente(nombre:"Peugeot 5008" - velocidad:LENTA - combustible:GENEROSO);
        CocheInterfaz cincomilocho = new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO);
        peugeot.addListaCoches(cincomilocho);
        //añadir a peugeot un CocheRapido(nombre:"Peugeot 3008" - velocidad:GUEPARDO - combustible:NORMAL);
        CocheInterfaz tresmilocho = new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL);
        peugeot.addListaCoches(tresmilocho);
        //añadir a peugeot un Coche(nombre:"Peugeot 2008" - velocidad:NORMAL - combustible:ESCASO);
        CocheInterfaz dosmilocho = new Coche("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO);
        peugeot.addListaCoches(dosmilocho);
        //añadir a peugeot un PilotoExperimentado(nombre:"Kankunnen" - concentración: CONCENTRADO));
        PilotoInterfaz kakunnen = new PilotoExperimentado("Kankunnen", Concentracion.CONCENTRADO);
        peugeot.addListaPilotos(kakunnen);
        //añadir a peugeot un PilotoEstrella(nombre:"Sainz" - concentración: ZEN ));
        PilotoInterfaz sainz = new PilotoEstrella("Sainz", Concentracion.ZEN);
        peugeot.addListaPilotos(sainz);
        //añadir a peugeot un PilotoNovato(nombre:"Sordo" - concentración: DESPISTADO));
        PilotoInterfaz sordo = new PilotoNovato("Sordo", Concentracion.DESPISTADO);
        peugeot.addListaPilotos(sordo);


        seat.OrdenarListaPilotos();
        seat.OrdenarListaCoches();

        peugeot.OrdenarListaPilotos();
        peugeot.OrdenarListaCoches();

        citroen.OrdenarListaPilotos();
        citroen.OrdenarListaCoches();

        organizacion.campeonato();
    }
}