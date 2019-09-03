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
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano!! cuantas filas va a tener tu inche matriz");
        int fil=entra.nextInt();
        System.out.println("Humano!! cuantas columnas va a tener tu inche matriz");
        int col=entra.nextInt();
        int matriz[][]=new int[fil][col];
        
        for(int i=0;i<fil;i++){
            System.out.println("Humano ingresa los datos de la fila "+(i+1));
            for(int j=0;j<col;j++){
                matriz[i][j]=entra.nextInt();
            }
        }
        int sumaFil=0;
        for(int i=0;i<fil;i++){
            sumaFil=0;
            for(int j=0;j<col;j++){
                sumaFil=sumaFil+matriz[i][j];
            }
            System.out.println("Humano esta es la suma de tu fila "+(i+1)+"="+sumaFil);
        }
        int sumaCol=0;
        for(int j=0;j<col;j++){
            sumaCol=0;
            for(int i=0;i<fil;i++){
                sumaCol=sumaCol+matriz[i][j];
            }
            System.out.println("Humano esta es la suma de tu columna "+(j+1)+"="+sumaCol);
        }
        
    }
    
}
