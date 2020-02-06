package org.vipsion.oca.modelo;

public class CasillaOcaFin extends Casilla{

    private final int desplazamiento;

    public CasillaOcaFin(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setFin(true);
    }
}
