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
        String texto=JOptionPane.showInputDialog("Humano!!!! escribe un texto");
        int longitud=texto.length();
        char[] caracteres=new char[longitud];
        int inverso=longitud;
        for(int i=0;i<longitud;i++){
            caracteres[i]=texto.charAt(inverso-1);
            inverso--;
        }
        System.out.println(caracteres);
    }
    
}
