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
    static Scanner entra=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char respuesta;
        int opcion;
        do{
            System.out.println("Humano que tipo de pedazo de terreno quieres ingresar?");
            System.out.println("1: Triangulo");
            System.out.println("2: Rectangulo");
            opcion=entra.nextInt();
            switch(opcion){
                case 1:llenaTriangulo();
                break;
                case 2:llenaRectangulo();
                break;
            }
            System.out.println("Humano desea meter mas pedazos de terreno a calcular? s/n");
            respuesta=entra.next().charAt(0);
        }while( respuesta=='s' || respuesta=='S' );
    }

    protected static void llenaTriangulo() {
        System.out.println("tringulo");
    }
    protected static void llenaRectangulo() {
        System.out.println("rectangulo");
    }
    
}
