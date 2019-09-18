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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author eugenio
 */
public class Ventana extends JFrame{
    
    JPanel contenedor;
    JButton boton;
    JLabel etiqueta;
    JTextField caja;
    public Ventana(){
        contenedor=new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        this.contenedor.setLayout(null);
        
        boton =new JButton("Humano pon tu miserable nombre para saludarte");
        contenedor.add(boton);
        boton.setBounds(10, 10, 400, 30);
        
        caja =new JTextField();
        contenedor.add(caja);
        caja.setBounds(10, 50, 400, 30);
        
        etiqueta =new JLabel();
        contenedor.add(etiqueta);
        etiqueta.setBounds(10, 100, 400, 30);
        
        ActionListener accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hola");
                etiqueta.setText("Hola "+caja.getText());
            }
        };
        
        boton.addActionListener(accion);
        
    }

    
}
