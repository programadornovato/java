/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eugenio
 */
public class holaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5 10 15 58 20 56 65
        Scanner entra=new Scanner(System.in);
        int elemento[]=new int[7];
        System.out.println("Humano holgazan escribe 7 numeros");
        for(int i=0;i<7;i++){
            elemento[i]=entra.nextInt();
        }
        
        System.out.println("Humano ahora ingresa tu piche numero a buscar");
        int numBuscar=entra.nextInt();
        
        int i=0;
        boolean bandera=false;
        while(i<7 && bandera== false){
            if(numBuscar==elemento[i]){
                bandera=true;
            }
            i++;
        }
        if(bandera){
            System.out.println("Humano!!! ya encontre tu pinche numero en la posicion "+i);
        }
        else{
            System.out.println("Humano estupido!! no encontre tu numerito");
        }
        

    }
    
}
