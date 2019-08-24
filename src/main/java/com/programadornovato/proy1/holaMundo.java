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
        System.out.print("Diametro del vaso=");
        float diametro=entra.nextFloat();
        System.out.print("Altura del vaso=");
        float altura=entra.nextFloat();
        double volumen;
        float pi=3.1416f;
        float radio=diametro/2;
        volumen=pi*Math.pow(radio, 2)*altura;
        System.out.println("Vol de un vaso de cerveza es:"+volumen);
        System.out.print("Con cuantos litros te emborrachas?");
        float litros=entra.nextFloat();
        float mililitrosParaEmborracharme=litros*1000;
        double limiteVasos=mililitrosParaEmborracharme/volumen;
        System.out.println("Yo me emborracho con :"+limiteVasos+" vasos de cerveza");
        
        
    }
    
}
