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
        Random rand=new Random();
        int aleatorio=rand.nextInt(5)+1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Humano que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
        while(num!= aleatorio){
            num = Integer.parseInt(JOptionPane.showInputDialog("Humano estupdo te equivocaste en que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
            if(num==0){
                break;
            }
            aleatorio=rand.nextInt(5)+1;
        }
        if(num!=0){
            JOptionPane.showMessageDialog(null, "Bien jugado humano");
        }
        else{
            JOptionPane.showMessageDialog(null, "Huamno estupido el numero era "+aleatorio);
        }
        
    }
    
}
