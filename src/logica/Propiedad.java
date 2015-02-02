/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author curso
 */
public class Propiedad extends Casilla{
    
    private boolean comprado;
    private Jugador dueno;
    private boolean hipotecada;
    private int renta;
    private int costoCompra;
    private int costoHipoteca;
    
    Propiedad(int pRenta, int pCostoCompra, int pCostoHipoteca, String pNombre, String pTipo, int pPosicion) {
        super(pNombre, pTipo,pPosicion );
        comprado = false;
        hipotecada = false;
        renta = pRenta;
        costoCompra = pCostoCompra;
        costoHipoteca = pCostoHipoteca;
        
    }

    public boolean isComprado() {
        return comprado;
    }
    
    public void setComprado(boolean pComprado) {
        comprado = pComprado;
    }

    public Jugador getDueno() {
        return dueno;
    }

    public void setDueno(Jugador pDueno) {
        dueno = pDueno;
    }

    public boolean isHipotecada() {
        return hipotecada;
    }
    
    public void setHipotecada(boolean pHipotecada) {
        hipotecada = pHipotecada;
    }

    public int getRenta() {
        return renta;
    }

    public int getCostoCompra() {
        return costoCompra;
    }

    public int getCostoHipoteca() {
        return costoHipoteca;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
