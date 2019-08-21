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
public class holaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Byte mordida;
        mordida=(byte)126.55;
        System.out.println("mordida="+mordida);
        
        final float pi=3.1415f;
        float res=pi*2;
        System.out.println("pi*2="+res);
        
        Short corto;
        corto=(short)32000.55;
        System.out.println("corto="+corto);
        
        Integer entero;
        entero=32000;
        System.out.println("entero="+entero);
        
        Long largo;
        largo=(long)32000;
        System.out.println("largo="+largo);
        
        Float flotante;
        flotante=mordida.floatValue();
        System.out.println("flotante="+flotante);
        
        Double doble;
        doble=32000.55;
        System.out.println("doble="+doble);
        
        char caracter;
        caracter='c';
        System.out.println("caracter="+caracter);
        
        Boolean boleano;
        boleano=false;
        System.out.println("boleano="+boleano);
        
        String cadena;
        cadena="cadena";
        System.out.println("cadena="+cadena);
    }
    
}
