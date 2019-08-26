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
        /*
        System.out.println("Escribe una opcion\nacceso\nconfiguracion\nayuda");
        String seleleccion=entra.nextLine();
        seleleccion=seleleccion.toLowerCase();
        switch(seleleccion){
            case "acceso":
                System.out.println("Seleccionaste el acceso");
                break;
            case "configuracion":
                System.out.println("Seleccionaste la configuracion");
                break;
            case "ayuda":
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
        */
        System.out.println("Saludame por favor");
        String respuesta= entra.nextLine();
        respuesta=respuesta.toLowerCase();
        if(respuesta.equals("hola") ==true){
            System.out.println("¿Como estas?");
        }
        else{
            System.out.println("No te entiendo");
        }
    }
    
}
