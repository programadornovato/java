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
        //5 10 15 30 50 70 90 95
        Scanner entra=new Scanner(System.in);
        int elemento[]=new int[8];
        System.out.println("Humano holgazan escribe 8 numeros");
        for(int i=0;i<8;i++){
            elemento[i]=entra.nextInt();
        }
        
        System.out.println("Humano ahora ingresa tu piche numero a buscar");
        int numBuscar=entra.nextInt();
        
        int n=elemento.length, inf=0,centro=0;
        int sup=n-1;
        boolean bandera=false;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(elemento[centro]==numBuscar){
                bandera=true;
                break;
            }
            else if(numBuscar<elemento[centro]){
                sup=centro-1;
            }
            else{
                inf=centro+1;
            }
        }
        if(bandera==true){
            System.out.println("Humano ya encontre tu numero estaba en la pos "+(centro+1));
        }
        else{
            System.out.println("Lo siento Humano no encontre tu numerito");
        }

    }
    
}
