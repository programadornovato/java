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
        System.out.println("Humano dime cuantas filas tiene tu matriz");
        int fil=entra.nextInt();
        System.out.println("Humano dime cuantas columnas tiene tu matriz");
        int col=entra.nextInt();
        int matriz[][]=new int[fil][col];
        
        boolean esSimetrica=true;
        for(int i=0;i<fil;i++){
            System.out.println("Humano ingresa los datos de la fila "+(i+1));
            for(int j=0;j<col;j++){
                matriz[i][j]=entra.nextInt();
            }
        }
        
        if(col==fil){
            for(int i=0;i<fil;i++){
                for(int j=0;j<col;j++){
                    if(matriz[i][j]!=matriz[j][i]){
                        esSimetrica=false;
                        break;
                    }
                }
                if(esSimetrica==false){
                    break;
                }
            }
        }
        else{
            System.out.println("Humano tu matriz para empesar no es simetrica");
        }
        
        if(esSimetrica==true){
            System.out.println("Humano felicidades tu matriz si es simetrica");
        }
        else{
            System.out.println("Nop no es simetrica");
        }
    }
    
}
