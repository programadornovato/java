/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta es nuestra clase principal a donde se accede al programa
 * @author eugenio
 * @version 1.0
 */
public class holaMundo {
    /**
     * Este es el metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //listaNormal();
        listaDinamica();
    }

    private static void listaNormal() {
        int numEle=Integer.parseInt(JOptionPane.showInputDialog("Humano cuantos elelemtnos vas a ingresar"));
        String lista[]=new String[numEle];
        for(int i=0;i<lista.length;i++){
            lista[i]=new String();
            lista[i]=JOptionPane.showInputDialog("Humano ingresa el valor del elemento "+(i+1));
        }
        System.out.println("Resultados de la lista normal");
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    private static void listaDinamica() {
        ArrayList <String> lista=new ArrayList<String>();
        char respuesta;
        do{
            lista.add(JOptionPane.showInputDialog("Humano ingresa el valor"));
            respuesta=JOptionPane.showInputDialog("Humano quieres meter mas elementos? s/n").charAt(0);
        }while(respuesta=='s'  || respuesta=='S' );
        
        System.out.println("Resultados de la lista dinamica");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }

    }
}
