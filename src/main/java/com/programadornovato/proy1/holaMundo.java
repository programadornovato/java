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
        int a[]=new int[5],b[]=new int[5],c[]=new int[10];
        for(int i=0;i<5;i++){
            a[i]= Integer.parseInt(JOptionPane.showInputDialog("Humano ingresa el valor "+ (i+1)+" del arreglo a"));
        }
        for(int i=0;i<5;i++){
            b[i]= Integer.parseInt(JOptionPane.showInputDialog("Humano ingresa el valor "+ (i+1)+" del arreglo b"));
        }
        int j=0;
        for(int i=0;i<5;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        for(int elemento:c){
            System.out.println(elemento);
        }
    }
    
}
