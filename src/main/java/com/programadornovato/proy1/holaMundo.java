/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

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
        float num1,num2,suma,resta,mul,div,residuo;
        System.out.println("Inresa 2 numeros:");
        num1=entra.nextFloat();
        num2=entra.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        residuo=num1%num2;
        System.out.println("Suma="+suma);
        System.out.println("Resta="+resta);
        System.out.println("Multiplicacion="+mul);
        System.out.println("Divicion="+div);
        System.out.println("Residuo="+residuo);
    }
    
}
