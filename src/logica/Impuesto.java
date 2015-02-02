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
public class Impuesto extends Casilla{
    
    private int costoCobro;

    public Impuesto(String nombre, String tipo, int posicion, int pCostoCobro) {
        super(nombre, tipo, posicion);
        costoCobro = pCostoCobro;
    }

    public int getCostoCobro() {
        return costoCobro;
    }
    
}
