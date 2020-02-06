package org.vipsion.oca.modelo;

public class Jugador {

    private final Ficha ficha;
    private final Dado dado;
    private int ultimoValorDado;
    private final int numJugador;

    public Jugador(Ficha ficha, Dado dado, int numJugador) {
        this.dado = dado;
        this.ficha = ficha;
        this.numJugador = numJugador;
    }

    public int juegaTurno(Tablero tablero) {
        ultimoValorDado = dado.dameNumero(numJugador);
        tablero.mueveFicha(ficha, ultimoValorDado);
        return ficha.getPosicion();
    }

    public int getUltimoValorDado() {
        return ultimoValorDado;
    }

    public void setUltimoValorDado(int ultimoValorDado) {
        this.ultimoValorDado = ultimoValorDado;
    }

    public int getUltimaPosicionTablero() {
        return ficha.getPosicion();
    }

    public int getTurnosExtra() {
        return (ficha.getTurnosExtra());
    }

    public void decrementaTurnosExtra() {
        ficha.decrementaTurnosExtra();
    }

    public Boolean esGanador() {
        return ficha.getFin();
    }
}
