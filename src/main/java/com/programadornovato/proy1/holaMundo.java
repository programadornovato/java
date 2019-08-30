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
        String texto;
        float calificaciones[]=new float[4],suma=0,promedio=0;
        int semestres=0;
        do{
            texto=JOptionPane.showInputDialog("Humano!! ingresa la calificacion del alumno del semestre "+(semestres+1));
            if(texto==null){
                break;
            }
            calificaciones[semestres]= Float.parseFloat(texto);
            semestres++;
        }while(semestres<4);
        for(float calificacion:calificaciones){
            suma+=calificacion;
        }
        promedio=suma/semestres;
        JOptionPane.showMessageDialog(null, promedio);
    }
    
}
