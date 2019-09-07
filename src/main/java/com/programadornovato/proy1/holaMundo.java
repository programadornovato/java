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
        Estatica i1=new Estatica();
        Estatica i2=new Estatica();
        */
        /*
        System.out.println("i1="+i1.normal);
        System.out.println("i2="+i2.normal);
        i1.normal="Cambio de valor en i1";
        i2.normal="Cambio de valor en i2";
        System.out.println("");
        System.out.println("i1="+i1.normal);
        System.out.println("i2="+i2.normal);
        */
        /*
        System.out.println("i1="+i1.estatico);
        System.out.println("i2="+i2.estatico);
        
        i2.estatico="Nuevo valor desde i2";
        i1.estatico="Nuevo valor desde i1";
        
        System.out.println("");
        System.out.println("i1="+i1.estatico);
        System.out.println("i2="+i2.estatico);
        */
        System.out.println(Estatica.estatico);
    }
    
}
