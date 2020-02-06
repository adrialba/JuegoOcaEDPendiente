package org.vipsion.oca.modelo;

public class Dado {

    public Dado() {
    }

    public int dameNumero(int num) {
        int res;
        if (num == 0) {
            res = 1;
        } else if (num == 1) {
            res = 6;
        } else {
            res = 3;
        }
        return res;
    }
}
