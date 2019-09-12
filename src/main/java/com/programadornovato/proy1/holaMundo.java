/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        /*
        try{
            leerArchivo();
        }
        catch( FileNotFoundException e ){
            System.out.println("Archivo no encontrado:"+e);
        }
        catch ( IOException e ){
            System.out.println("No se puede acceder a ese archivo:"+e);
        }
        catch ( Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Yo me ejecuto si o si");
        }
        */
        try{
            Integer num = null;
            System.out.println(num.toString());
        }
        catch(NullPointerException e){
            System.out.println("Debes inicializar tu objeto");
        }
    }
    public static void leerArchivo() throws FileNotFoundException, IOException{
        //EXCEPCIONES VERIFICADAS
        BufferedReader bf=new BufferedReader(new FileReader("/home/eugenio/archivo/archivo.txt"));
        String linea;
        while ( (linea=bf.readLine()) != null ){
            System.out.println(linea);
        }        
    }
}
