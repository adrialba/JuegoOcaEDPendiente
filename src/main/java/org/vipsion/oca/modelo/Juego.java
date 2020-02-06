package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private final List<Jugador> jugadores;
    private int turno = 0;
    private final Tablero tablero;
    private final int numJugadores = 2;

    public Juego() {
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        Jugador jugador1 = new Jugador(new Ficha(), new Dado(), 0);
        Jugador jugador2 = new Jugador(new Ficha(), new Dado(), 1);
        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }

    private int sigTurno() {
        int sigTurno;
        sigTurno = (turno + 1) % numJugadores;
        if (jugadores.get(turno).getTurnosExtra() > 0) {
            sigTurno = turno;
            jugadores.get(turno).decrementaTurnosExtra();
        }
        return (sigTurno);
    }

    public int avanzaTurno() {
        turno = sigTurno();
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return (turno);
    }

    public int ultimoValorDado() {
        return jugadores.get(turno).getUltimoValorDado();
    }

    public int ultimaPosicionTablero() {
        return jugadores.get(turno).getUltimaPosicionTablero();
    }

    public void juega() {
        jugadores.get(turno).juegaTurno(tablero);
    }

    public Boolean esFin() {
        return jugadores.get(turno).esGanador();
    }
}
