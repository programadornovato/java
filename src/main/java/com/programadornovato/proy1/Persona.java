/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

/**
 *
 * @author eugenio
 */
public class Persona {
    private int dinero;
    private final String nombre;
    public Persona(String _nombre){
        this.nombre=_nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
    public int getDinero() {
        return dinero;
    }

    public String getNombre() {
        return nombre;
    }

    
}
