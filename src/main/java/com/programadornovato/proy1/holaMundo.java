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
        Vehiculo v[]=new Vehiculo[4];
        v[0]=new Vehiculo("AAAA", "Carro", "2000");
        v[1]=new TipoDeportivo("BBBB", "Ferrary", "2010", 8);
        v[2]=new TipoFurgoneta("CCCC", "Combi", "2000", 10);
        v[3]=new TipoTurismo("DDDD", "Tsuru", "1999", 4);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].mostrarDatos());
            
        }
    }
    
}
