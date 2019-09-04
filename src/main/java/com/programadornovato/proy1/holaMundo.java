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
        auto vocho=new auto();
        vocho.modelo="1980";
        vocho.marca="vocho";
        vocho.color="azul";
        
        vocho.meterLlave("123456");
        vocho.mando("enciende");
        /*
        vocho.enciende();
        vocho.acelera();
        vocho.frenar();
        System.out.println("Marca "+vocho.marca);
        */
        
    }
    
}
