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
        int contador=0;
        float calificacion=0,suma=0,promedio;
        String texto;
        do{
            texto=JOptionPane.showInputDialog("Ingresa la calificacion del semestre "+(contador+1));
            System.out.println(texto);
            if(texto!=null){
                calificacion=Float.parseFloat(texto);
                suma=suma+calificacion;
                contador++;
            }
        }while(texto!=null);
        if(contador>0){
            promedio=suma/contador;
            JOptionPane.showMessageDialog(null, "Promedio="+promedio);
        }
        else{
            JOptionPane.showMessageDialog(null, "Humano estupido debes de poner por lo menos una calificacion");
        }
    }
    
}
