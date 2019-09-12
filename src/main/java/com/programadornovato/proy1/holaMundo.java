/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta es nuestra clase principal a donde se accede al programa
 * @author eugenio
 * @version 1.0
 */
public class holaMundo {
    /**
     * Este es el metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int a,b;
        a=5;
        b=0;
        int resultado=a/b;
        System.out.println(resultado);
        */
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano quiero que introduscas un numero:");
        int num=entra.nextInt();
        System.out.println(num);
    }
}
