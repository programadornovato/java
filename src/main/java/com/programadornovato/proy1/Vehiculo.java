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
public class Vehiculo {
    String marca;
    String modelo;
    String sku;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String sku) {
        this.sku = sku;
    }
    
    public void acelerar(){
        if(this.marca != null && this.modelo != null ){
            System.out.println("Tu poderoso "+ this.marca +"  "+ this.modelo +" esta acelerando");
        }
        else if(this.sku!=null){
            System.out.println("Tu poderoso "+ this.sku +" esta acelerando");
        }
    }
    
    public void acelerar(int km){
        if(this.marca != null && this.modelo != null ){
            System.out.println("Tu poderoso "+ this.marca +"  "+ this.modelo +" esta acelerando a "+km+" km/h");
        }
        else if(this.sku!=null){
            System.out.println("Tu poderoso "+ this.sku +" esta acelerando a "+km+" km/h");
        }

        //System.out.println("Tu poderoso "+ this.marca +"  "+ this.modelo +" esta acelerando a "+km+" km/h");
    }
    
    
}
