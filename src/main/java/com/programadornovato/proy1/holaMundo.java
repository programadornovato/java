/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        System.out.println("Seleccione una opcion\n1: Acceso\n2: Configuracion\n3: Ayuda");
        int seleleccion=entra.nextInt();
        switch(seleleccion){
            case 1:
                System.out.println("Seleccionaste el accesos");
                break;
            case 2:
                System.out.println("Seleccionaste la configuracion");
                break;
            case 3:
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
    }
    
}
