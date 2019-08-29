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
        String [] perros={"Monte","Chupacabras","Solovino","Chimuelo","La wera","El chiquito"};
        
        for(int i=0;i<perros.length;i++){
            System.out.println((i+1)+" "+perros[i]);
        }
        System.out.println("_________________");
        int i=1;
        for(String perro:perros){
            System.out.println(i+" "+perro);
            i++;
        }
    }
    
}
