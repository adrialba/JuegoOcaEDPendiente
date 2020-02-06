package org.vipsion.oca.modelo;

public class CasillaOca extends Casilla {

    private final int desplazamiento;
    private final int turnosExtra;

    public CasillaOca(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
        this.turnosExtra = 1;
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setTurnosExtra(turnosExtra);
    }

    public int desplazamiento() {
        return desplazamiento;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
