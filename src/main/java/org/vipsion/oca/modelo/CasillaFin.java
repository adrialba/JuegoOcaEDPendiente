package org.vipsion.oca.modelo;

public class CasillaFin extends Casilla {

    public CasillaFin(int posicion) {
        super(posicion);
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setFin(true);
    }
}
