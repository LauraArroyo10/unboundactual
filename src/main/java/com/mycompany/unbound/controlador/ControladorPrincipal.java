package com.mycompany.unbound.controlador;

import com.mycompany.unbound.modelo.AreaJuego;
import com.mycompany.unbound.modelo.Enemigo;
import com.mycompany.unbound.modelo.LaberintoLogico;
import com.mycompany.unbound.modelo.Personaje;
import com.mycompany.unbound.vista.GUIGuia;
import com.mycompany.unbound.vista.GUIHistoria;
import com.mycompany.unbound.vista.GUIInGameMenu;
import com.mycompany.unbound.vista.GUILaberinto;
import com.mycompany.unbound.vista.GUIPrincipal;
import com.mycompany.unbound.vista.GUIScore;
import com.mycompany.unbound.vista.PanelLaberinto;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class ControladorPrincipal implements ActionListener, KeyListener, MouseListener {

    private GUIPrincipal guiPrincipal;
    private GUIGuia guiGuia;
    private GUILaberinto guiLaberinto;
    private GUIHistoria guiHistoria;
    private GUIInGameMenu guiMenu;
    private GUIScore guiScore;
    private PanelLaberinto panelLaberinto;
    private boolean pausarJuego = false;

    // Variables para el control del juego
    private LaberintoLogico laberintoLogico;
    private AreaJuego areaJuego;
    private Personaje personaje;
    private Enemigo enemigo;

    public ControladorPrincipal() {
        //  GUI
        guiPrincipal = new GUIPrincipal(this);
        guiGuia = new GUIGuia(this);
        guiGuia.escuchar(this);
        guiLaberinto = new GUILaberinto(this);
        guiMenu = new GUIInGameMenu(this);
        guiScore = new GUIScore(this);
        guiHistoria = new GUIHistoria(this);
        panelLaberinto = new PanelLaberinto();
        panelLaberinto.escuchar(this);

        //  componentes 
        laberintoLogico = new LaberintoLogico();
        areaJuego = new AreaJuego();
        personaje = new Personaje();

        // visibilidad inicial frames panel
        guiPrincipal.setVisible(true);
        guiLaberinto.setVisible(false);
        guiGuia.setVisible(false);
        guiMenu.setVisible(false);
        guiScore.setVisible(false);

        // controlador del teclado y mouse 
        guiLaberinto.addKeyListener(this);
        guiLaberinto.addMouseListener(this);
        guiLaberinto.setFocusable(true);
    }

    //___________________________Action Performed/manejo de eventos ____________
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "play":
                guiPrincipal.setVisible(false);
                guiLaberinto.setVisible(true);

                break;

            case "guide":
                guiPrincipal.setVisible(false);
                guiGuia.setVisible(true);
                break;

            case "quit":
                System.exit(0);
                break;

            case "show":
                guiPrincipal.setVisible(false);
                guiGuia.setVisible(true);
                break;

            case "quitguide":
                guiGuia.setVisible(false);
                guiPrincipal.setVisible(true);
                break;

            case "goBack":
                guiHistoria.setVisible(false);
                guiGuia.setVisible(true);
                break;

            case "showstory":
                guiHistoria.setVisible(true);
                guiGuia.setVisible(false);

                break;

            case "showInGameMenu":
                guiLaberinto.setVisible(true);
                guiMenu.setVisible(true);
                break;

            case "showScore":
                guiScore.setVisible(true);
                guiMenu.setVisible(false);
                break;

            case "goBackMenu":
                guiScore.setVisible(false);
                guiMenu.setVisible(true);
                break;

            case "resumeGame":
                guiMenu.setVisible(false);
                guiLaberinto.setVisible(true);
                break;
            case "endGame":
                guiMenu.setVisible(false);
                guiLaberinto.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
        }
    }
//______________________________________________________________________________
    // Métodos del KeyListener para jugar

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.print("Presiono una tecla");
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            areaJuego.setDireccionActual("arriba");
            panelLaberinto.actualizarEstado("arriba");

        } else if (key == KeyEvent.VK_DOWN) {
            areaJuego.setDireccionActual("abajo");
               panelLaberinto.actualizarEstado("abajo");

        } else if (key == KeyEvent.VK_LEFT) {
            areaJuego.setDireccionActual("izquierda");
                panelLaberinto.actualizarEstado("izquierda");

        } else if (key == KeyEvent.VK_RIGHT) {
            areaJuego.setDireccionActual("derecha");
                panelLaberinto.actualizarEstado("derecha");
        }

    //       borrar, //actualizar panel y area con elementos del jeugo
    //        if (areaJuego.getDireccionActual() != null) {
    //            areaJuego.actualizarEstado();
    //            panelLaberinto.repaint();
    //        } else {
    //            System.out.println("direccion nula");
    //        }
    
       panelLaberinto.repaint();
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }

//______________________________________________________________________________
    // obtener informacion de coordenadas con el mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse en X: " + e.getX() + " Y: " + e.getY());
        personaje.setX(e.getX());
        personaje.setY(e.getY());
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Lógica si es necesario
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Lógica si es necesario
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Lógica si es necesario
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Lógica si es necesario
    }
    //__________________________________________________________________________
    //crear personajes/anadir personajes/anadir eleemntos/se muestran en el panel

}

//______________________________________________________________________________
//metodo para pausar y reaunudar juego
