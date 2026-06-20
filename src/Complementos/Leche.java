package Complementos;

import Bebidas.*;

public class Leche extends Complemento {

    public Leche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + leche ";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.51;
    }
}