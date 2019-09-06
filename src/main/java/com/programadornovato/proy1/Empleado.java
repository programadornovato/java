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
public class Empleado {
    private int edad;
    private String nombre;
    public void setEdad(int _edad){
        if(_edad>18 && _edad<80){
            this.edad=_edad;
        }
        else{
            System.out.println("Humano estupid esta empresa no acepta empleados de esa edad");
        }
    }
    public int getEdad(){
        return this.edad;
    }
}
