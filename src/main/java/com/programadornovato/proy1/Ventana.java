/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eugenio
 */
public class Ventana extends JFrame{
    /*
    public Ventana() throws HeadlessException {
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
    }
    */
    public Ventana(String title) throws HeadlessException, InterruptedException {
        super(title);
        //Dimension d=new Dimension(500, 500);
        //this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setLocation(300, 300);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        iniciarPaneles();
    }

    protected void iniciarPaneles() {
        JPanel contenedor=new JPanel();
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.red);
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        contenedor.add(panel1);
        contenedor.add(panel2);
        contenedor.add(panel3);
        panel1.setBackground(new Color(0, 51, 102));
        panel2.setBackground(new Color(0, 102, 255));
        panel3.setBackground(new Color(255, 0, 255));
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
        //panel3.setVisible(false);
    }
    
    
}
