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
        //5 20 30
        //8 15 5
        //54 5 2
        //int matriz[][]={{5,20,30},{8,15,5},{54,5,2}};
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano cuantos registro tene tu matriz:");
        int reg= entra.nextInt();
        System.out.println("Humano cuantas columnas tene tu matriz:");
        int col= entra.nextInt();
        int matriz[][]=new int[reg][col];

        for(int i=0;i<3;i++){
            System.out.println("Humano ingresa 3 datos de la fila "+(i+1));
            for(int j=0;j<3;j++){
                matriz[i][j]=entra.nextInt();
            }
            
        }
        
        System.out.println("\nHumano esta es tu matriz");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");
        }
    }
    
}
