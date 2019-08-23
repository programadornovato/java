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
        System.out.print("Ingrese valor del producto 1:");
        float prod1=entra.nextFloat();
        System.out.print("Ingrese valor del producto 2:");
        float prod2=entra.nextFloat();
        System.out.print("Ingrese valor del producto 3:");
        float prod3=entra.nextFloat();
        float suma=prod1+prod2+prod3;
        System.out.println("Suma total="+suma);
        // 5.45=6.0   5.55=6.0
        double totalMasRedondeo=Math.ceil(suma);
        System.out.println("Total pagado:"+totalMasRedondeo);
        double redondeo=totalMasRedondeo-suma;
        System.out.println("Gracias por redondear:"+redondeo);
    }
    
}
