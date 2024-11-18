
package com.mycompany.unbound.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author lab3-09
 */
public class AreaJuego {

    private LaberintoLogico labLogico;
    private Personaje personaje;
    private Enemigo enemigo;
    private Trampa trampa;
    public String direccionActual;
    //coordenadas 
    private int[] coordenadasX = {};
    private int[] coordenadasY = {};

    public AreaJuego() {
        labLogico = new LaberintoLogico();
        this.personaje = new Personaje();
        
        //posibles descartes o uso futuro
//        direccionActual = "arriba";
//        direccionActual = "abajo";
//        direccionActual = "izquierda";
//        direccionActual = "derecha";
        
        //ya ni se por que hay un metodo inicializar aca 
       // inicializar();
    }

    public int getCoordenadaX(int columna) {
        return coordenadasX[columna];
    }

    public int getCoordenadaY(int fila) {
        return coordenadasY[fila];
    }

//    public void inicializar() {
//        // Crear un nuevo personaje
//        personaje = new Personaje(597, 393, new ImageIcon("./src/main/resources/img/abajo.gif"));
////
//////crear nuevo enemigo
////        // enemigo = new Enemigo(0, 0, new ImageIcon(""));
//    }
//    
//pintar los elemenentos en el laberinto
    public void paintComponent(Graphics g) {
        personaje.show(g);

    }

    public String getDireccionActual() {
        return direccionActual;
    }
    public void setDireccionActual(String direccion) {
        this.direccionActual = direccion;
    }


}
