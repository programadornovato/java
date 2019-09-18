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
    
    public Ventana(){
        contenedor=new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        this.contenedor.setLayout(null);
    }

    
}
