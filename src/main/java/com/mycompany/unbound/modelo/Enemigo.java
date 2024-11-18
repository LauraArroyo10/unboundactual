
package com.mycompany.unbound.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Enemigo {
    private int x, y;
    private ImageIcon imageIcon;

    public Enemigo(int x, int y, ImageIcon imageIcon1) {
        this.x = x;
        this.y = y;
//        this.imageIcon = new ImageIcon("./src/main/resources/img/enemigo.gif"); // Imagen del enemigo//  NO HAY IMAGEN DEL ENEMIGO AUN 
    }

    public void mostrar(Graphics g) {
        imageIcon.paintIcon(null, g, x, y);
    }
    public int getX() { return x; }
    public int getY() { return y; }
   
    //metodo del movimiento del enemigo// definir vlocidd
    public void seguirPersonaje(){
        
    }
}
