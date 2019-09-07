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
        float perimetro;
        float area;
        Cuadrilatero c;
        System.out.println("Humano!!! Humano selecciona alguna de estas opciones:\n 1: Cuadrado \n 2: Rectangulo");
        Scanner entra=new Scanner(System.in);
        int opciones=entra.nextInt();
        if(opciones==1){
            System.out.println("Humano!!. Ingresa el tamaño del lado de tu cuadra:");
            c=new Cuadrilatero(entra.nextInt());
        }
        else if(opciones==2){
            System.out.println("Humano!! Ingresa el tamaño del los 2 lados de tu rectangulo:");
            c=new Cuadrilatero(entra.nextInt(),entra.nextInt());
        }
        else{
            c=new Cuadrilatero(0);
        }
        area=c.getArea();
        perimetro=c.getPerimetro();
        System.out.println("Humano tu area es:"+area+" y tu perimetro es:"+perimetro);
    }
    
}
