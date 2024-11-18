/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.unbound.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Trampa {
    private int x, y;
    private ImageIcon imageIcon;

    public Trampa(int x, int y) {
        this.x = x;
        this.y = y;
        this.imageIcon = new ImageIcon(""); //No hay trampa aun
    }

    public void mostrar(Graphics g) {
        imageIcon.paintIcon(null, g, x, y);
    }

    public int getX() { 
        return x; 
    }
    
    public int getY() {
        return y; 
    }
    
    public ImageIcon getImageIcon() { return imageIcon; }
}