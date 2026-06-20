package Complementos;

import Bebidas.*;

public abstract class Complemento extends Cafe {

    protected Cafe cafe;

    public Complemento(Cafe cafe) {
        super("");
        this.cafe = cafe;
    }
}