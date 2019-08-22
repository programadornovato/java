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
        /*
        double numRaiz=8;
        double resRaiz=0;
        resRaiz=Math.sqrt(numRaiz);
        System.out.println("resRaiz="+resRaiz);
        
        double base=5;
        double exp=2;
        double resExpo;
        resExpo=Math.pow(base, exp);
        System.out.println("resExpo="+resExpo);
        
        float numAbs=-5.5f;
        double resAbs=Math.abs(numAbs);
        System.out.println("resAbs="+resAbs);
        
        float numRed=5.5f;
        int resRed=Math.round(numRed);
        System.out.println("resRed="+resRed);
        */
        double resAle=Math.random();
        System.out.println("resAle="+Math.round(resAle*100));
    }
    
}
