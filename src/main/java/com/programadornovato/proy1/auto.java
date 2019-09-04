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
public class auto {
	String marca;
	String modelo;
	String color;
        private boolean acceso=false;
        public void meterLlave(String clave){
            if(clave.equals("123456")){
                acceso=true;
            }
            else{
                acceso=false;
                System.out.println("Llamar a la policia");
            }
        }
        public void mando(String accion){
            if(acceso==true){
                if(accion.equals("enciende")){
                    enciende();
                }
            }
        }
        private void enciende(){
            System.out.println("Enciende run run");
        }
        public void acelera(){
            System.out.println("Velocimetro 80km");
        }
        public void frenar(){
            System.out.println("Velocimetro 0km");
        }
}
