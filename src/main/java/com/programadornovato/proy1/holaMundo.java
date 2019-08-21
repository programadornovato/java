/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.util.Scanner;

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
        Scanner inInt=new Scanner (System.in);
        int entero;
        System.out.println("Escriba un numero entero");
        entero=inInt.nextInt();
        System.out.println("Su numero es: "+entero);
        
        Scanner inFloat=new Scanner (System.in);
        float flotante;
        System.out.println("Escriba un numero flotante");
        flotante=inFloat.nextFloat();
        System.out.println("Su numero es: "+flotante);
        
        Scanner inCadena=new Scanner (System.in);
        String cadena;
        System.out.println("Escriba una cadena");
        cadena=inCadena.nextLine();
        System.out.println("Su cadena es: "+cadena);
        
        Scanner inCaracter=new Scanner (System.in);
        char caracter;
        System.out.println("Escriba un caracter");
        caracter=inCaracter.next().charAt(0);
        System.out.println("Su caracter es: "+caracter);
        
        
        
    }
    
}
