/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author curso
 */
public class Lugar extends Propiedad {
    
    private Costos costo;
    private int numCasas;
    //private ArrayList<Propiedad> listaProp = new ArrayList<>();
    private int numHoteles;
    private String Color;
    private int costoCasas;
    private int costoHotel;

    public Lugar(Costos pcosto,int pRenta, int pCostoCompra, int pCostoHipoteca,String pNombre, String pTipo,String pcolor, int pCostoCasas, int pCostoHotel, int pPosicion) {
        super(pRenta, pCostoCompra, pCostoHipoteca, pNombre, pTipo, pPosicion);
        costoCasas = pCostoCasas;
        costoHotel = pCostoHotel;
        costo = pcosto;
    }
    
    public Costos getCosto() {
        return costo;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }

    public int getNumHoteles() {
        return numHoteles;
    }

    public void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }

    public String getColor() {
        return Color;
    }

    public int getCostoCasas() {
        return costoCasas;
    }

    public int getCostoHotel() {
        return costoHotel;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
