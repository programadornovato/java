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
        //5 4 2 1 3
        Scanner entra=new Scanner(System.in);
        int elemento[]=new int[5],menor,pos,tem;
        System.out.println("Humano holgaza escribe 5 numero para que yo los ordene");
        for(int i=0;i<5;i++){
            elemento[i]=entra.nextInt();
        }
        
        for(int i=0;i<elemento.length-1;i++){
            menor=elemento[i];
            pos=i;
            for(int j=i+1;j<elemento.length;j++){
                if(elemento[j]<menor){
                    menor=elemento[j];
                    pos=j;
                }
            }
            if(pos!=i){
                tem=elemento[i];
                elemento[i]=elemento[pos];
                elemento[pos]=tem;
            }
        }
        System.out.println("Humano aqui estan tus elementos ordenados de forma acendente");
        for(int i=0;i<elemento.length;i++){
            System.out.print(elemento[i]+",");
        }
        System.out.println("Humano aqui estan tus elementos ordenados de forma decendente");
        for(int i=elemento.length-1;i>=0;i--){
            System.out.print(elemento[i]+",");
        }

    }
    
}
