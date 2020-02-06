package org.vipsion.oca;

import org.vipsion.oca.vista.OcaGUI;
import org.vipsion.oca.controlador.Coordinador;
import org.vipsion.oca.modelo.Juego;

public class Principal {

    public static void main(String[] args) {
        Coordinador miCoordinador = new Coordinador();
        Juego miJuego = new Juego();
        OcaGUI miGUI = new OcaGUI();
        miGUI.setCoordinador(miCoordinador);
        miCoordinador.setGUI(miGUI);
        miCoordinador.setJuego(miJuego);
        miGUI.setVisible(true);
        miCoordinador.inicia();
    }
}
