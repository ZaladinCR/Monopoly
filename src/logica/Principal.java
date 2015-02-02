/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author curso
 */
public class Principal {
    
    public static ArrayList<Casilla> listaCasillas = new ArrayList<Casilla>();
    public static ArrayList<Tarjeta> listaTarjetasSuerte = new ArrayList<Tarjeta>();
    public static ArrayList<Tarjeta> listaTarjetasComunidad = new ArrayList<Tarjeta>();
    public static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    public static Jugador jugadorActual=null;
    public static int indiceTarjetaComu=-1;
    public static int indiceTarjetaSuert=-1;
    
    
    
    
    public static void cargarCasillas() {
        Casilla inicio = new Casilla("Inicio", "Inicio", 0);
        listaCasillas.add(inicio);
        Costos NCosto = new Costos(10, 30, 90, 160, 250);
        Lugar rondaValencia = new Lugar(NCosto,4, 60, 30, "Ronda de valencia","Lugar", "café", 50, 50, 1);
        listaCasillas.add(rondaValencia);
        Casilla  comunidad1 = new Casilla("Caja de comunidad1", "Comunidad", 2);
        listaCasillas.add(comunidad1);
        NCosto = new Costos(20, 60, 180, 320, 450);
        Lugar plazaLavapies = new Lugar(NCosto,4, 60, 30, "Plaza lavapiés", "Lugar", "café", 50, 40, 3);
        listaCasillas.add(plazaLavapies);
        Impuesto impestCapial = new Impuesto("Impuesto sobre el capital", "Impuesto", 4, 60);
        listaCasillas.add(impestCapial);
        Propiedad ferrocarril1 = new Propiedad(25, 200, 100, "Estación de Goya", "Ferrocarril", 5);
        listaCasillas.add(ferrocarril1);
        NCosto = new Costos(30, 90, 270, 400, 550);
        Lugar glorie4Caminos = new Lugar(NCosto,6, 100, 50, "Glorieta Cuatro Caminos", "Lugar", "celeste", 50, 50, 6);
        listaCasillas.add(glorie4Caminos);
        Casilla suerte1 = new Casilla("Suerte", "Suerte", 7);
        listaCasillas.add(suerte1);
        NCosto = new Costos(30, 90, 270, 400, 550);
        Lugar avenidaReinVictoria = new Lugar(NCosto,6, 100, 50, "Avenida Reina Victoria", "Lugar", "celeste", 50, 50, 8);
        listaCasillas.add(avenidaReinVictoria);
        NCosto = new Costos(40, 100, 300, 450, 600);
        Lugar calleBravMurill = new Lugar(NCosto,8, 120, 60, "Calle Bravo", "Lugar", "celeste", 50, 50, 9);
        listaCasillas.add(calleBravMurill);
        Casilla carcel = new Casilla("Cárcel", "Cárcel", 10);
        listaCasillas.add(carcel);
        NCosto = new Costos(50, 150, 450, 625, 750);
        Lugar glorieBilbao = new Lugar(NCosto,10, 140, 70, "Glorieta de Bilbao", "Lugar", "fuchsia", 100, 100, 11);
        listaCasillas.add(glorieBilbao);
        Propiedad servElectri = new Propiedad(0, 2, 75, "Compañía de electricidad", "Servicio", 12);
        listaCasillas.add(servElectri);
        NCosto = new Costos(50, 150, 450, 625, 750);
        Lugar calleAlbertAguilera = new Lugar(NCosto,10, 140, 70, "Calle Alberto Aguilera", "Lugar", "fuchsia", 100, 100, 13);
        listaCasillas.add(calleAlbertAguilera);
        NCosto = new Costos(60, 180, 500, 700, 900);
        Lugar calleFuencarral = new Lugar(NCosto,12, 160, 80, "Calle Fuencarral", "Lugar", "fuchsia", 100, 100, 14);
        listaCasillas.add(calleFuencarral);
        Propiedad ferrocarril2 = new Propiedad(25, 200, 100, "Estación de las delicias", "Ferrocarril", 15);
        listaCasillas.add(ferrocarril2);
        NCosto = new Costos(70, 200, 550, 750, 750);
        Lugar avenidFelipeII = new Lugar(NCosto,14, 180, 90, "Avenida Felipe II", "Lugar", "naranja", 100, 100, 16);
        listaCasillas.add(avenidFelipeII);
        Casilla comunidad2 = new Casilla("Caja de comunidad", "Comunidad", 17);
        listaCasillas.add(comunidad2);
        NCosto = new Costos(70, 200, 550, 750, 950);
        Lugar callVelazquez = new Lugar(NCosto,14, 180, 90, "Calle Velázquez", "Lugar", "naranja", 100, 100, 18);
        listaCasillas.add(callVelazquez);
        NCosto = new Costos(80, 220, 600, 800, 1000);
        Lugar callSerrano = new Lugar(NCosto,16, 200, 100, "Calle Serrano", "Lugar", "naranja", 100, 100, 19);
        listaCasillas.add(callSerrano);
        Casilla parqueo = new Casilla("Parqueo", "Parqueo", 20);
        listaCasillas.add(parqueo);
        NCosto = new Costos(90, 250, 700, 875, 1050);
        Lugar avenAmerica = new Lugar(NCosto,18, 220, 110, "Avenida de América", "Lugar", "rojo", 150, 150, 21);
        listaCasillas.add(avenAmerica);
        Casilla suerte2 = new Casilla("Suerte2", "suerte", 22);
        listaCasillas.add(suerte2);
        NCosto = new Costos(90, 250, 700, 875, 1050);
        Lugar callMariMoli = new Lugar(NCosto,18, 220, 110, "Calle María de Molina", "Lugar", "rojo", 150, 150, 23);
        listaCasillas.add(callMariMoli);
        NCosto = new Costos(100, 300, 750, 925, 1100);
        Lugar callCeaBerm = new Lugar(NCosto,20, 240, 120, "Calle CEA Bermúdez", "Lugar", "rojo", 150, 150, 24);
        listaCasillas.add(callCeaBerm);
        Propiedad ferrocarril3 = new Propiedad(25, 200, 100, "Estación del mediodía", "Ferrocarril", 25); // renta, costo, hipoteca
        listaCasillas.add(ferrocarril3);
        NCosto = new Costos(110, 330, 800, 975, 1150);
        Lugar avenLosReyCato = new Lugar(NCosto,22, 260, 130, "Avanida de los reyes católicos", "Lugar", "amarillo", 150, 150, 26);
        listaCasillas.add(avenLosReyCato);
        NCosto = new Costos(110, 330, 800, 975, 1150);
        Lugar callBailen = new Lugar(NCosto,22, 260, 130, "Calle Bailén", "Lugar", "amarillo", 150, 150, 27);
        listaCasillas.add(callBailen);
        Propiedad servicio2 = new Propiedad(0, 150, 75, "Compañía de aguas", "Servicio", 28);
        listaCasillas.add(servicio2);
        NCosto = new Costos(120, 360, 850, 1025, 1200);
        Lugar plazaEspana = new Lugar(NCosto,24, 280, 140, "Plaza de España", "Lugar", "amarillo", 150, 150, 29);
        listaCasillas.add(plazaEspana);
        Casilla VeACarcel = new Casilla("Ve a la carcel", "Ir a carcel", 30);
        listaCasillas.add(VeACarcel);
        NCosto = new Costos(130, 390, 900, 1100, 1275);
        Lugar puertaSol = new Lugar(NCosto,26, 300, 150, "Puerta del sol", "Lugar", "verde", 200, 200, 31);
        listaCasillas.add(puertaSol);
        NCosto = new Costos(130, 390, 900, 1100, 1275);
        Lugar callAlcala = new Lugar(NCosto,26, 300, 150, "Calle Alcalá", "Lugar", "verde", 200, 200, 32);
        listaCasillas.add(callAlcala);
        Casilla comunidad3 = new Casilla("Caja de comunidad", "Comunidad", 33);
        listaCasillas.add(comunidad3);
        NCosto = new Costos(150, 450, 1000, 1200, 1400);
        Lugar granVia = new Lugar(NCosto,28, 320, 160, "Gran Vía", "Lugar", "verde", 200, 200, 34);
        listaCasillas.add(granVia);
        Propiedad ferrocarril4 = new Propiedad(25, 200, 100, "Estación del norte", "Ferrocarril", 35);
        listaCasillas.add(ferrocarril4);
        Casilla suerte3 = new Casilla("Suerte", "Suerte", 36);
        listaCasillas.add(suerte3);
        NCosto = new Costos(175, 500, 1100, 1300, 1500);
        Lugar paseoCaste = new Lugar(NCosto,35, 350, 175, "Paseo de la castellana", "Lugar", "azul", 200, 200, 37);
        listaCasillas.add(paseoCaste);
        Impuesto impuestoLujo = new Impuesto("Impuesto de lujo", "Impuesto", 38, 100);
        listaCasillas.add(impuestoLujo);
        NCosto = new Costos(200, 600, 1400, 1700, 2000); 
        Lugar paseoPrado = new Lugar(NCosto,50, 400, 200, "Paseo del prado", "Lugar", "azul", 200, 200, 39);
        listaCasillas.add(paseoPrado);
    }
    
    public static String retTipoCasilla(int indice) {
        Casilla casilla = listaCasillas.get(indice);
        return casilla.getTipo(); 
    }
    
    public static void moverJugador(int Nposicion) {
        int posicionActual=jugadorActual.getPosicion();
        int nuevaPosicion= posicionActual+Nposicion;
        if(nuevaPosicion>39) {
            posicionActual=nuevaPosicion-39;
        }
        jugadorActual.setPosicion(posicionActual);
    }
    
    //Para comoprar una propiedad, sea lugar, ferrocarril u  otro
    public static void ConsultarSiCompra(Lugar lugar) {
        //Desea comprar??
        boolean respuesta=true;
        if(respuesta==true)
        {
            lugar.setComprado(respuesta);
            lugar.setDueno(jugadorActual);
            listaCasillas.set(lugar.getPosicion(), lugar);
        }
    }
    
    public static void cobrarCasaHipoteca(Lugar lugarA) {
        int numeroCasas = lugarA.getNumCasas();
        int numeroHoteles = lugarA.getNumHoteles();
        int costoCasa = lugarA.getCostoCasas();
        int costoHotel = lugarA.getCostoHotel();
        
        int montoSuma = numeroCasas*costoCasa;
        montoSuma = montoSuma+numeroHoteles*costoHotel;
        int montoJugador = jugadorActual.getMonto();
        montoJugador = montoJugador + montoSuma;
        jugadorActual.setMonto(montoJugador);
        
    }
    
    
    
    public static void hipotecarPropiedades() {
        
        for(Casilla casilla : listaCasillas) {
            if(casilla instanceof Lugar) {
                Lugar lugarA = (Lugar) casilla;
                if(!lugarA.isHipotecada()) {
                    if(lugarA.getDueno().equals(jugadorActual)) {
                        lugarA.setHipotecada(true);
                        cobrarCasaHipoteca(lugarA);
                        int montoJugadorAc = jugadorActual.getMonto();
                        montoJugadorAc = montoJugadorAc+lugarA.getCostoHipoteca();
                        jugadorActual.setMonto(montoJugadorAc);
                    }
                }
            }
        }
    }
    
    
    
    
    
    
    
    public static void realizarCobro(Lugar plugar, Jugador pduenoLugar) {
        int numeroCasas = plugar.getNumCasas();
        int numeroHoteles = plugar.getNumHoteles();
        int MontoAcobrar=0;
        Costos Dlugar;
        int montoCasa;
        switch(numeroCasas){
            case 0:
                MontoAcobrar+=plugar.getRenta();
                break;
            case 1:
                Dlugar=plugar.getCosto();
                montoCasa = Dlugar.getP1Casas();
                MontoAcobrar+=montoCasa;
                break;
            case 2:
                Dlugar=plugar.getCosto();
                montoCasa = Dlugar.getP2Casas();
                MontoAcobrar+=montoCasa;
                break;
            case 3:
                Dlugar=plugar.getCosto();
                montoCasa = Dlugar.getP3Casas();
                MontoAcobrar+=montoCasa;
                break;
            case 4:
                Dlugar=plugar.getCosto();
                montoCasa = Dlugar.getP4Casas();
                MontoAcobrar+=montoCasa;
                break;
        }
        switch(numeroHoteles){
            case 1:
                Dlugar=plugar.getCosto();
                montoCasa = Dlugar.getP1Hotel();
                MontoAcobrar+=montoCasa;
        }
        int montoJugadorActual=jugadorActual.getMonto();
        montoJugadorActual = montoJugadorActual-MontoAcobrar;
        if(montoJugadorActual>0) {
            jugadorActual.setMonto(montoJugadorActual);
        }
        else {
            while(montoJugadorActual<0) {
                hipotecarPropiedades();
            }
        }
        
        int montopDueno = pduenoLugar.getMonto();
        montopDueno = montopDueno+MontoAcobrar;
        pduenoLugar.setMonto(montopDueno);
        if(montoJugadorActual<0) {
                EliminarJugador(jugadorActual.getFicha());
                verificarGanador();
            }
    }
    
    //EN CASO DE SER UN FERROCARRIL
    public static void accionesFerrocarril(Propiedad propiedad) {
        if(!propiedad.isComprado()) {
            //preguntar si dese a comprar
            boolean respuesta=true;
            if(respuesta) {
                propiedad.setComprado(respuesta);
                int posicion=listaCasillas.indexOf(propiedad);
                listaCasillas.set(posicion, propiedad);
            }
        }
        else if(!propiedad.isHipotecada()) {
            int cantidadDPropieta = retCantidadDpropieta(propiedad);
            int renta = propiedad.getRenta();
            int monto=0;
            switch(cantidadDPropieta) {
                case 1:
                    monto = renta;
                    break;
                case 2:
                    monto = renta*2;
                    break;
                case 3:
                    monto = renta*4;
                    break;
                case 4: 
                    monto = renta*8;
                    break;
                
            }
            Jugador pDueno = propiedad.getDueno();
            int montoDueno = pDueno.getMonto();
            montoDueno = montoDueno + monto;
            pDueno.setMonto(montoDueno);
            int montoJugadorActual = jugadorActual.getMonto();
            montoJugadorActual = montoJugadorActual-monto;
            jugadorActual.setMonto(montoJugadorActual);
            if(montoJugadorActual<0) {
                hipotecarPropiedades();
            }
        }
    }
    
    public static int retCantidadDpropieta(Propiedad propiedad) {
        Jugador pDueno = propiedad.getDueno();
        int contadorFerro=0;
        for(Casilla casilla : listaCasillas) {
            if(casilla instanceof Propiedad) {
                Propiedad Npropiedad = (Propiedad) casilla;
                if(Npropiedad.getDueno().equals(pDueno)) {
                    if(Npropiedad.getTipo().equals("Ferrocarril")) {
                        contadorFerro++;
                    }
                }
            }
        }
        return contadorFerro;
    }
    
    
    //LISTA DE ACCIONES EN CASO DE SER UN LUGAR
    public static void accionesLugar(Lugar lugar) {
        if(!lugar.isComprado()) {
            ConsultarSiCompra(lugar);
        }
        else {
            Jugador duenoLugar = lugar.getDueno();
            if(!lugar.isHipotecada()) {
                realizarCobro(lugar, duenoLugar);
            }       
        }
        
    }
    
    public static int retCantidadServicios(Jugador pDueno) {
        int contadorServicios=0;
        for(Casilla casilla : listaCasillas) {
            if(casilla instanceof Propiedad) {
                Propiedad servicio = (Propiedad) casilla;
                if(servicio.getTipo().equals("servicio")) {
                    if(pDueno.equals(servicio.getDueno())){
                        contadorServicios++;
                    }
                }
            }
        }
        return contadorServicios;
    }
    
    
    public static void accionesServicio(Propiedad propiedad) {
        if(!propiedad.isComprado()) {
            //consultar si desea comprar
            boolean respuesta = true;
            if(respuesta) {
                propiedad.setComprado(respuesta);
                listaCasillas.set(propiedad.getPosicion(), propiedad);
            }
        }
        else {
            Jugador pDueno = propiedad.getDueno();
            int valorDados=0;
            int cantidadServicio = retCantidadServicios(pDueno);
            int monto=0;
            if(cantidadServicio==1) {
                monto = propiedad.getRenta()*valorDados*4;   ////// AQUÍ OCUPAMOS EL VALOR DE LOS DADOS
            }
            else if(cantidadServicio==2) {
                monto = propiedad.getRenta()*valorDados*10;
            }
            pDueno.setMonto(monto+pDueno.getMonto());
            int montoJugadorActual = jugadorActual.getMonto();
            montoJugadorActual = montoJugadorActual-monto;
            jugadorActual.setMonto(montoJugadorActual);
            if(montoJugadorActual<0) {
                hipotecarPropiedades();
            }
        }
    }
    
    
    public static void irASalida() {
        jugadorActual.setPosicion(0);
        int montoJugadorActual = jugadorActual.getMonto();
        montoJugadorActual = montoJugadorActual + 200;
        jugadorActual.setMonto(montoJugadorActual);
    }
    
    public static void moverAFerrocarril() {
        int posicionActual = jugadorActual.getPosicion();
        int i;
        
        for(i=posicionActual;i<listaCasillas.size()-1;i++) {
            Casilla casillaActual = listaCasillas.get(i);
            if(casillaActual instanceof Propiedad) {
                Propiedad casillaPropiedad = (Propiedad) casillaActual;
                if(casillaPropiedad.getTipo().equals("Ferrocarril")) {
                    jugadorActual.setPosicion(i);
                    if(!casillaPropiedad.isComprado()) {
                        //preguntar si desea comprarla
                        boolean respuesta = true;
                        casillaPropiedad.setComprado(respuesta);
                        casillaPropiedad.setDueno(jugadorActual);
                        int posicion = casillaPropiedad.getPosicion();
                        listaCasillas.set(posicion, casillaPropiedad);
                    }
                    else {
                        int renta = casillaPropiedad.getRenta();
                        Jugador pDueno = casillaPropiedad.getDueno();
                        int montoDueno = pDueno.getMonto();
                        int montoRenta = renta*2;
                        pDueno.setMonto(montoDueno+renta);
                        int montoJugadorActual = jugadorActual.getMonto();
                        montoJugadorActual = montoJugadorActual - montoRenta;
                        
                        jugadorActual.setMonto(montoJugadorActual);
                        if(montoJugadorActual<0) {
                            hipotecarPropiedades();
                        }
                    }
                }
            }
            
        }
    }
    
    
    public static void accionesSuerte() {
        Tarjeta tarjeta = retTarjetaSuerte();
        String tipo = tarjeta.getTipoTarjeta();
        switch(tipo) {
            case "Ir a salida":
                irASalida();
                break;
            case "ir a ferrocarril":
                moverAFerrocarril();
                break;
            case "Factura del médico":
                break;
            case "Has heredado 100":
                break;
            case "Multa por exceso de velocidad":
                break;
        }
        
    }
    
    
    public static void accionesPropiedad(Propiedad propiedad) {
        switch (propiedad.getTipo()) {
            case "Ferrocarril":
                accionesFerrocarril(propiedad);
                break;
            case "Servicio":
                accionesServicio(propiedad);
                break;
        }
    }
    
    public static void accionesComunidad() {
        
    }
    
    public static void accionesCarcel() {
        
    }
    
    public static void accionesInicio() {
        
    }
    
    public static void accionesImpuesto(Impuesto impuesto) {
        int montoJugadorActual = jugadorActual.getMonto();
        montoJugadorActual = montoJugadorActual - impuesto.getCostoCobro();
        jugadorActual.setMonto(montoJugadorActual);
        if(montoJugadorActual<0) {
            hipotecarPropiedades();
        }
        
    }
    
    
    public static void accion() {
        Casilla actualCasilla = listaCasillas.get(jugadorActual.getPosicion());
        if(actualCasilla instanceof Lugar) {
            Lugar lugar =  (Lugar) actualCasilla;
            accionesLugar(lugar);
        }
        if(actualCasilla instanceof Propiedad) {
            Propiedad propiedad = (Propiedad) actualCasilla;
            accionesPropiedad(propiedad);
        }
        if(actualCasilla instanceof Impuesto) {
            Impuesto impuesto = (Impuesto) actualCasilla;
            accionesImpuesto(impuesto);
        }
        if(actualCasilla.getTipo().equals("Suerte")) {
            accionesSuerte();
        }
        if(actualCasilla.getTipo().equals("Comunidad")) {
            accionesComunidad();
        }
        if(actualCasilla.getTipo().equals("Cárcel")) {
            accionesCarcel();
        }
        if(actualCasilla.getTipo().equals("Inicio")) {
            accionesInicio();
        }
        
    }
    
    
    
    public static void verificarGanador() {
        if(listaJugadores.size()==1) {
            Jugador Ganador = listaJugadores.get(0);
            //Mostrar en pantalla que hay un ganador
        }
    }
    
    
    
    
    
    
    
    
    
    public static void cargarTarjetas() {
        
        Tarjeta irAsalida = new Tarjeta("Ir a salida", 0);//y cobra 200
        listaTarjetasSuerte.add(irAsalida);
        Tarjeta irAFerrocarril = new Tarjeta("ir a ferrocarril");// si no tiene dueño compra o paga el doble
        listaTarjetasSuerte.add(irAFerrocarril);
        Tarjeta PagueCJugador = new Tarjeta(50, "Factura del médico");
        listaTarjetasComunidad.add(PagueCJugador);
        Tarjeta cobrePPension = new Tarjeta("Has heredado 100", 100);//listo heredado cien
        listaTarjetasSuerte.add(cobrePPension);
        Tarjeta pagueBanco = new Tarjeta(150, "Multa por exceso de velocidad");
        listaTarjetasComunidad.add(pagueBanco);
        
        Collections.shuffle(listaTarjetasSuerte);
        Collections.shuffle(listaTarjetasComunidad);
    }
    
    public static void agregarJugador(Ficha pFicha) {
        Jugador nJugador = new Jugador(pFicha);
        listaJugadores.add(nJugador);
    }
    
    public static void EliminarJugador(Ficha pFicha) {
        String tipoFicha = pFicha.getTipoFicha();
        int i=0;
        for(Jugador jugador: listaJugadores)
        {
            Ficha fichaJugador = jugador.getFicha();
            if(tipoFicha.equals(fichaJugador.getTipoFicha())) {
                listaJugadores.remove(i);
            }
            i++;
        }
    }
    
    public static void siguienteJugador() {
        jugadorActual = retsiguenteJugador();
    }
    public static Jugador retsiguenteJugador() {
        int posicion;
        posicion = listaJugadores.indexOf(jugadorActual);
        if(posicion==listaJugadores.size()-1||jugadorActual==null) {
            posicion=-1;
        }
        int i=0;
        for(Jugador jugador : listaJugadores)
        {
            if(i>posicion)
            {
                return jugador;
            }
            i++;
        }
        return null;
    }
    
    public static int getNumCasasTotal(int posicion,int largo) {
        
        ArrayList<Propiedad> listaPropiedades=jugadorActual.getPropiedades();
        int numeroCasas=0;
        int i;
        for(i=posicion;i<largo;i++) {
            Propiedad propiedad = listaPropiedades.get(i);
            if(propiedad instanceof Lugar) {
                Lugar lugar = (Lugar) propiedad;
                numeroCasas=lugar.getNumCasas();
                return numeroCasas;
            }
        }
        return numeroCasas;
    }
    
    public static int getNumHotelesTotal(int posicion, int largo) {
        ArrayList<Propiedad> listaPropiedades=jugadorActual.getPropiedades();
        int numeroHoteles=0;
        int i;
        for(i=posicion;i<largo;i++) {
            Propiedad propiedad = listaPropiedades.get(i);
            if(propiedad instanceof Lugar) {
                Lugar lugar = (Lugar) propiedad;
                numeroHoteles=lugar.getNumCasas();
                return numeroHoteles;
            }
        }
        return numeroHoteles;
    }
    
    public static Tarjeta retTarjetaComunidad() {
        
        indiceTarjetaComu++;
        if(indiceTarjetaComu==listaTarjetasComunidad.size())
        {
            indiceTarjetaComu=0;
            return listaTarjetasComunidad.get(listaTarjetasComunidad.size()-1);
        }
        return listaTarjetasComunidad.get(indiceTarjetaComu);
    }
    
    public static Tarjeta retTarjetaSuerte() {
        
        indiceTarjetaSuert++;
        if(indiceTarjetaSuert==listaTarjetasSuerte.size())
        {
            indiceTarjetaComu=0;
            return listaTarjetasSuerte.get(listaTarjetasSuerte.size()-1);
        }
        return listaTarjetasSuerte.get(indiceTarjetaSuert);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
