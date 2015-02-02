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
public class Ficha {
    
    private String nombre;
    
    public Ficha(String pNombre) {
        nombre = pNombre;
    }
         
    
    public String getTipoFicha()
    {
        return nombre;
    }

    
    public void setNombre(String pNombre) {
        nombre = pNombre;
    }
}
