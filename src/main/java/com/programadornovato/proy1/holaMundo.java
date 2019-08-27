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
        /*
        int i=1;
        while(i<=10){
            System.out.println("i="+i);
            i=i+1;
        }
        
        int i=10;
        while(i>=1){
            System.out.println("i="+i);
            i=i-1;
        }
        */
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano cuantas veces quieres que se repita");
        int repeticiones= entra.nextInt();
        int i=1;
        while(i<=repeticiones){
            System.out.println("i="+i);
            i=i+2;
        }
    }
    
}
