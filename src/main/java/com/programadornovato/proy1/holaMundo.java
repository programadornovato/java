/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        Calendar fechaNac=new GregorianCalendar(2000,01,01);
        Calendar fechaHoy=Calendar.getInstance();
        int anoNac=fechaNac.get(Calendar.YEAR);
        int anoHoy=fechaHoy.get(Calendar.YEAR);
        int edad=anoHoy-anoNac;
        System.out.println("Edad="+edad);
    }
    
}
