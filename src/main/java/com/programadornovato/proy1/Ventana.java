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
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    JTextArea areaTexto;
    public Ventana(){
        contenedor=new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        this.contenedor.setLayout(null);
        
        //accionBoton();
        //accionRaton();
        //accionTeclado();
        //validarNumeros();
        validarCorreo();
    }
    protected void validarCorreo(){
        caja =new JTextField();
        contenedor.add(caja);
        caja.setBounds(10, 10, 400, 30);
        
        areaTexto =new JTextArea();
        contenedor.add(areaTexto);
        areaTexto.setBounds(10, 50, 400, 200);
        
        KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyChar()=='\n'){
                    if(esCorreo(caja.getText())==true){
                        areaTexto.append("Si humano esto es un correo\n");
                    }
                    else{
                        areaTexto.append("No humano estupido esto NO!! es un correo\n");
                    }
                }
            }
        };
        caja.addKeyListener(l);
    }
    public boolean esCorreo(String correo){
        Pattern patroncito = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=patroncito.matcher(correo);
        return comparar.find();
    }
    protected void validarNumeros(){
        caja =new JTextField();
        contenedor.add(caja);
        caja.setBounds(10, 10, 400, 30);
        
        areaTexto =new JTextArea();
        contenedor.add(areaTexto);
        areaTexto.setBounds(10, 50, 400, 200);
        
        KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(esNumero(caja.getText())==true){
                    areaTexto.append("Si es numero\n");
                }else{
                    areaTexto.append("No humano, esto no es un numero\n");
                }
            }
        };
        caja.addKeyListener(l);
    }
    public boolean esNumero(String texto){
        boolean resultado;
        try {
            Integer.parseInt(texto);
            resultado=true;
        } catch (Exception e) {
            resultado=false;
        }
        return resultado;
    }
    protected void accionTeclado(){
        caja =new JTextField();
        contenedor.add(caja);
        caja.setBounds(10, 10, 400, 30);
        
        areaTexto =new JTextArea();
        contenedor.add(areaTexto);
        areaTexto.setBounds(10, 50, 400, 200);
        
        KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto.append("keyReleased\n");
                if(e.getKeyChar()=='*'){
                    areaTexto.append("Presionaste el asterico\n");
                }
                if(e.getKeyChar()=='\n'){
                    areaTexto.append("Presionaste enter\n");
                }
                if(e.getKeyChar()==' '){
                    areaTexto.append("Presionaste espacio\n");
                }
            }
        };
        caja.addKeyListener(l);
        
    }
    protected void accionRaton(){
        boton =new JButton("Humano!!! ponte jugar con el raton aqui");
        contenedor.add(boton);
        boton.setBounds(10, 10, 400, 30);
        
        caja =new JTextField();
        contenedor.add(caja);
        caja.setBounds(10, 50, 400, 30);
        MouseListener l = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                caja.setText("mouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                caja.setText("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                caja.setText("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                caja.setText("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                caja.setText("mouseExited");
            }
        };
        
        boton.addMouseListener(l);
    }
    private void accionBoton() {
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
