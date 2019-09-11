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
    static Scanner entra=new Scanner(System.in);
    static ArrayList <Terreno> pedazoTerreno=new ArrayList<Terreno>();
    /**
     * Este es el metodo principal
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
        mostrarResultados();
    }

    /**
     * Este metodo se encarga de recibir desde scaner 3 numero y colocarlos en la
     * instancia (hija) triangulo y esa instancia agregarla al arreglo de terrenos
     */
    protected static void llenaTriangulo() {
        double lado1,lado2,lado3;
        System.out.println("Humano que medida tiene tu lado 1 de tu triangulo");
        lado1=entra.nextDouble();
        System.out.println("Humano que medida tiene tu lado 2 de tu triangulo");
        lado2=entra.nextDouble();
        System.out.println("Humano que medida tiene tu lado 3 de tu triangulo");
        lado3=entra.nextDouble();
        Triangulo t=new Triangulo(lado1, lado2, lado3);
        pedazoTerreno.add(t);
        
        
    }

    /**
     * Este metodo se encarga de recibir desde scaner 3 numero y colocarlos en la
     * instancia (hija) rectangulo y esa instancia agregarla al arreglo de terrenos
     */
    protected static void llenaRectangulo() {
        double lado1,lado2;
        System.out.println("Humano que medida tiene tu lado 1 de tu rectangulo");
        lado1=entra.nextDouble();
        System.out.println("Humano que medida tiene tu lado 2 de tu rectangulo");
        lado2=entra.nextDouble();
        Rectangulo r=new Rectangulo(lado1, lado2);
        pedazoTerreno.add(r);

    }
    
    /**
     * Simplemente se muestran los datos del area de cada instancia hija y el area total
     * 
     */
    private static void mostrarResultados() {
        double area=0;
        for( Terreno t: pedazoTerreno ){
            System.out.println(t.toString() + "Area" + t.area());
            area=area+t.area();
        }
        System.out.println("El area total de tu bendito terreno es:"+area);
    }
    
    
}
