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
        Calculadora cal=new Calculadora();
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano ingresa tus 2 valores a sumar");
        int resultado=cal.suma(entra.nextInt(), entra.nextInt());
        System.out.println("Humano este es el resultado = "+resultado);
        
        System.out.println("Humano ingresa tus 2 valores a restar");
        resultado=cal.resta(entra.nextInt(), entra.nextInt());
        System.out.println("Humano este es el resultado = "+resultado);
        
        System.out.println("Humano ingresa tus 2 valores a multiplicar");
        resultado=cal.multiplicacion(entra.nextInt(), entra.nextInt());
        System.out.println("Humano este es el resultado = "+resultado);
        
        System.out.println("Humano ingresa tus 2 valores a divicion");
        resultado=cal.divicion(entra.nextInt(), entra.nextInt());
        System.out.println("Humano este es el resultado = "+resultado);
    }
    
}
