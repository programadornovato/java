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
        Random rand=new Random();
        rand.nextInt();
        */
        Vehiculo v1=new Vehiculo("Vocho", "1990");
        v1.acelerar();
        
        Vehiculo v2=new Vehiculo("SKU Vochoman");
        v2.acelerar(50);
    }
    
}
