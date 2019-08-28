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
        
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }

        for(int i=10;i>=1;i--){
            System.out.println("i="+i);
        }
        */
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano cuantas repeticiones quieres");
        int repeticiones=entra.nextInt();
        for(int i=1;i<=repeticiones;i++){
            System.out.println("i="+i);
        }

    }
    
}
