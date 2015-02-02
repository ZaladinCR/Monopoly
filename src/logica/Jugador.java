/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author curso
 */
public class Jugador {
    
    private int posicion;
    private ArrayList<Propiedad> listaProp = new ArrayList<>();
    private int monto;
    private boolean caeEnCarcel;
    private int movimientos;
    private Ficha ficha;
    
    Jugador(Ficha pFicha) {
        posicion=0;
        monto = 15000;
        caeEnCarcel=false;
        movimientos=0;
        ficha = pFicha;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Propiedad> getListaProp() {
        return listaProp;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isCaeEnCarcel() {
        return caeEnCarcel;
    }

    public void setCaeEnCarcel(boolean caeEnCarcel) {
        this.caeEnCarcel = caeEnCarcel;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public Ficha getFicha() {
        return ficha;
    }
    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
    
    public void addPropiedad(Propiedad pPropiedad) {
        listaProp.add(pPropiedad);
    }
    
    public ArrayList<Propiedad> getPropiedades(){
        return listaProp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
