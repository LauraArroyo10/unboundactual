package com.mycompany.unbound.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Personaje {

    private int y;
    private int x;
    private ImageIcon imageIcon;
    private ImageIcon imagenActual;
    private ImageIcon imagenDerecha;
    private ImageIcon imagenIzquierda;
    private ImageIcon imagenFrente;
    private ImageIcon imagenAtras;
    private int puntos;
    private int velocidad = 5;
    
    public Personaje() {
    }

    public Personaje(int x, int y, ImageIcon imageIcon) {
        this.x = x;
        this.y = y;
        this.imageIcon = imageIcon;
        this.puntos = puntos;
   
    }

//    public Personaje(int y, int x, ImageIcon imageIcon, ImageIcon imagenActual, ImageIcon imagenDerecha, ImageIcon imagenIzquierda, ImageIcon imagenFrente, ImageIcon imagenAtras, int puntos) {
//        this.y = y;
//        this.x = x;
//        this.imageIcon = imageIcon;
//        this.imagenActual = imagenActual;
//        this.imagenDerecha = imagenDerecha;
//        this.imagenIzquierda = imagenIzquierda;
//        this.imagenFrente = imagenFrente;
//        this.imagenAtras = imagenAtras;
//        this.puntos = puntos;
//    }
  
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void show(Graphics g) {
        imageIcon.paintIcon(null, g, x, y);
    }

    // Métodos de movimiento
    public void moverArriba() {
        y -= velocidad;
    }

    public void moverAbajo() {
        y += velocidad;
    }

    public void moverIzquierda() {
        x -= velocidad;
    }

    public void moverDerecha() {
        x += velocidad;
    }

}
