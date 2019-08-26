/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        Scanner entra=new Scanner(System.in);
        int numUser,numSis;
        numSis=(int)(Math.random()*10);
        System.out.print("Ingresa un numero mayor o igual a "+numSis+": ");
        numUser=entra.nextInt();
        if(numUser >= numSis){
            System.out.println("Muy bien");
        }
        else{
            System.out.println("Muy mal");
        }
    }
    
}
