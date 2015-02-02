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
public class Costos {
    
    private int P1Casas;
    private int P2Casas;
    private int P3Casas;
    private int P4Casas;
    private int P1Hotel;

    public Costos(int P1Casas, int P2Casas, int P3Casas, int P4Casas, int P1Hotel) {
        this.P1Casas = P1Casas;
        this.P2Casas = P2Casas;
        this.P3Casas = P3Casas;
        this.P4Casas = P4Casas;
        this.P1Hotel = P1Hotel;
    }

    public int getP1Casas() {
        return P1Casas;
    }

    public void setP1Casas(int P1Casas) {
        this.P1Casas = P1Casas;
    }

    public int getP2Casas() {
        return P2Casas;
    }

    public void setP2Casas(int P2Casas) {
        this.P2Casas = P2Casas;
    }

    public int getP3Casas() {
        return P3Casas;
    }

    /**
     * @param P3Casas the P3Casas to set
     */
    public void setP3Casas(int P3Casas) {
        this.P3Casas = P3Casas;
    }

    public int getP4Casas() {
        return P4Casas;
    }

    public void setP4Casas(int P4Casas) {
        this.P4Casas = P4Casas;
    }

    public int getP1Hotel() {
        return P1Hotel;
    }

    public void setP1Hotel(int P1Hotel) {
        this.P1Hotel = P1Hotel;
    }
    
}
