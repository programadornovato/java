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
        Scanner entra=new Scanner(System.in);
        System.out.println("Escribe un numero entre 1 y 999");
        int num=entra.nextInt();
        if(num>0 && num <10){
            System.out.println("Tu numero es unidad");
        }
        else{
            if(num >=10 && num <100){
                System.out.println("Tu numero es decena");
            }
            else{
                if(num >=100 && num<1000){
                    System.out.println("Tu numero es centena");
                }
            }
        }
    }
    
}
