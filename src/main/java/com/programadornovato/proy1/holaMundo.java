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
        //5,4,2,1,3
        String texto=JOptionPane.showInputDialog("Humano ingresa numero divididos por coma");
        String numerosEnTexto[]=texto.split(",");
        int cantidad=numerosEnTexto.length;
        int numeros[]=new int[cantidad],tem;
        for(int i=0;i<cantidad;i++){
            numeros[i]=Integer.parseInt( numerosEnTexto[i]);
        }
        for(int i=0;i<(cantidad-1);i++){
            for(int j=0;j<(cantidad-1);j++){
                if(numeros[j]>numeros[j+1]){
                    tem=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=tem;
                }
            }
        }
        System.out.println("Humano aqui estan tus numeritos ordenados de forma acendente");
        for(int i=0;i<cantidad;i++){
            System.out.print(numeros[i]+",");
        }
        System.out.println("\nHumano aqui estan tus numeritos ordenados de forma decendente");
        for(int i=cantidad-1;i>=0;i--){
            System.out.print(numeros[i]+",");
        }
    }
    
}
