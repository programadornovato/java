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
        Random rand=new Random();
        int d1=rand.nextInt(6)+1;
        int d2=rand.nextInt(6)+1;
        int d3=rand.nextInt(6)+1;
        System.out.println("Dado 1="+d1);
        System.out.println("Dado 2="+d2);
        System.out.println("Dado 3="+d3);
        if(d1==6 && d2==6 && d3==6){
            System.out.println("Excelente");
        }
        else{
            if(  (d1==6 && d2==6) || (d1==6 && d3==6) || (d2==6 && d3==6)  ){
                System.out.println("Muy bien");
            }
            else{
                if(d1==6 || d2==6 || d3==6){
                    System.out.println("Regular");
                }
                else{
                    if(d1!=6 && d2!=6 && d3!=6){
                        System.out.println("Pesimo");
                    }
                }
            }
        }
    }
    
}
