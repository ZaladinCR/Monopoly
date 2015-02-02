/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Jason
 */
public class Tarjeta {
    
    private String tipoTarjeta;
    private int nuevoCobro;
    private int nuevaPosicion;
    private int nuevoPago;

    public Tarjeta(String pTipoTarjeta,int pNuevoCobroPosi) {
        tipoTarjeta = pTipoTarjeta;
        nuevoCobro = pNuevoCobroPosi;  
        nuevaPosicion = pNuevoCobroPosi;
    }
    
    
    public Tarjeta(int pNuevoPago, String pTipoTarjeta) { // pagueCJugador
        nuevoPago = pNuevoPago;
        tipoTarjeta = pTipoTarjeta;
    }
    
    public Tarjeta(String pTipoTarjeta) {
        tipoTarjeta = pTipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }


    public int getNuevoCobro() {
        return nuevoCobro;
    }


    public int getNuevaPosicion() {
        return nuevaPosicion;
    }

    public int getNuevoPago() {
        return nuevoPago;
    }

}
