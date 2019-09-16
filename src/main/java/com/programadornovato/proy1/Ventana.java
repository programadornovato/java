/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author eugenio
 */
public class Ventana extends JFrame{
    ArrayList <JPanel> panel=new ArrayList<JPanel>();
    ArrayList <JLabel> etiqueta=new ArrayList<JLabel>();
    int num=4;
    public Ventana(String title) throws HeadlessException, InterruptedException {
        super(title);
        //Dimension d=new Dimension(500, 500);
        //this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setLocation(300, 300);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        this.num= Integer.parseInt(JOptionPane.showInputDialog("Humano cuantos paneles quieres"));
        iniciarPaneles();
        inicaEtiquetas();
    }

    protected void iniciarPaneles() {
        JPanel contenedor=new JPanel();
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.red);
        
        for(int i=0;i<this.num;i++){
            this.panel.add(new JPanel());
            contenedor.add(this.panel.get(i));
            this.panel.get(i).setBackground(new Color(i*50, i*50, i*50));
        }
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
    }

    protected void inicaEtiquetas() {
        for(int i=0;i<this.num;i++){
            this.etiqueta.add(new JLabel("Hola"+(i+1), new ImageIcon(new ImageIcon("images/netbeans 11.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)) , SwingConstants.RIGHT ));
            this.etiqueta.get(i).setForeground(Color.white);
            this.panel.get(i).add(this.etiqueta.get(i));
        }
        
    }
    public void setTextos(String textos[]){
    }
    
}
