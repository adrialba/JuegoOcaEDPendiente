package org.vipsion.oca.modelo;

public class Ficha {

    private int posicion;
    private int turnosExtra;
    private Boolean fin;
    private int turnosSinTirar; 

    public Boolean getFin() {
        return fin;
    }

    void setFin(Boolean fin) {
        this.fin = fin;
    }

    public Ficha() {
        posicion = 1;
        fin = false;
        turnosExtra = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTurnosExtra() {
        return turnosExtra;
    }

    public void setTurnosExtra(int turnosExtra) {
        this.turnosExtra = turnosExtra;
    }

    public void decrementaTurnosExtra() {
        turnosExtra--;
    }

}
