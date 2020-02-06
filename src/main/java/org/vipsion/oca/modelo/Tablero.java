package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private final List<Casilla> casillas;
    private final static int NUMCASILLAS = 63;

    public Tablero() {
        this.casillas = new ArrayList<>();
        for (int i = 0; i < NUMCASILLAS; i++) {
            this.casillas.add(new Casilla(i + 1));
        }
        casillas.set(8, new CasillaOca(9, 5));
        casillas.set(17, new CasillaOca(18, 5));
        casillas.set(26, new CasillaOca(27, 5));
        casillas.set(35, new CasillaOca(36, 5));
        casillas.set(44, new CasillaOca(45, 5));
        casillas.set(53, new CasillaOca(54, 5));
        casillas.set(4, new CasillaOca(5, 4));
        casillas.set(13, new CasillaOca(14, 4));
        casillas.set(22, new CasillaOca(23, 4));
        casillas.set(31, new CasillaOca(32, 4));
        casillas.set(40, new CasillaOca(41, 4));
        casillas.set(49, new CasillaOca(50, 4));
        casillas.set(54, new CasillaOcaFin(59, 4));
        casillas.set(62, new CasillaFin(63));
    }

    public void mueveFicha(Ficha ficha, int numDado) {

        int numCasilla = ficha.getPosicion() + numDado;

        if (numCasilla > NUMCASILLAS) {
            numCasilla = (NUMCASILLAS - ((ficha.getPosicion() + numDado) - NUMCASILLAS));
        }
        casillas.get(numCasilla - 1).posaFicha(ficha);
    }

}
