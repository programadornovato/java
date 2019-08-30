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
        String texto=JOptionPane.showInputDialog("Humano!!! escribe un palindromo");
        int longitud=texto.length();
        char [] letras=new char[longitud];
        char [] letrasInv=new char[longitud];
        int inverso=longitud;
        boolean igual=true;
        for(int i=0;i<longitud;i++){
            letrasInv[i]=texto.toLowerCase().charAt(inverso-1);
            inverso--;
            letras[i]=texto.toLowerCase().charAt(i);
            if(letrasInv[i]!=letras[i]){
                igual=false;
                break;
            }
        }
        if(igual==false){
            System.out.println("Humano estupido!!!"+ texto +" no es un palindromo");
        }
        else{
            System.out.println("Bien jugado Humano!!! "+ texto +" SI es un palindromo");
        }
        
    }
    
}
