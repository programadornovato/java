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
        1	2	3
        4	5	6
        7	8	9
        */
        int matriz[][]=new int[3][3];
        int matrizT[][]=new int[3][3];
        Scanner entra=new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            System.out.println("Humano!!! ingresa los datos de la fila "+(i+1));
            for(int j=0;j<3;j++){
                matriz[i][j]=entra.nextInt();
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizT[j][i]=matriz[i][j];
            }
        }
        
        System.out.println("Humano aqui esta tu pinc**%*%* matriz traspuesta");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrizT[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
    
}
