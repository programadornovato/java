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
        /*
Maria	Ramirez	C
Juan	Perez	B
Ines	Montes	B
Rene	Pacheco	B
Elena	Morales	A
Mario	Dias	C
Sonia	Navarro	A
        */
        
        String alumnos[][]=new String[7][3];
        Scanner entra=new Scanner(System.in);
        for(int i=0;i<alumnos.length;i++){
            System.out.println("Humano!!! ingresa los datos del alumno "+(i+1));
            for(int j=0;j<3;j++){
                alumnos[i][j]=entra.next();
            }
        }
        
        System.out.println("Humano!!! ¿Dime de que aula quieres ver tus alumnos?");
        String aula=entra.next();
        aula=aula.toLowerCase();
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i][2].toLowerCase().equals(aula)){
                System.out.println("");
                for(int j=0;j<3;j++){
                    System.out.print(alumnos[i][j]+" ");
                }
            }
        }
        
    }
    
}
