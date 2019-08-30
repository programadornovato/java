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
        String texto=JOptionPane.showInputDialog("Humano ingresa numero divididos por coma");
        //5,6,7,10,5
        String numerosEnTexto[]=texto.split(",");
        int cantidad=numerosEnTexto.length;
        int numeros[]=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            numeros[i]=Integer.parseInt( numerosEnTexto[i]);
        }
        int mayor=0;
        for(int numero:numeros){
            if(numero>mayor){
                mayor=numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Humano este es tu numero mayor="+mayor);
    }
    
}
