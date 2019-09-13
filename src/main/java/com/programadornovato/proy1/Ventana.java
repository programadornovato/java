/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author eugenio
 */
public class Ventana extends JFrame{

    public Ventana() throws HeadlessException {
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
    }
    
}
